package co.com.personal.consumer;

import co.com.personal.consumer.response.Result;
import co.com.personal.consumer.response.Root;
import co.com.personal.model.character.CharacterDomain;
import co.com.personal.model.character.gateways.CharacterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RestConsumer implements CharacterRepository /* implements Gateway from domain */{

    @Value("${adapter.restconsumer.public-key}")
    private String publicKey;
    @Value("${adapter.restconsumer.private-key}")
    private String privateKey;
    @Value("${adapter.restconsumer.ts}")
    private String ts;

    private final WebClient client;

    @Override
    public Mono<List<CharacterDomain>> getCharacterInformation(String startsName) {
        String hash= encryptMD5(ts+privateKey+publicKey);
        return client
            .get().uri(uriBuilder -> uriBuilder.queryParam("ts", ts)
                        .queryParam("apikey",publicKey)
                        .queryParam("hash", hash)
                        .queryParam("nameStartsWith", startsName)
                        .build())
            .retrieve()
            .bodyToMono(Root.class)
                .map(root -> root.getData().getResults()
                        .stream().map(result1 -> convertToDomain(result1))
                        .collect(Collectors.toList()));

    }

    public CharacterDomain convertToDomain(Result result){
        return CharacterDomain.builder()
                .id(result.getId()).name(result.getName()).description(result.getDescription())
                .modified(result.getModified()).resourceURI(result.getResourceURI())
                .comicsNumber(result.getComics().getItems().size())
                .seriesNumber(result.getSeries().getItems().size())
                .storiesNumber(result.getStories().getItems().size()).eventsNumber(result.getEvents().getItems().size())
                .build();
    }

    public String encryptMD5(String string){
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(string.getBytes());
            byte[] digest = md.digest();
            return DatatypeConverter
                    .printHexBinary(digest).toLowerCase();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }
}