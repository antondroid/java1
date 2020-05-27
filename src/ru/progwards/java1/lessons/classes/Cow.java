package ru.progwards.java1.lessons.classes;
/*
//------------------------------------------------------------------------
Реализовать класс Cow, потомок класса Animal, переопределяющий методы:
1.4 public AnimalKind getKind(), который возвращает COW.
1.5 public FoodKind getFoodKind(), который возвращает HAY
//------------------------------------------------------------------------
2.3 Для класса Cow, переопределить метод:
public double getFoodCoeff(), который должен возвращать 0.05
 */
public class Cow extends Animal {
    Cow(){}
    //1.0--------------------------add this because of comp send messages that const in cow must be w/o arguments`
    // constructor Cow in class ru.progwards.java1.lessons.classes.Cow cannot be applied to given types;
    // required: no arguments
    // found: double
    // --------------------------------------------
    /*public Animal(double weight)//конструктор который сохраняет вес животного.
    {
        this.weight = weight;
    }*/
//-----------------------------------------------------
//переопределяющий методы
// 1.4 public AnimalKind getKind(), который возвращает COW
//----------------------------------------------------------


    @Override
    public AnimalKind getKind() {
        AnimalKind animalKind = AnimalKind.COW;
        return super.getKind();
    }


//----------------------------------------------------------
//1.5 public FoodKind getFoodKind(), который возвращает HAY
//-----------------------------------------------------------


    @Override
    public FoodKind getFoodKind() {
        FoodKind foodKind  = FoodKind.HAY;
        return super.getFoodKind();
    }


//----------------------------------------------------------
//2.3 Для класса Cow, переопределить метод:
//public double getFoodCoeff(), который должен возвращать 0.05
//------------------------------------------------------------
    @Override
    public double getFoodCoeff() {
        double   foodCoeff = 0.05;
        return super.getFoodCoeff();
    }



    public static void main(String[] args) {

    }
}
