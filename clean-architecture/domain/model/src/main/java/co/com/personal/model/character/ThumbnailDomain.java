package co.com.personal.model.character;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ThumbnailDomain {
    private String path;
    private String extension;
}
