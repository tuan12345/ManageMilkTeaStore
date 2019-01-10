package app.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "verificationToken")
@Data
@NoArgsConstructor
public class VerificationToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String token;

    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp expiryDate;

    @OneToOne
    @JoinColumn(name = "userID")
    private User user;

}
