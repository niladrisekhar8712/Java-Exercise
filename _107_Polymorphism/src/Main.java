import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Movie movie = new ScienceFiction("Star Wars");
//        movie.watchmMovie();

//        Movie movie = Movie.getMovie("Science","Start Wars");
//        movie.watchmMovie();
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.print("""
                    Enter Type:
                    \u2022 A for adventure
                    \u2022 C for Comedy
                    \u2022 S for Science Fiction
                    \u2022 Q for quit
                    Enter type:\s""");
            String type = s.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.print("Enter Movie title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type,title);
            movie.watchMovie();

        }
    }
}