package com.example.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public double calculateVacationPay(double averageSalary, int vacationDays) {
        double dailySalary = averageSalary / 29.3;

        return dailySalary * vacationDays;
    }
}
