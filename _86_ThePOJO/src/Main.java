public class Main {
    public static void main(String[] args) {
        for(int i = 1;i<=5;i++){
            Student s = new Student("S1245"+i,
                    switch(i){
                case 1 -> "John";
                case 2 -> "Mary";
                case 3 -> "Hopkins";
                case 4 -> "Joe";
                case 5 -> "Karen";
                default -> "AnyName";
                    },"1/1/2000","Java Masterclass");
            System.out.println(s);
        }

        for(int i = 1;i<=5;i++){
            LPStudent s = new LPStudent("S1245"+i,
                    switch(i){
                        case 1 -> "John";
                        case 2 -> "Mary";
                        case 3 -> "Hopkins";
                        case 4 -> "Joe";
                        case 5 -> "Karen";
                        default -> "AnyName";
                    },"1/1/2000","Java Masterclass");
            System.out.println(s);
        }
        Student s = new Student("1234S","John", "1/1/2002","Java");
        LPStudent sLP = new LPStudent("1234S","John", "1/1/2002","Java");
        System.out.println(s.getName()+" "+s.getClassList());
        System.out.println(sLP.name() + " " + sLP.classList());
        /* Records do not have setters
        Fields of a record are private final
         */
    }
}