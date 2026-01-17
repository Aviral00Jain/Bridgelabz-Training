package com.budgetwise;

import java.util.HashMap;

class MonthlyBudget extends Budget {

    public MonthlyBudget(double income, double limit, Map<String, Double> categories) {
        super(income, limit, categories);
    }

    @Override
    public void generateReport() {
        System.out.println("📅 Monthly Budget Report");
        System.out.println("Income: " + income);
        System.out.println("Expenses: " + totalExpenses());
        System.out.println("Savings: " + netSavings());
    }

    @Override
    public void detectOverspend() {
        Map<String, Double> spent = new HashMap<>();

        for (Transaction t : transactions) {
            if (t.getType().equals("expense")) {
                spent.put(t.getCategory(),
                        spent.getOrDefault(t.getCategory(), 0.0) + t.getAmount());
            }
        }

        for (String cat : spent.keySet()) {
            if (spent.get(cat) > categoryLimits.getOrDefault(cat, Double.MAX_VALUE)) {
                System.out.println("⚠ Overspend in category: " + cat);
            }
        }
    }
}