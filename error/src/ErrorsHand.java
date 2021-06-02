import javax.swing.*;

public class ErrorsHand {
    public static void main(String[] args) {
        String age = JOptionPane.showInputDialog("Возраст", "Ваше возраст ");

        try {
            int old = Integer.parseInt(age);
            int b = 5;
             int c = old / b;

            System.out.println(c);
        }
//        catch (Exception show_error) { все ошибки
        catch (ArithmeticException show_error) {
            System.out.println(show_error.getMessage());

        }
   // как сделать чтобы на разыне типы ошибок выводил разные сообщения
    }
}
