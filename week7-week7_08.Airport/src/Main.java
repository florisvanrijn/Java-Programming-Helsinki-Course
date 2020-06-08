import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        TextUserInterface control = new TextUserInterface();
        Scanner reader = new Scanner(System.in);
        control.start(reader);
    }
}
