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
    private PersonalInfo personalInfo;
    private FamilyInfo familyInfo;
    private IncomeDetail incomeDetail;

    public Employee(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
        this.familyInfo = new FamilyInfo();
        this.incomeDetail = new IncomeDetail();
    }

    public FamilyInfo getFamilyInfo() {
        return familyInfo;
    }

    public IncomeDetail getIncomeDetail() {
        return incomeDetail;
    }

    public void setMonthlySalaryByGrade(int grade) {
        incomeDetail.setMonthlySalaryByGrade(grade, personalInfo.isForeigner);
    }

    public int getAnnualIncomeTax() {
        LocalDate now = LocalDate.now();
        int monthsWorked = (now.getYear() == personalInfo.joinDate.getYear()) ?
            now.getMonthValue() - personalInfo.joinDate.getMonthValue() : 12;

        EmployeeTaxData data = new EmployeeTaxData(
            incomeDetail.monthlySalary,
            incomeDetail.otherMonthlyIncome,
            monthsWorked,
            incomeDetail.annualDeductible,
            familyInfo.isMarried(),
            familyInfo.getNumberOfChildren()
        );

        return TaxFunction.calculateTax(data);
    }
}
