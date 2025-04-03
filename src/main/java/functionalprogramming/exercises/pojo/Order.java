package functionalprogramming.exercises.pojo;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Order {
    private String productId;
    private long quantity;
    private Category category;
    private List<Statuses> statuses;
}
