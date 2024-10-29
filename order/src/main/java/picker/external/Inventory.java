package picker.external;

import java.util.Date;
import lombok.Data;

@Data
public class Inventory {

    private Long id;
    private String productName;
    private Integer stock;
}
