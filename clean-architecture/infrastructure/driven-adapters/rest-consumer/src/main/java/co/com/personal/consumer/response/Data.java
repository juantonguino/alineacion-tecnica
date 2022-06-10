package co.com.personal.consumer.response;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class Data {
    private int offset;
    private int limit;
    private int total;
    private int count;
    private List<Result> results;
}
