package com.evm.backend.repository;

import com.evm.backend.entity.Role;
import com.evm.backend.entity.RoleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {


}