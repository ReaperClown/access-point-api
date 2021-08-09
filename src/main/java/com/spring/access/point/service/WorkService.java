package com.spring.access.point.service;

import java.util.List;
import java.util.Optional;
import com.spring.access.point.model.WorkDay;
import com.spring.access.point.repository.WorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkService {

    WorkRepository workRepository;

    @Autowired
    public WorkService(WorkRepository workRepository) {
        this.workRepository = workRepository;
    }

    public WorkDay saveWork(WorkDay workDay) {
        return workRepository.save(workDay);
    }

    public List<WorkDay> findAll() {
        return workRepository.findAll();
    }

    public Optional<WorkDay> getById(Long idWork) {
        return workRepository.findById(idWork);
    }

    public WorkDay updateWork(WorkDay workDay) {
        return workRepository.save(workDay);
    }

    public void deleteWork(Long idWork) {
        workRepository.deleteById(idWork);
    }
}
