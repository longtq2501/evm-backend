// 6. VEHICLE Entity
package com.evm.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "vehicle")
public class Vehicle {
    @Id
    @Column(name = "vehicle_id", length = 50)
    private String id;

    @Column(name = "vin", length = 50)
    private String vin;

    @Column(name = "battery_serial", length = 50)
    private String batterySerial;

    @Column(name = "color", length = 30)
    private String color;

    @Column(name = "manufacture_date")
    private LocalDate manufactureDate;

    @Column(name = "status", length = 50)
    private String status;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "dealer_id")
    private Dealer dealer;

    @OneToMany(mappedBy = "vehicle")
    private Set<SalesOrder> salesOrders;

    @OneToMany(mappedBy = "vehicle")
    private Set<SupportTicket> supportTickets;
}