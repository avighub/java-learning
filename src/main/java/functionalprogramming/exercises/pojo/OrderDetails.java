package functionalprogramming.exercises.pojo;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class OrderDetails {
    private List<OrderQueue> orderQueue;
}
