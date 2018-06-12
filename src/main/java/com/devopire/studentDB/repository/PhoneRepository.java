package com.devopire.studentDB.repository;

import com.devopire.studentDB.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, Long>{
}
