package ru.progwards.java1.lessons.classes;
/*
//--------------------------------------------------------------------------
Реализовать класс Duck, потомок класса Animal, переопределяющий методы:
1.8 public AnimalKind getKind(), который возвращает DUCK.
1.9 public FoodKind getFoodKind(), который возвращает CORN
//----------------------------------------------------------------------------
2.5 Для класса Duck, переопределить метод:
public double getFoodCoeff(), который должен возвращать 0.04
//----------------------------------------------------------------------------
 */
public class Duck extends Animal
{
    Duck(){}
//---------------------------------------------------------------------------
//переопределяющий методы:
//1.8 public AnimalKind getKind(), который возвращает DUCK.
//---------------------------------------------------------------------------
@Override
    public AnimalKind getKind() {
    AnimalKind animalKind = AnimalKind.DUCK;
    return super.getKind();
}

//---------------------------------------------------------------------------
//1.9 public FoodKind getFoodKind(), который возвращает CORN
//---------------------------------------------------------------------------------
@Override
public FoodKind getFoodKind() {
    FoodKind foodKind  = FoodKind.CORN;
    return super.getFoodKind();
}
//---------------------------------------------------------------------------
//переопределить метод:
//public double getFoodCoeff(), который должен возвращать 0.04
//----------------------------------------------------------------------------
@Override
public double getFoodCoeff() {
    double foodCoeff = 0.04;
    return super.getFoodCoeff();
    }
    public static void main(String[] args) {

    }
}
