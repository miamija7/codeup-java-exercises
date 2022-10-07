package movies;
import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        int menuSelect = displayMenu();
        while(menuSelect != 0){
            if (menuSelect == 1) { System.out.println(Arrays.toString(MoviesArray.findAll())); }
            else if (menuSelect == 2) { Movie.addMovie(); }
            else if (menuSelect == 3) { MoviesArray.findAll("animated"); }
            else if (menuSelect == 4) { MoviesArray.findAll("drama"); }
            else if (menuSelect == 5) { MoviesArray.findAll("horror"); }
            else { MoviesArray.findAll("scifi"); }
            System.out.print("Enter your next choice: ");
            menuSelect = Input.getInt();
        }
    }

    public static int displayMenu() {
        System.out.print("============= MOVIES APP =============\n" +
                "    (select a menu option)" +
                "    0 - exit\n" +
                "    1 - view all movies\n" +
                "    2 - add a movie\n" +
                "    3 - view movies in the animated category\n" +
                "    4 - view movies in the drama category\n" +
                "    5 - view movies in the horror category\n" +
                "    6 - view movies in the scifi category\n" +
                "\n" +
                "Enter your choice: ");
        return Input.getInt();
    }
}
