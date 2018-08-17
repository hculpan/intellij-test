package test;

import java.net.URL;

public class Main {
    public static void main(String [] args) {
        URL url = ClassLoader.getSystemResource("test.txt");
        if (url != null) {
            System.out.println("All is well");
        } else {
            System.out.println("Uh-oh");
        }
    }
}
