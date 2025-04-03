package functionalprogramming.exercises;

import com.fasterxml.jackson.databind.ObjectMapper;
import functionalprogramming.exercises.pojo.*;

import java.util.List;

public class WorkingWithJSON {
    public static void main(String[] args) {
        // create a new instance of the OrderDetails class with random data
        SubCategory subCategory = SubCategory.builder()
                .name("Electronics")
                .build();
        Statuses statuses = Statuses.builder()
                .status("Pending")
                .date("2021-01-01")
                .build();
        Category category = Category.builder()
                .name("Electronics")
                .subCategory(subCategory)
                .build();
        Order order = Order.builder()
                .productId("123")
                .quantity(2)
                .category(category)
                .statuses(List.of(statuses))
                .build();
        OrderQueue orderQueue = OrderQueue.builder()
                .accountId("123")
                .country("US")
                .orders(List.of(order))
                .build();
        OrderDetails orderDetails = OrderDetails.builder()
                .orderQueue(List.of(orderQueue))
                .build();

        // print the JSON pretty printed using ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(orderDetails);
            System.out.println(json);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
