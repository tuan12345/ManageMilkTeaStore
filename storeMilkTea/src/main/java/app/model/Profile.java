package app.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "profile")
@Data
@NoArgsConstructor

public class Profile implements Serializable {
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
    @OneToOne
    @JoinColumn(name = "userID")
    private User user;
}
