//и тут я на .class.class.class.class.class.
/**
 * JavaDock
 */
/*
    public означает, что метод можно увидеть за пределами этого класса;
    static означает, что вам не нужно создавать новый объект;
    void означает, что метод не возвращает никакого значения;
    части между круглыми скобками main - это то, что называется аргументами командной строки.

 */

import java.util.Scanner;
public class HW {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in, "Cp1251");
        String first_name;
        System.out.print("Введите имя: ");
        first_name = user_input.next();
        String family_name;
        System.out.print("Введите фамилию: ");
        family_name = user_input.next();
        String full;
        full = first_name + " " + family_name;
        System.out.println("Вас зовут " + full);
    }
}
