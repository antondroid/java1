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
    Hamster(){}

 //------------------------------------------------------------------------
// класс Hamster, потомок класса Animal, переопределяющий методы:
//1.6  public AnimalKind getKind(), который возвращает HAMSTER.
//-------------------------------------------------------------------------
@Override
public AnimalKind getKind() {
    AnimalKind animalKind = AnimalKind.HAMSTER;
    return super.getKind();
}


//------------------------------------------------------------------------
//1.7 public FoodKind getFoodKind(), который возвращает CORN
//----------------------------------------------------------------------------

    FoodKind foodKind = FoodKind.CORN;
//--------------------------------------------------------------------------
//2.4 Для класса Hamster, переопределить метод:
//public double getFoodCoeff(), который должен возвращать 0.03
//--------------------------------------------------------------------------

    double foodCoeff = 0.03;


    public static void main(String[] args) {

    }
}
