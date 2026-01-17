package com.budgetwise;

import java.util.*;

public class BudgetWiseApp {

    public static void main(String[] args) {

        Map<String, Double> categories = new HashMap<>();
        categories.put("Food", 5000.0);
        categories.put("Travel", 3000.0);

        Budget budget = new MonthlyBudget(30000, 20000, categories);

        budget.addTransaction(new Transaction(2500, "expense", "Food"));
        budget.addTransaction(new Transaction(3500, "expense", "Travel"));
        budget.addTransaction(new Transaction(5000, "expense", "Food"));

        budget.generateReport();     // Polymorphism
        budget.detectOverspend();
    }
}