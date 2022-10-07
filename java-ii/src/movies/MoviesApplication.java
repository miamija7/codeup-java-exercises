package movies;
import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
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
        int userInput = Input.getInt();
        System.out.println(userInput);
        while(userInput != 0){
            switch (userInput) {
                case 1:
                    System.out.println(Arrays.toString(MoviesArray.findAll()));
                    break;
                case 2:
                    Movie.addMovie();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
            }
        }
    }
}
