public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge(){
        return 2023 - Integer.getInteger(birthDate);
    }
    public double collectPay(){
        return 10000.00;
    }
    public void terminate(String endDate){
        System.out.println("Your service expiry year: " + endDate);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
