package app.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String email;

    private String password;

    @ManyToOne
    @JoinColumn(name = "roleID")
    private Role role;

    @OneToOne(mappedBy = "user",fetch = FetchType.LAZY)
    private VerificationToken verificationToken;

    @OneToOne(mappedBy = "user")
    private Cart cart;

}