package com.spring.access.point.controller;

import java.util.List;
import java.util.NoSuchElementException;

import com.spring.access.point.model.WorkDay;
import com.spring.access.point.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/work")
public class WorkDayController {

    @Autowired
    WorkService workService;

    @PostMapping
    public WorkDay createWork(@RequestBody WorkDay workDay) {
        return workService.saveWork(workDay);
    }

    @GetMapping
    public List<WorkDay> getWorkList() {
        return workService.findAll();
    }

    @GetMapping("/{idWork}")
    public ResponseEntity<WorkDay> getWorkByID(@PathVariable("idWork") Long idWork) throws Exception {
        return ResponseEntity
                .ok(workService.getById(idWork).orElseThrow(() -> new NoSuchElementException("Not found!")));
    }

    @PutMapping
    public WorkDay updateWork(@RequestBody WorkDay workDay) {
        return workService.updateWork(workDay);
    }

    @DeleteMapping("/{idWork}")
    public ResponseEntity deleteWorkByID(@PathVariable("idWork") Long idWork) throws Exception {
        try {
            workService.deleteWork(idWork);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<WorkDay>) ResponseEntity.ok();
    }
}
