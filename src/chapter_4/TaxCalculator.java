package chapter_4;

public class TaxCalculator {
    private String name;
    private double taxRate;

    public void setName(String name) {
       this.name = name;
    }

    public String getName() {
        return name;
    }

    public void calculateTax(double salary) {
    if (salary <= 30000){
        double taxRate = 0.15 * salary;
        this.taxRate = taxRate;
    }
    if (salary > 30000){
        double taxRate = 0.20 * salary;
        this.taxRate = taxRate;
    }
    }

    public double checkTaxRate() {
        return taxRate;
    }
}
