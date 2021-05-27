
 import java.util.Arrays;
import javax.swing.JOptionPane;

public class arrayAndLoop {

    public static void main(String[] args) {
        int[] aryNumbs = new int[6];
         aryNumbs[0] = 10;
        aryNumbs[1] = 14;
        String[] aryStrings = new String[]{"Осень", "Весна", "Лето", "Зима"};
//        boolean[] aryBoolos = new boolean[]{false, true, false, true};
        System.out.println(aryNumbs[2]);
        System.out.println(aryStrings[2]);

        for(int j = 0; j < aryNumbs.length; ++j) {
            System.out.print(aryNumbs[j] + " , ");
            if (j == aryNumbs.length - 1) {
                System.out.println(aryNumbs[j] + " ");
            }
        }

        System.out.println("Значение цикла = " + Arrays.toString(aryNumbs));
        ArraysTest(4);
    }

    public static void ArraysTest(int value) {
        int[] lottery_numbers = new int[value];

        for(int i = 0; i < lottery_numbers.length; ++i) {
            String number = JOptionPane.showInputDialog("Цифра", "В ведите цифру: ");

            try {
                lottery_numbers[i] = Integer.parseInt(number);
                System.out.println(lottery_numbers[i]);
            } catch (NumberFormatException var5) {
                JOptionPane.showMessageDialog(null, "Вводи цеое число !");
                --i;
            }
        }

    }
}
