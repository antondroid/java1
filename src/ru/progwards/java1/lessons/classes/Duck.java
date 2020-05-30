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
        System.out.println("Duck");
    }
//---------------------------------------------------------------------------
//переопределяющий методы:
//1.8 public AnimalKind getKind(), который возвращает DUCK.
//---------------------------------------------------------------------------
@Override
    public AnimalKind getKind() {
    return animalKind;
}

//---------------------------------------------------------------------------
//1.9 public FoodKind getFoodKind(), который возвращает CORN
//---------------------------------------------------------------------------------
@Override
public FoodKind getFoodKind() {
    return FoodKind.CORN;  //just for joke (can simple foodKind variable)
}
//---------------------------------------------------------------------------
//переопределить метод:
//public double getFoodCoeff(), который должен возвращать 0.04
//----------------------------------------------------------------------------
@Override
public double getFoodCoeff() {
    return foodCoeff;
    }
    public static void main(String[] args) {

    }
}
