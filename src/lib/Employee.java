/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

import java.time.LocalDate;


/**
 *
 * @author alienware
 */
public class Employee {
    private PersonalCredentials personalCreds;
    private FamilyCredentials familyCreds;
    private IncomeCredentials incomeDetail;

    public Employee(PersonalCredentials personalInfo) {
        this.personalCreds = personalInfo;
        this.familyCreds = new FamilyCredentials();
        this.incomeDetail = new IncomeCredentials();
    }

    public FamilyCredentials getFamilyInfo() {
        return familyCreds;
    }

    public IncomeCredentials getIncomeDetail() {
        return incomeDetail;
    }

    public void setMonthlySalaryByGrade(int grade) {
        incomeDetail.setMonthlySalaryByGrade(grade, personalCreds.isForeigner);
    }

    public int getAnnualIncomeTax() {
        LocalDate now = LocalDate.now();
        int monthsWorked = (now.getYear() == personalCreds.joinDate.getYear()) ?
            now.getMonthValue() - personalCreds.joinDate.getMonthValue() : 12;

        EmployeeTaxData data = new EmployeeTaxData(
            incomeDetail.monthlySalary,
            incomeDetail.otherMonthlyIncome,
            monthsWorked,
            incomeDetail.annualDeductible,
            familyCreds.isMarried(),
            familyCreds.getNumberOfChildren()
        );

        return TaxFunction.calculateTax(data);
    }
}
