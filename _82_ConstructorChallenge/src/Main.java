public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John",50000,"jfk45689@yahoo.com");
        Customer customer2 = new Customer("Mary","mary7678@gmail.com");
        Customer customer3 = new Customer();
        System.out.println(customer1.getName() + customer1.getCreditLimit() + customer1.getEmailAddress());
        System.out.println(customer2.getName() + customer2.getCreditLimit() + customer2.getEmailAddress());
        System.out.println(customer3.getName() + customer3.getCreditLimit() + customer3.getEmailAddress());

    }
}