package com.example.calculator.controller;

import com.example.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final CalculatorService vacationService;

    @Autowired
    public CalculatorController(CalculatorService vacationService) {
        this.vacationService = vacationService;
    }

    @GetMapping("/calculate")
    public double calculateVacationPay(
            @RequestParam("averageSalary") double averageSalary,
            @RequestParam("vacationDays") int vacationDays) {
        return vacationService.calculateVacationPay(averageSalary, vacationDays);
    }
}
