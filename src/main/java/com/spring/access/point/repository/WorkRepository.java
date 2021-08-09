package com.spring.access.point.repository;

import com.spring.access.point.model.WorkDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkRepository extends JpaRepository<WorkDay, Long> {

}
