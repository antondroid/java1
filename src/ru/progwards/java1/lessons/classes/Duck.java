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
    double weight;
    AnimalKind animalKind = AnimalKind.DUCK;
    FoodKind foodKind = FoodKind.CORN;
    double foodCoeff=0.04;
    Duck(){}

    public Duck (double weight)//конструктор который сохраняет вес животного.
    {
        super(weight);
        System.out.println("Duck w " +weight);
    }
//---------------------------------------------------------------------------
//переопределяющий методы:
//1.8 public AnimalKind getKind(), который возвращает DUCK.
//---------------------------------------------------------------------------
@Override
    public AnimalKind getKind() {
    System.out.println("Duck kind " +animalKind);
    return animalKind;
}

//---------------------------------------------------------------------------
//1.9 public FoodKind getFoodKind(), который возвращает CORN
//---------------------------------------------------------------------------------
@Override
public FoodKind getFoodKind() {
    System.out.println("Duck food final " +FoodKind.CORN);
    System.out.println("Duck food var " +foodKind);
    return FoodKind.CORN;  //just for joke (can simple foodKind variable)
}
//---------------------------------------------------------------------------
//переопределить метод:
//public double getFoodCoeff(), который должен возвращать 0.04
//----------------------------------------------------------------------------
@Override
public double getFoodCoeff() {
    System.out.println("Duck foodcoeff " +foodCoeff);

    return foodCoeff;
    }
    public static void main(String[] args) {

    }
}
