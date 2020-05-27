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
@Override
public FoodKind getFoodKind() {
    FoodKind foodKind  = FoodKind.CORN;
    return super.getFoodKind();
}

//--------------------------------------------------------------------------
//2.4 Для класса Hamster, переопределить метод:
//public double getFoodCoeff(), который должен возвращать 0.03
//--------------------------------------------------------------------------
@Override
public double getFoodCoeff() {
    double foodCoeff = 0.03;
    return super.getFoodCoeff();
    }

    public static void main(String[] args) {

    }
}
