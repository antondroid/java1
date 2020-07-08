package ru.progwards.java1.lessons.interfaces;
/*
3.5 Создать класс Food (еда), которое никак не связано иерархией наследования с Animal.
3.6 В классе Food разместить приватную переменную int weight - вес еды в граммах,
реализовать в классе конструктор, принимающий и устанавливающий значение веса.
 */
public class Food implements CompareWeight{
    private int weightg;
    Food(int weightg)
    {
        this.weightg=weightg;
    }
    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeigt) {
        return null;
    }
    public double getWeight() {
        return weightg;
    }
    public static void main(String[] args) {

    }
}
/*
3.7 Реализовать метод
public int getWeight(), возвращающий сохраненное значение веса.
3.7 Для класса Food реализовать интерфейс CompareWeight..
Сравнение сделать на основе веса еды.
 */