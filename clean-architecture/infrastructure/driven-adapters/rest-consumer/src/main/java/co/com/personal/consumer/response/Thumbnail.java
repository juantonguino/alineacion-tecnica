package co.com.personal.consumer.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Thumbnail {
    private String path;
    private String extension;
}
