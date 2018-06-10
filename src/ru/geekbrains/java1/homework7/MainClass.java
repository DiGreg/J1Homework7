package ru.geekbrains.java1.homework7;

public class MainClass {
    public static void main(String[] args) {
        Plate plate1 = new Plate(70);
        Cat[] cats = {new Cat("Мурзик", 15),
                      new Cat("Барсик", 20),
                      new Cat("Васька", 25),
                      new Cat("Тишка", 18)};

        plate1.info();
        System.out.println();
        checkSatiety(plate1, cats);

        System.out.println("Дабавим в тарелку 20 грамм:");
        plate1.addFood(20);
        plate1.info();
        System.out.println();
        checkSatiety(plate1, cats);
    }
//метод кормёжки и проверки сытости котов (у преподавателя по другому реализован код):
    public static void checkSatiety (Plate plate, Cat cat[]){
        for (int i = 0; i < cat.length; i++) {
            cat[i].info();//выод информации о коте

            //если кот голодный и количество еды в тарелке больше аппетита кота, тогда кот поест и станет сытым:
            if (!cat[i].getSatiety() && plate.getFoodInPlate() > cat[i].getAppetite()) {
                cat[i].eat(plate);
                cat[i].setSatiety();
            //иначе если кот голоден и в тарелке еды меньше аппетита, тогда кот остался голоднам:
            } else if (!cat[i].getSatiety() && plate.getFoodInPlate() < cat[i].getAppetite()) System.out.println("В тарелке недостаточно еды.");

            //для вывода результата кормёжки котов:
            if (cat[i].getSatiety()) System.out.println(cat[i].getName() + " сыт!");
            else System.out.println(cat[i].getName() + " остался голодным.");
            plate.info();
            System.out.println();
        }

    }
}