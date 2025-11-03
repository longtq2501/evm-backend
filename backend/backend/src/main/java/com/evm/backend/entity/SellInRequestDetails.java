// 15. SELL_IN_REQUEST_DETAILS Entity
package com.evm.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sell_in_request_details")
public class SellInRequestDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "request_detail_id")
    private Long id;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "color", length = 30)
    private String color;

    @ManyToOne
    @JoinColumn(name = "request_id")
    private SellInRequest sellInRequest;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}