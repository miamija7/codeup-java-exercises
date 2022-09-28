public class ConsoleIOLecture {
    public static void main(String[] args){
        String name = "David";
        System.out.print("Hi, I'm " + name + "\n");
        System.out.println("Hi, I'm " + name);
        System.out.format("Hi, I'm %s. I'm %d years old. I'm a %s.%n", name, 25, "Scorpio");

        float percent = 99.99F;
        System.out.format("I'm %f%% sure it takes two %%'s to print a %% in System.out.format()%n", percent);
        System.out.format("I'm %.2f%% sure if you want to fix a decimal you will use %%.<number>f%n", percent);
    }
}
