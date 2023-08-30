public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String endDate, long employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super("Niladri", "2002", endDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    @Override
    public double collectPay() {
        return annualSalary+super.collectPay();
    }

    @Override
    public void terminate(String endDate) {
        if("2023".compareTo(endDate)>0){
            isRetired = true;
        }

        super.terminate(endDate);
    }

    public void retire(){
        terminate(endDate);
        if(isRetired){
            System.out.println("You're Retired. Thank you for your service.");
            return;
        }
        System.out.println("You are not yet retired.");
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired + '\'' +
                "} " + super.toString();
    }
}
