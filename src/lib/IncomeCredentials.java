/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

/**
 *
 * @author alienware
 */
public class IncomeCredentials {
    public int monthlySalary;
    public int otherMonthlyIncome;
    public int annualDeductible;

    public void setMonthlySalaryByGrade(int grade, boolean isForeigner) {
        int baseSalary;
        if (grade == 1) baseSalary = 3000000;
        else if (grade == 2) baseSalary = 5000000;
        else baseSalary = 7000000;

        monthlySalary = isForeigner ? (int) (baseSalary * 1.5) : baseSalary;
    }
}
