// 16. DISTRIBUTION_ORDER Entity
package com.evm.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.OffsetDateTime;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "distribution_order")
public class DistributionOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "distribution_order_id")
    private Long id;

    @Column(name = "dealer_id")
    private Long dealerId;

    @Column(name = "order_date")
    private OffsetDateTime orderDate;

    @Column(name = "shipment_date")
    private OffsetDateTime shipmentDate;

    @Column(name = "delivery_date")
    private OffsetDateTime deliveryDate;

    @Column(name = "status", length = 50)
    private String status;

    @Column(name = "total_quantity")
    private Integer totalQuantity;

    @Column(name = "tracking_number", length = 100)
    private String trackingNumber;

    @ManyToOne
    @JoinColumn(name = "request_id")
    private SellInRequest sellInRequest;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}