package ru.geekbrains.java1.homework7;

public class Plate {
    private int foodInPlate;

    public Plate(int _foodInPlate){
        foodInPlate = _foodInPlate;
    }
    public int getFoodInPlate() {
        return foodInPlate;
    }

    //метод убавления еды из тарелки
    public void decreaseFood(int appetite){
        foodInPlate -= appetite;
    }
    //метод добавки еды в тарелку
    public void addFood (int additiveFood) {
        foodInPlate += additiveFood;
    }

    public void info(){
        System.out.println("Количество еды в тарелке: " + foodInPlate + " грамм.");
    }


}
