public class ContractedEmployee extends Employee{
  private String federalTaxId;
  private double hourlyRate;
  private double numberOfHoursWorked;

  public ContractedEmployee(String employeeId, String name, String federalTaxId) {
    super(employeeId, name);
    this.federalTaxId = federalTaxId;
  }

  public String getFederalTaxId() {
    return federalTaxId;
  }

  public void setFederalTaxId(String federalTaxId) {
    this.federalTaxId = federalTaxId;
  }

  public double getHourlyRate() {
    return hourlyRate;
  }

  public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
  }

  public double getNumberOfHoursWorked() {
    return numberOfHoursWorked;
  }

  public void setNumberOfHoursWorked(double numberOfHoursWorked) {
    this.numberOfHoursWorked = numberOfHoursWorked;
  }

  @Override
  public void calculatePay() {
    averageMonthlySalary = hourlyRate * numberOfHoursWorked;
  }

  @Override
  public String toString() {
    return "Contracted Employee : " + "Federal Tax Id : " + federalTaxId +
        ", Hourly Rate :" + hourlyRate +
        ", Amount Of Hours Worked : " + numberOfHoursWorked +
        ", Employee Id :  " + employeeId +
        ", Name : " + name + ", Average Monthly Salary :" + String.format("%.2f", averageMonthlySalary);
  }
}