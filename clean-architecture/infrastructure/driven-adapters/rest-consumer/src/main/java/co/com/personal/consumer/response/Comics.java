package co.com.personal.consumer.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comics {
    private int available;
    private String collectionURI;
    private List<Item> items;
    private int returned;
}
