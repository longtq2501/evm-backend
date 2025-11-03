package com.evm.backend.repository;

import com.evm.backend.entity.Appointment;
import com.evm.backend.entity.Customer;
import com.evm.backend.entity.Dealer;
import com.evm.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.time.OffsetDateTime;
import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {


}