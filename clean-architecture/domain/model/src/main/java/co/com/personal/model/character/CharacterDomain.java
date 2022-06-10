package co.com.personal.model.character;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder(toBuilder = true)
public class CharacterDomain {
    public int id;
    public String name;
    public String description;
    public Date modified;
    public ThumbnailDomain thumbnail;
    public String resourceURI;
    public int comicsNumber;
    public int seriesNumber;
    public int storiesNumber;
    public int eventsNumber;
}
