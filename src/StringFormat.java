public class StringFormat {
    public static void main(String[] args) {
        //https://marina-marchenko.com/java/formatirovanie-strok-i-chisel-v-java/
        String heading1 ="Exam_Name";
        String heading2 = "Exam_Grade";
        String divider = "-----------------------------------";

        String course1 = "Java";
        String course2 = "PHP";
        String course3 = "VB NET";

        double grade1 = 5.573;
        int grade2 = 4;
        String grade3 = "3";

        System.out.println("");
        System.out.printf("%-15s %15s %n", heading1, heading2);
        System.out.println(divider);

        System.out.printf("%-15s %10.0f %n", course1, grade1); // double и с сократили до 0 знаков после ,
        System.out.printf("%-15s %10d %n", course2, grade2); // тут число
        System.out.printf("%-15s %10s %n", course3, grade3);

        System.out.println(divider);
        System.out.println("");
    }
}
