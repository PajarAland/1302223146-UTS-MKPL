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
public class TaxFunction {

    public static int calculateTax(EmployeeTaxData data) {

    data.numberOfMonthWorking = validateWorkingMonths(data.numberOfMonthWorking);
    data.numberOfChildren = validateNumberOfChildren(data.numberOfChildren);

    int annualIncome = calculateAnnualIncome(data.monthlySalary, data.otherMonthlyIncome, data.numberOfMonthWorking);
    int nonTaxableIncome = calculateNonTaxableIncome(data.isMarried, data.numberOfChildren);

    int taxableIncome = annualIncome - data.deductible - nonTaxableIncome;
    int tax = calculateFinalTax(taxableIncome);

    return tax;
}

    private static int validateWorkingMonths(int months) {
        if (months > 12) {
            System.err.println("More than 12 months working per year");
            return 12;
        }
        return months;
    }

    private static int validateNumberOfChildren(int children) {
        return Math.min(children, 3);
    }

    private static int calculateAnnualIncome(int salary, int otherIncome, int monthsWorked) {
        return (salary + otherIncome) * monthsWorked;
    }

    private static int calculateNonTaxableIncome(boolean isMarried, int children) {
        int basePTKP = 54000000;
        int marriageAllowance = isMarried ? 4500000 : 0;
        int childAllowance = children * 1500000;

        return basePTKP + marriageAllowance + childAllowance;
    }

    private static int calculateFinalTax(int taxableIncome) {
        if (taxableIncome <= 0) {
            return 0;
        }
        return (int) Math.round(0.05 * taxableIncome);
    }
}