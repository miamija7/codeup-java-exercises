package movies;

import util.Input;

public class Movie {
    // Variables/Fields
    private String name;
    private String category;

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

    public static Movie addMovie() {
        System.out.println("======= Add A Movie =======");
        System.out.print("Movie Name: ");
        String name = Input.getString();
        System.out.print("Category: ");
        String category = Input.getString();
        return new Movie(name.toLowerCase(), category.toLowerCase());
    }
}
