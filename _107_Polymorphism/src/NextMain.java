public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A","Jaws");
        movie.watchMovie();
//        Adventure jaws = Movie.getMovie("A","Jaws"); //error
        Adventure jaws = (Adventure) Movie.getMovie("A","Jaws");
        jaws.watchMovie();
        Object comedy = Movie.getMovie("C","Airplane");
//        Movie comedyMovie = (Movie) comedy;
//        comedy.watchMovie(); //error
//        comedyMovie.watchComedy(); // still an error
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy(); //not an error

        var airplane = Movie.getMovie("C","Airplane");
        airplane.watchMovie();
        var plane = new Comedy("Airplane");
        plane.watchComedy();

        Object unknownObject = Movie.getMovie("S","Airplane");
        if(unknownObject.getClass().getSimpleName().equals("Comedy")){
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure)unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction scyfy) {
            scyfy.watchScienceFiction();
        }
    }
}
