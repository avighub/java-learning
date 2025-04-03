package functionalprogramming.exercises.pojo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Category {
    private String name;
    private SubCategory subCategory;
}
