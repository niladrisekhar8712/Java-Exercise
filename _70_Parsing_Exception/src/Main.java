import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String currentYear = "2022";
        String usersBirthYear = "2002";
        int dob = Integer.parseInt(usersBirthYear);
        int cy = Integer.parseInt(currentYear);
        System.out.println(cy - dob);

        String usersWithPartialAge = "19.8";
        double partialAge = Double.parseDouble(usersWithPartialAge);
        System.out.println(partialAge);
        // For Reading data from user we have System.in, System.console, Command Line Arguments and Scanner
        try{
            System.out.println(getInputFromConsole(cy));
        }
        catch (Exception e){
            System.out.println(getInputFromScanner(cy));
        }
    }
    public static String getInputFromConsole(int currentYear){ //will give error because IntelliJ disable it and have to use terminal
        String name = System.console().readLine("Hi, what's your name?");
        String by1 = System.console().readLine("Hi, what's your birthyear?");
        int by = Integer.parseInt(by1);
        return name + ",you are "+(currentYear - by)+" years old";
    }
    public static String getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, what's your name?");
        String name = scanner.nextLine();
        System.out.println("Enter your birthyear: ");
        int by = scanner.nextInt();
        return name + ",you are "+(currentYear - by)+" years old";
    }
}