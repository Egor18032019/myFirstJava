public class forAndWhile {
    public static void main(String[] args) {
        // вызываем метод и преобразовываем в строку
        String result = String.valueOf(showTotalAmount(100));

    }

    public static int showTotalAmount(int end_value) {
        int loopVal;
         int summa = 0;
        for (loopVal = 0; loopVal <= end_value; loopVal++) {
            summa = summa + loopVal;
            System.out.println("Значение цикла = " + summa);
        }
        return summa;
    }
}
