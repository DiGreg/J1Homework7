package ru.geekbrains.java1.homework7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;//сытость кота - изначально он голоден

    public Cat(String _name, int _appetite) {
        name = _name;
        appetite = _appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean getSatiety(){
        return satiety;
    }
    public void setSatiety() { //установка сытости
        satiety = true;
    }

    public void info(){
        System.out.println("Кот " + name + ". Аппетит: " + appetite + " грамм.");
    }
    //метод еды
    public void eat (Plate plate) {
       plate.decreaseFood(appetite);
    }

}
