// 3. DEALER Entity
package com.evm.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Set;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "dealer")
public class Dealer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dealer_id")
    private Long id;

    @Column(name = "dealer_name", length = 150)
    private String dealerName;

    @Column(name = "address", length = 255)
    private String address;

    @Column(name = "phone_number", length = 20)
    private String phoneNumber;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "dealer_level", length = 50)
    private String dealerLevel;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @OneToMany(mappedBy = "dealer")
    private Set<User> users;

    @OneToMany(mappedBy = "dealer")
    private Set<Vehicle> vehicles;

    @OneToMany(mappedBy = "dealer")
    private Set<Appointment> appointments;

    @OneToMany(mappedBy = "dealer")
    private Set<SellInRequest> sellInRequests;

    @OneToMany(mappedBy = "dealer")
    private Set<DealerContract> dealerContracts;
}