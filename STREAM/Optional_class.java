package STREAM;

import java.util.*;

public class Optional_class {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Navin", "Nikhit", "Laxmi");

        // I need first name which contains "x" in their name
        Optional<String> name = list.stream()
                .filter(str -> str.contains("x"))
                .findFirst();
        System.out.println(name.get());

        // This avoids NullPointerException
        // If there is no name which contains "x" then it will give NullPointerException
        // so to avoid it we should use Optional classes

    }

}
