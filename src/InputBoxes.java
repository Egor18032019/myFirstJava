import javax.swing.JOptionPane;

public class InputBoxes {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Имя", "Ваше имя ");
        String surname;
        surname = JOptionPane.showInputDialog("Фамилия", "Ваша фамилия");
        String full;
        full = "Ваша фамилия " + name + " " + surname;
        String yers = JOptionPane.showInputDialog("Возраст", "Ваш возраст ? ");

        String width = JOptionPane.showInputDialog("Ширина прямоугольника");
        String height = JOptionPane.showInputDialog("Высота прямоугольника");

        float areaFloat = Float.parseFloat(width) * Float.parseFloat(height);
        String areaAnswerFloat = "Площадь прямоугольника равна =" + areaFloat;
        int areaNumber = Integer.parseInt(width) * Integer.parseInt(height);
        String areaAnswerInt = "Площадь прямоугольника равна =" + areaNumber;

        JOptionPane.showMessageDialog(null, full, "Name", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, areaFloat, "float", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, areaNumber, "int", JOptionPane.PLAIN_MESSAGE);
        if (Integer.parseInt(yers)<18){
            JOptionPane.showMessageDialog(null, full, "Вам сюда нельзя", JOptionPane.QUESTION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, full, "Возраст", JOptionPane.WARNING_MESSAGE);
        }
        System.exit(0);
    }
}
