package com.evm.backend.repository;

import com.evm.backend.entity.SellInRequest;
import com.evm.backend.entity.Dealer;
import com.evm.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface SellInRequestRepository extends JpaRepository<SellInRequest, Long> {

}