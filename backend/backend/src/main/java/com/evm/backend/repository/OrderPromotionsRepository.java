package com.evm.backend.repository;

import com.evm.backend.entity.OrderPromotions;
import com.evm.backend.entity.SalesOrder;
import com.evm.backend.entity.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.math.BigDecimal;
import java.util.List;

@Repository
public interface OrderPromotionsRepository extends JpaRepository<OrderPromotions, Long> {


}