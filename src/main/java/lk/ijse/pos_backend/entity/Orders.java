package lk.ijse.pos_backend.entity;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@ToString
public class Orders {
    private String order_id;
    private String cust_id;
    private LocalDate date;
    private BigDecimal discount;
    private BigDecimal total;



}
