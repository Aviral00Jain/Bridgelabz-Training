class EmployeeBonusCalculator {

    public static final int TOTAL_EMPLOYEES = 10;
    

    // Method to generate salary and years of service
    public static double[][] generateEmployeeData() {

        double[][] employeeData = new double[TOTAL_EMPLOYEES][2];

        for (int i = 0; i < TOTAL_EMPLOYEES; i++) {
            employeeData[i][0] =
                    (int) (Math.random() * 90000) + 10000;
            employeeData[i][1] =
                    (int) (Math.random() * 11) + 1; 
        }
        return employeeData;
    }

    // method to calculate new salary and bonus
    public static double[][] calculateNewSalaryAndBonus(double[][] employeeData) {

        double[][] salaryData = new double[TOTAL_EMPLOYEES][2];

        for (int i = 0; i < TOTAL_EMPLOYEES; i++) {

            double oldSalary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];

            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02;

            double bonus = oldSalary * bonusPercentage;
            double newSalary = oldSalary + bonus;

            salaryData[i][0] = newSalary;
            salaryData[i][1] = bonus;
        }
        return salaryData;
    }

    // Method to calculate totals and display result
    public static void displaySalaryReport(
        double[][] employeeData,
        double[][] salaryData) {

    double totalOldSalary = 0;
    double totalNewSalary = 0;
    double totalBonus = 0;

    System.out.println("\nZARA COMPANY – EMPLOYEE BONUS REPORT");
    System.out.println("--------------------------------------------------");
    System.out.println("Emp  Old Salary  Service(Yrs)  Bonus Paid  New Salary");
    System.out.println("--------------------------------------------------");

    for (int i = 0; i < TOTAL_EMPLOYEES; i++) {

        int oldSalary = (int)employeeData[i][0];
        int yearsOfService = (int)employeeData[i][1];
        int bonus = (int)salaryData[i][1];
        int newSalary =(int) salaryData[i][0];

        totalOldSalary += oldSalary;
        totalBonus += bonus;
        totalNewSalary += newSalary;

        System.out.println((i + 1) +"     "+oldSalary+"   "+"    "+yearsOfService+"      " + bonus+"      " + newSalary);
    }

    System.out.println("-----------------------------------------------------------");
    System.out.println("Total Old Salary Paid : " + totalOldSalary);
    System.out.println("Total Bonus Amount    : " + totalBonus);
    System.out.println("Total New Salary Paid : " + totalNewSalary);
}
    public static void main(String[] args) {

        //Calling methods
        double[][] employeeData = generateEmployeeData();
        double[][] salaryData = calculateNewSalaryAndBonus(employeeData);

        // displaying result using result method
        displaySalaryReport(employeeData, salaryData);
    }
}