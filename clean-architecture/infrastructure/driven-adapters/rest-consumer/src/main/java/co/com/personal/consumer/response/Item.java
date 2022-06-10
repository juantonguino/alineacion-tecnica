package co.com.personal.consumer.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private String resourceURI;
    private String name;
    private String type;
}
