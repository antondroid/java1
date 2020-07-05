package ru.progwards.java1.lessons.interfaces;

/*
Реализовать класс Hamster, потомок класса Animal, переопределяющий методы:
1.6  public AnimalKind getKind(), который возвращает HAMSTER.
1.7 public FoodKind getFoodKind(), который возвращает CORN
//-------------------------------------------------------------------------
2.4 Для класса Hamster, переопределить метод:
public double getFoodCoeff(), который должен возвращать 0.03
//-------------------------------------------------------------------------
 */
public class Hamster extends Animal implements FoodCompare
{
    double weight;
   //AnimalKind animalKind = AnimalKind.HAMSTER;
   // FoodKind foodKind  = FoodKind.CORN;

    Hamster(){}
    public Hamster (double weight)//конструктор который сохраняет вес животного.
    {
        super(weight);
        ifNdef("hamster w "+weight);
    }
 //------------------------------------------------------------------------
// класс Hamster, потомок класса Animal, переопределяющий методы:
//1.6  public AnimalKind getKind(), который возвращает HAMSTER.
//-------------------------------------------------------------------------
@Override
public AnimalKind getKind() {
    return AnimalKind.HAMSTER;
}


//------------------------------------------------------------------------
//1.7 public FoodKind getFoodKind(), который возвращает CORN
//----------------------------------------------------------------------------
@Override
public FoodKind getFoodKind() {
    return FoodKind.CORN;
}

//--------------------------------------------------------------------------
//2.4 Для класса Hamster, переопределить метод:
//public double getFoodCoeff(), который должен возвращать 0.03
//--------------------------------------------------------------------------
@Override
public double getFoodCoeff() {
    return 0.03;
    }

    public static void main(String[] args) {

    }
}
