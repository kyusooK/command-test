package picker.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import picker.domain.*;
import picker.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String userId;
    private Integer qty;
    private String productName;
    private Long productId;

    public OrderPlaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
//>>> DDD / Domain Event
