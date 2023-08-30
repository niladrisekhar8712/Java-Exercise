public class Main {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(60));
        System.out.println(convertToCentimeters(6,1));
    }
    public static double convertToCentimeters(int height){
        return height * 2.54;
    }
    public static double convertToCentimeters(int foot, int inches){
        return convertToCentimeters(foot*12 + inches);
    }
}