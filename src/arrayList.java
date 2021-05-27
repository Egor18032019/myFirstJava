//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;

public class arrayList {
    public arrayList() {
    }

    public static void main(String[] args) {
        ArrayList<Object> listTest = new ArrayList<>();
        listTest.add("первый элемент");
        listTest.add("второй элемент");
        listTest.add("третий элемент");
        listTest.add(7);
        Object foo = listTest.get(3);
        System.out.println(foo);

        for (Object o : listTest) {
            System.out.println(o);
        }

        listTest.remove("второй элемент");
        System.out.println(listTest);
        listTest.remove(2);
        System.out.println(listTest);
    }
}

