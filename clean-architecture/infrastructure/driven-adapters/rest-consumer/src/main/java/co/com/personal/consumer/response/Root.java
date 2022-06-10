package co.com.personal.consumer.response;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class Root {
    private int code;
    private String status;
    private String copyright;
    private String attributionText;
    private String attributionHTML;
    private String etag;
    private Data data;
}
