public class Main {

    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Барсик", 10),
                new Cat("Мурзик", 11),
                new Cat("Дымок", 25),
                new Cat("Банифаций", 33)
        };

        Plate plate = new Plate(100);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }

        plate.addFood(20);
        plate.info();
    }

}