public class Main {
    static final int AGE_LIMIT = 40;
    static final int WORKER_ARRAY_SIZE = 5;

    public static void main(String[] args) {
        System.out.println("Сотрудники:: ");
        Worker[] workers = new Worker[WORKER_ARRAY_SIZE];
        workers[0] = new Worker("Орлов Олег Петрович", "офтальмолог", "orlov@mailbox.com",
                "+7(287)134-56", 90000, 24);
        workers[1] = new Worker("Игнатьев Степан Афанасьевич", "хирург",
                    "ignat@mailbox.com", "+7(323)356-65-23", 100000, 45);
        workers[2] = new Worker("Самсонов Александр Юрьевич", "терапефт",
                "Samson@mailbox.com", "+7(132)423-45-76", 60000, 24);
        workers[3] = new Worker("Ничаев Владислав Алексеевич", "траматолог",
                "Nich@mailbox.com", "+7(234)345-23-12", 50000, 54);
        workers[4] = new Worker("Кулибин Феофан Степанович", "Главврач",
                "Fefa@mailbox.com", "+7(123)456-78-90", 240000, 40);
        System.out.println();
        for (Worker worker : workers) {
            if (worker.getAge() > AGE_LIMIT) {
                System.out.println("Сотрудник старше " + AGE_LIMIT + " лет: " + worker.workerInfo());
            } else if (worker.getAge() == AGE_LIMIT){
                System.out.println("Сотруднику " + AGE_LIMIT + " лет: " + worker.workerInfo());
            } else {
                System.out.println("Сотрудник младше " + AGE_LIMIT + " лет: " + worker.workerInfo());
            }
        }
    }
}