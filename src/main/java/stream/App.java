package stream;


import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println("---------------");
        Map<String, String> map = new HashMap<>();

        Optional optional = Optional.empty();
        ;
//        optional = Optional.of(map);

        if (optional.isEmpty()) {
            System.out.println("isEmpty");
        } else {
            System.out.println("not isEmpty");
        }

        if (optional.isPresent()) {
            System.out.println("isPresent");
        } else {
            System.out.println("not isPresent");
        }
    }
}
