package app.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private Integer id;

    @NonNull
    private String email;

    @NonNull
    private String password;

    @NonNull
    private boolean enable;

    @ManyToOne
    @JoinColumn(name = "roleID", referencedColumnName = "id")
    private Role role;

    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY)
    private VerificationToken verificationToken;

    @OneToOne(mappedBy = "user")
    private Cart cart;

}