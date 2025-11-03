package com.evm.backend.repository;

import com.evm.backend.entity.Payment;
import com.evm.backend.entity.PaymentContext;
import com.evm.backend.entity.SalesOrder;
import com.evm.backend.entity.DistributionOrder;
import com.evm.backend.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

}