package good.stuff.webstore.model.user;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class UserAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String address1;
    @Column
    private String address2;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String state;
    @Column(nullable = false)
    private String country;
    @Column(nullable = false)
    private String postalCode;
    @Column(nullable = false)
    private String phone;
}
