package co.com.personal.api;

import co.com.personal.model.character.CharacterDomain;
import co.com.personal.usecase.character.CharacterUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;

@Component
@RequiredArgsConstructor
public class Handler {
 private  final CharacterUseCase characterUseCase;
//private  final UseCase2 useCase2;
    public Mono<ServerResponse> listenGETCountCharacter(ServerRequest serverRequest) {
        String startName=serverRequest.queryParam("startsName").get();

        Flux<CharacterDomain> characterDomainFlux =characterUseCase.getCountInformation(startName)
                .flatMapMany(temp-> Flux.fromStream(temp.stream()));
        return ServerResponse.ok()
                        .body(characterDomainFlux, CharacterDomain.class);
    }
}
