package com.evm.backend.repository;

import com.evm.backend.entity.DealerContract;
import com.evm.backend.entity.Brand;
import com.evm.backend.entity.Dealer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface DealerContractRepository extends JpaRepository<DealerContract, Long> {


}