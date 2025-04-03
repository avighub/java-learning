package functionalprogramming.exercises.pojo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Statuses {
    private String status;
    private String date;
}
