package com.evm.backend.repository;

import com.evm.backend.entity.DistributionOrder;
import com.evm.backend.entity.Brand;
import com.evm.backend.entity.SellInRequest;
import com.evm.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface DistributionOrderRepository extends JpaRepository<DistributionOrder, Long> {


}