package com.example.UberProject_AuthService.repositories;

import com.example.UberProject_EntityService.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver,Long> {
}
