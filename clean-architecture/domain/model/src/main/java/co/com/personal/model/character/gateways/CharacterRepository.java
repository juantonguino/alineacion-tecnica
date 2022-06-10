package co.com.personal.model.character.gateways;

import co.com.personal.model.character.CharacterDomain;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface CharacterRepository {

    Mono<List<CharacterDomain>> getCharacterInformation(String startsName);
}
