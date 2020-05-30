package ru.progwards.java1.lessons.classes;
/*
Реализовать класс Hamster, потомок класса Animal, переопределяющий методы:
1.6  public AnimalKind getKind(), который возвращает HAMSTER.
1.7 public FoodKind getFoodKind(), который возвращает CORN
//-------------------------------------------------------------------------
2.4 Для класса Hamster, переопределить метод:
public double getFoodCoeff(), который должен возвращать 0.03
//-------------------------------------------------------------------------
 */
public class Hamster extends Animal{
    double weight;
    AnimalKind animalKind = AnimalKind.HAMSTER;
    FoodKind foodKind  = FoodKind.CORN;
    double   foodCoeff = 0.03;
    Hamster(){}
    public Hamster (double weight)//конструктор который сохраняет вес животного.
    {
        super(weight);
        System.out.println("hamster");
    }
 //------------------------------------------------------------------------
// класс Hamster, потомок класса Animal, переопределяющий методы:
//1.6  public AnimalKind getKind(), который возвращает HAMSTER.
//-------------------------------------------------------------------------
@Override
public AnimalKind getKind() {
    return animalKind;
}


//------------------------------------------------------------------------
//1.7 public FoodKind getFoodKind(), который возвращает CORN
//----------------------------------------------------------------------------
@Override
public FoodKind getFoodKind() {
    return foodKind;
}

//--------------------------------------------------------------------------
//2.4 Для класса Hamster, переопределить метод:
//public double getFoodCoeff(), который должен возвращать 0.03
//--------------------------------------------------------------------------
@Override
public double getFoodCoeff() {
    return foodCoeff;
    }

    public static void main(String[] args) {

    }
}
