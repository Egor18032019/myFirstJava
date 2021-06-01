import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        int result;
        String Word1 = "Acc";
        String Word2 = "acc";

//        result = Word1.compareTo(Word2);
        result = Word1.compareToIgnoreCase(Word2);

        if (result < 0) {
            System.out.println(Word1 + " перед " + Word2);
        } else if (result > 0) {
            System.out.println(Word1 + " после " + Word2);
        } else if (result == 0) {
            System.err.println("Слова подобные");
        }
        System.out.println("Нашли на позиции " + indexOfString("m"));
//        System.out.println("Ответ " + asCharAt());
        System.out.println("Заменили " + asReplace("Поздравляю с днем рождением!"));
        System.out.println("Обрезали пробелы у - " + asTrim(" пробелы  "));

//        NameSwap("Bill Gates");
        //StringEquals("meme@me.cob","meme@me.com");
    }

    static int indexOfString(String ampersand) {
        String dotCom = ".com";
        String email_address = "meme@me.com";
        int result;
        int atPos = email_address.indexOf(ampersand);
        result = email_address.indexOf(dotCom, atPos);
/*
Мы получаем значение atPos, используя indexOf для определения положения символа @ в адресе электронной почты.
Затем Java начинает поиск с этой позиции, а не с 0, как по умолчанию.
 */
        Boolean ending = email_address.endsWith(dotCom);
        Boolean startVal = email_address.startsWith(dotCom);
        System.out.println(email_address.length());
        return result;
    }

    public static void NameSwap(String name) {
        String NameChars;
        int spacePos = name.indexOf(" ");
        NameChars = name.substring(0, spacePos + 2);
        System.out.println(NameChars);
    }

    public static void StringEquals(String foo, String bar) {
        Boolean isMatch = false;

        isMatch = foo.equals(bar);

        if (isMatch == true) {
            System.out.println("Адреса электронной почты совпадают");
        } else {
            System.out.println("Адреса электронной почты не совпадают");
        }
//    Переменная int является примитивным типом данных, а не объектом.
//    Но вы можете превратить примитивный тип данных int в объект:
        int num1 = 12;
        int num2 = 12;
        Integer num_1 = num1;
        Integer num_2 = num2;
        Boolean isMatch2 = false;
        isMatch2 = num_1.equals(num_2);
        System.out.println("Числа совпадают ? : " + isMatch2);

    }

    static String asCharAt() {

        Scanner input = new Scanner(System.in, "Cp1251");

        System.out.println("Выход Y/N");

        String aString = input.next();
        String result;
        char aChar = aString.charAt(0);

        if (aChar == 'Y') {
            //(Обратите внимание на использование одинарных кавычек, в которых помещена буква Y.)
            result = "Ок, пока";
        } else if (aChar == 'N') {
            result = "Еще не выходим";
        } else {
            result = "Y или N - нажми";
        }
        return result;
    }
    static  String asReplace (String aString){
        String result = aString.replace("рождением", "рождения");
        return result;
    }
    static String asTrim(String amend ){
        String result = amend.trim( );
        return result ;
    }
}

