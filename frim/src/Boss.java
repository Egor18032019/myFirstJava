public class Boss {
    public static void main(String[] args) {
        Bonuses aWorker = new Bonuses();
//        Sales aWorker = new Sales();
        String position = aWorker.pos("ДФ");
        String name = aWorker.nameWorker("Боссс");
        String prod = aWorker.numSales(1);
        String salary = aWorker.salaryWorker(1000);
        String bonus = aWorker.BonusAward("ДФ");
        System.out.println(position + " " + name + " " + prod + " " + salary + bonus);
//        Branch work = new Branch();
//        work.test();
    }
}
//  Таким образом, наследование увеличивает (расширяет) полезность родительского класса.
//  Вы храните данные отдельно, помещая их в дочерний класс.
//  Но child («ребенок») связан с parent («родителем»)
//  и может получить доступ к некоторому или всему его коду.
//  Как и остальные классы, он так же работает, делая свою работу!