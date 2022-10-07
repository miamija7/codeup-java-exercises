package movies;

import util.Input;

public class Movie {
    // Variables/Fields
    private String name;
    private String category;
    private static final String[] categories = { "animated", "drama", "horror", "scifi" };

    // Constructor
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    // Methods
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static void addMovie() {
        System.out.println("======= Add A Movie =======");
        System.out.print("Movie Name: ");
        String name = Input.getString();
        System.out.print("Categories \n0 animated\n1 drama \n2 horror\n3 scifi\nMovie Category: ");
        String category = categories[Input.getInt()];
        Input.clear();
        MoviesArray.add(new Movie(name.toLowerCase(), category.toLowerCase()));
    }
}
