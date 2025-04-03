package functionalprogramming.exercises.pojo;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class OrderQueue {
    private String accountId;
    private String country;
    private List<Order> orders;
}
