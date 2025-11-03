package com.evm.backend.repository;

import com.evm.backend.entity.User;
import com.evm.backend.entity.Role;
import com.evm.backend.entity.Dealer;
import com.evm.backend.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}