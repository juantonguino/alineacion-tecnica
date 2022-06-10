package co.com.personal.model.character;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDomain {
    private String resourceURI;
    private String name;
    private String type;
}
