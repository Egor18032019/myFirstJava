public class Branch {
    public static void main(String[] args) {
        Sales aWorker = new Sales();
        aWorker.pos("МП");
        String position = aWorker.Position;

        String sWork = aWorker.nameWorker("Ivan");
        String sales = aWorker.numSales(300);
        String salary = aWorker.salaryWorker(300);
        System.out.println(position + " " + sWork + " " + sales + " " + aWorker);
        System.out.println(salary);
    }

    public static void test() {
        Sales aWorker = new Sales();
        aWorker.pos("МП");
        String position = aWorker.Position;

        String sWork = aWorker.nameWorker("Ivan");
        String sales = aWorker.numSales(300);
        String salary = aWorker.salaryWorker(300);
        System.out.println(position + " " + sWork + " " + sales + " " + aWorker);
        System.out.println(salary);
    }
}
