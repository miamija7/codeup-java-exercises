import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        // Exercise 1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int nextInt = scanner.nextInt();
        System.out.println(nextInt);

        // Exercise 2
        System.out.print("Enter three words: ");
        String  word1 = scanner.next(),
                word2 = scanner.next(),
                word3 = scanner.next();
        System.out.format("Word1: %s\nWord 2: %s\nWord 3: %s\n", word1, word2, word3);

        // Exercise 3
        scanner.nextLine();
        System.out.print("Gimme a Sentence: ");
        String sentence = scanner.nextLine();
        System.out.println(sentence);


    }
}