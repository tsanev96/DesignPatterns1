package template;

public class Demo {
    public static void main(String[] args) {
        var task = new TransferMoneyTask();
        task.execute();
//        task.doExecute(); accessible only in the subclasses or in the same package, not in the Main
    }
}
