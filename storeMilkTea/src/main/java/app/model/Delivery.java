package app.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table
@Data
@NoArgsConstructor

public class Delivery implements Serializable {
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
