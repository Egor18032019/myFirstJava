public class Sales {
    private String Worker;
    String Position;
    private String Num_Sales;
    private String Salary;

    Sales() {
        Worker = "Без имени";
        Position = "Неизвестно";
        Num_Sales = "Нет продаж";
        Salary = "Нет зарплаты";
    }

    String nameWorker(String aWork) {
        Worker = aWork;
        return Worker;
    }

    String pos(String posAbb) {

        if (posAbb.equals("МП")) {
            Position = "Менеджер по продажам";
        }
        else if (posAbb.equals("СП")) {
            Position = "Супервайзер";
        }
        else if (posAbb.equals("ДФ")) {
            Position = "Директор филиала";
        }
        else {
            Position = "Должность не выбрана";
        }

        return Position;
    }

    String numSales(int aSales) {
        Num_Sales = aSales + " из 1000шт";
        return Num_Sales;
    }

    private String getSalary(int aSales) {

        int salaryWorker = 0;

        if (aSales >= 0 && aSales <= 200) {
            salaryWorker = 200;
        }
        else if (aSales >= 201 && aSales <= 400) {
            salaryWorker = 300;
        }
        else if (aSales >= 401 && aSales <= 600) {
            salaryWorker = 400;
        }
        else if (aSales >= 601 && aSales <= 800) {
            salaryWorker = 500;
        }
        else if (aSales >= 801) {
            salaryWorker = 600;
        }
        return "Зарплата " + salaryWorker + "$";
    }
    String salaryWorker(int aSales) {
        Salary = this.getSalary(aSales);
        return Salary;
    }
}

