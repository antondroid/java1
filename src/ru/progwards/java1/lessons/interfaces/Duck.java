package ru.progwards.java1.lessons.interfaces;

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
   // AnimalKind animalKind = AnimalKind.DUCK;
    //FoodKind foodKind = FoodKind.CORN;

    Duck(){}

    public Duck (double weight)//конструктор который сохраняет вес животного.
    {
        super(weight);
        ifNdef("Duck weight " +weight);
    }
//static int outPut=0;
    /*public void ifNdef(String str)
    {
        if ((outPut==1))
        {
            System.out.println(  str );
        }
    }*/
//---------------------------------------------------------------------------
//переопределяющий методы:
//1.8 public AnimalKind getKind(), который возвращает DUCK.
//---------------------------------------------------------------------------




    @Override
    public AnimalKind getKind() {
    ifNdef("Duck kind " +AnimalKind.DUCK);
    return AnimalKind.DUCK;
}

//---------------------------------------------------------------------------
//1.9 public FoodKind getFoodKind(), который возвращает CORN
//---------------------------------------------------------------------------------
@Override
public FoodKind getFoodKind() {
    //FoodKind foodKind = FoodKind.CORN;
    ifNdef("Duck food is " +FoodKind.CORN);
    return FoodKind.CORN;  //just for joke (can simple foodKind variable)
}
//---------------------------------------------------------------------------
//переопределить метод:
//public double getFoodCoeff(), который должен возвращать 0.04
//----------------------------------------------------------------------------
@Override
public double getFoodCoeff() {
    //System.out.println("Duck foodcoeff " +getFoodCoeff());
    return 0.04;
    }
    public static void main(String[] args)
    {
        int outPut=1;
        Duck duck = new Duck(3);
        Hamster hamster = new Hamster(4);
        duck.compareFoodPrice(hamster);
        System.out.println("    duck.compareFoodPrice(hamster)           " + duck.compareFoodPrice(hamster));
    }
}
