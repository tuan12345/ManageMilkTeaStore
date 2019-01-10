package app.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table
@Data
@NoArgsConstructor
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String fullName;

    private String phone;

    private String century;

    private String city;

    private String district;

    private String ward;

    private String address;

    @OneToMany(mappedBy = "delivery")
    private List<Order> orders;
}
