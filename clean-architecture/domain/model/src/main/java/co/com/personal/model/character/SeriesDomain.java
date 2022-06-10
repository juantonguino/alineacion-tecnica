package co.com.personal.model.character;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeriesDomain {
    private int available;
    private String collectionURI;
    private List<ItemDomain> items;
    private int returned;
}
