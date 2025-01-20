package core.javacode;

import java.util.ArrayList;
import java.util.List;

public class JavaGenerics {

    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("Hello");
        list.add(10);

        List<String> strings = new ArrayList<>();
        strings.add("hello");

        // boolean b = strings instanceof List<String>; //Type Erasure
        boolean b = strings instanceof List;



    }
}
