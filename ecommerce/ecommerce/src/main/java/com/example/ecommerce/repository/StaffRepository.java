package com.example.ecommerce.repository;

import com.example.ecommerce.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface StaffRepository extends JpaRepository<StoreStaff, Integer> {
}
