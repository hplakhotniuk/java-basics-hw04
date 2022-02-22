public class SalariedEmployee extends Employee {
  private String socialSecurityNumber;
  private double fixedMonthlyPayment;

  public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
    super(employeeId, name);
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public double getFixedMonthlyPayment() {
    return fixedMonthlyPayment;
  }

  public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
    this.fixedMonthlyPayment = fixedMonthlyPayment;
  }

  @Override
  public void calculatePay() {
    averageMonthlySalary = fixedMonthlyPayment;
  }

  @Override
  public String toString() {
    return "Salaried Employee : " +  "Employee Id : " + employeeId + ", Name : " + name +
        ", Average Monthly Salary : " + averageMonthlySalary + ", Social Security Number :" + socialSecurityNumber +
        ", Fixed Monthly Payment :" + String.format("%.2f", fixedMonthlyPayment);
  }
}