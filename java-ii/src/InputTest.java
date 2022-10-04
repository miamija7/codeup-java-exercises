import util.Input;

public class InputTest {
    public static void main(String[] args) {
        Input in = new Input();
        System.out.println(in.getString("prompt"));
        System.out.println(in.yesNo("prompt"));
        System.out.println(in.getInt(1, 10, "prompt"));
        System.out.println(in.getInt("prompt"));
        System.out.println(in.getDouble(1.0, 10.0, "prompt"));
        System.out.println(in.getDouble("prompt"));
    }
}
