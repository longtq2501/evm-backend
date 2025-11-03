package com.evm.backend.repository;

import com.evm.backend.entity.VehicleServiceHistory;
import com.evm.backend.entity.Vehicle;
import com.evm.backend.entity.Dealer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface VehicleServiceHistoryRepository extends JpaRepository<VehicleServiceHistory, Long> {

}