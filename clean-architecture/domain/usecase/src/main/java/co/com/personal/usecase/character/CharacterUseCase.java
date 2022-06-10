package co.com.personal.usecase.character;

import co.com.personal.model.character.CharacterDomain;
import co.com.personal.model.character.gateways.CharacterRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RequiredArgsConstructor
public class CharacterUseCase {
    private final CharacterRepository characterRepository;

    public Mono<List<CharacterDomain>> getCountInformation(String startName){
        return characterRepository.getCharacterInformation(startName);
    }
}
