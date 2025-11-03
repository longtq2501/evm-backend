// 14. SELL_IN_REQUEST Entity
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
@Table(name = "sell_in_request")
public class SellInRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "request_id")
    private Long id;

    @Column(name = "request_date")
    private LocalDate requestDate;

    @Column(name = "status", length = 50)
    private String status;

    @ManyToOne
    @JoinColumn(name = "dealer_id")
    private Dealer dealer;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User approver;

    @OneToMany(mappedBy = "sellInRequest")
    private Set<SellInRequestDetails> sellInRequestDetails;

    @OneToMany(mappedBy = "sellInRequest")
    private Set<DistributionOrder> distributionOrders;
}