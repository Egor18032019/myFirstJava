import javax.swing.*;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        String age = JOptionPane.showInputDialog("Возраст", "Ваше возраст ");

        int user = Integer.parseInt(age);
        boolean foo = user >= 30;
        System.out.println(foo + " foo");

        Scanner user_input = new Scanner(System.in);
        // не обяательно указывать язык "Cp1251"
        String colour;
        System.out.print("Черный или Белый ?");
        colour = user_input.next();

        switch (user) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println(user + " это до 10 лет");
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                System.out.println(age + " это между 11 и 20 годами");
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                System.out.println(age + " это между 21 и 30 годами");
                break;
            default:
                System.out.println("Вам более 30 лет");
        }

        if (colour.equals("Черный")) {
            System.out.println("Должно быть, вы брюнет(ка)!");
        } else if (colour.equals("Белый")) {
            System.out.println("Вы светлый человек " + colour);
        } else if (colour.equals("Красный")) {
            System.out.println("Вы веселый и общительный");
        } else if (colour.equals("Синий")) {
            System.out.println("Вы творческий человек");
        } else {
            System.out.println("Извините, цвет непонятен. " + colour);
        }

    }
}

