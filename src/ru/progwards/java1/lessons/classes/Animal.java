package ru.progwards.java1.lessons.classes;

import java.util.Arrays;

/*
//------------------------------------------------------------------------------------
Реализовать класс Animal, содержащий:
1.0 Реализовать конструктор
public Animal(double weight), который сохраняет вес животного.
1.1 Метод:
public AnimalKind getKind(), который возвращает
вид животного (enum AnimalKind - ANIMAL, COW, HAMSTER, DUCK).
В данном классе вернуть ANIMAL
1.2 Метод
public FoodKind getFoodKind(), который возвращает вид еды,
 (enum FoodKind - UNKNOWN, HAY, CORN).
 В данном классе вернуть UNKNOWN
1.3 Метод
public String toString(), который возвращает информацию о животном в формате:
I am <AnimalKind>, eat <FoodKind>
//-----------------------------------------------------------------------------------
2.1 В классе Animal реализовать метод:
public double getWeight(), который возвращает вес животного
2.2 Реализовать метод
public double getFoodCoeff(), который возвращает коэффициент веса еды
к весу тела животного. Для класса Animal это 0.02

2.6 Для класса Animal, реализовать метод:
public double calculateFoodWeight(), который рассчитывает необходимый вес еды,
 по формуле - вес-еды = вес-животного * коэффициент веса тела.

2.7 Для класса Animal, создать метод
public String toStringFull(), что бы он возвращал информацию о животном в формате:
I am <AnimalKind>, eat <FoodKind> <CalculateFoodWeight>
//-----------------------------------------------------------------------------------
 */
class Animal {
    double weight;  //class property
    AnimalKind animalKind = AnimalKind.ANIMAL;
    FoodKind foodKind = FoodKind.UNKNOWN;
    double foodCoeff=0.02;

   // FoodKind foodKind;
    Animal() { }
    //1.0----------------------------------------------------------------------
    Animal(double weight)//конструктор который сохраняет вес животного.
    {
        this.weight = weight;
    }


    //
    //String result;

   /* enum AnimalKind {ANIMAL, COW, HAMSTER, DUCK,}
    AnimalKind anim = AnimalKind.ANIMAL;
    AnimalKind animal = AnimalKind.ANIMAL;

    //1.1----------------------------------------------------------------------
     AnimalKind getKind() //Метод: который возвращает вид животного
    {                           //enum AnimalKind

        switch (animal) {
            case AnimalKind.ANIMAL:
               anim = AnimalKind.ANIMAL;
                break;
            case AnimalKind.COW:
                anim =AnimalKind.COW;
                break;
            case AnimalKind.HAMSTER:
               anim=AnimalKind.HAMSTER;
                break;
            case AnimalKind.DUCK:
                anim=AnimalKind.DUCK;
                break;
        }
        return anim;
        //return result;*/
        enum AnimalKind {ANIMAL, COW, HAMSTER, DUCK}
        //AnimalKind animalKind = AnimalKind.COW;
        AnimalKind anim;
        //animalKind = new  AnimalKind.COW;
        //1.1----------------------------------------------------------------------
        public AnimalKind getKind() //Метод: который возвращает вид животного
        {                           //enum AnimalKind
            //animalKind = AnimalKind.DUCK;
            switch (animalKind)
            {
                case ANIMAL:
                    anim= AnimalKind.ANIMAL;
                    break;
                case COW:
                    anim= AnimalKind.COW;
                    break;
                case HAMSTER:
                    anim= AnimalKind.HAMSTER;
                    break;
                case DUCK:
                    anim=AnimalKind.DUCK;
                    break;
            }
            System.out.println("anim  " +anim);
            System.out.println("animalkind  " +animalKind);
            System.out.println("Arrays   "+ Arrays.toString(AnimalKind.values()));
            //System.out.println(Arrays.toString(Season.values()));
            return anim;  //return result;


        }

    //1.2 -----------------------------------------------------------------
    enum FoodKind {UNKNOWN, HAY, CORN}

    FoodKind foodKind1;

    public FoodKind getFoodKind()    //, который возвращает вид еды,
    {
        switch (foodKind) {
            //case FoodKind.UNKNOWN:
            case UNKNOWN:
               //foodKind=FoodKind.UNKNOWN;
                foodKind1=FoodKind.UNKNOWN;
                break;
            case HAY:
                foodKind1 = FoodKind.HAY;
                break;
            case CORN:
                foodKind1=FoodKind.CORN;
                break;
        }
        return foodKind1;
    }

    //--1.3 Метод
//public String toString(), который возвращает информацию о животном в формате:
//I am <AnimalKind>, eat <FoodKind>
//-------------------------------------------------------------------------------
    public String toString() {
        return "I am " + getKind() + ", eat " + getFoodKind();
    }

    //------------------------------------------------------------------------------
// 2.1 В классе Animal реализовать метод:
//public double getWeight(), который возвращает вес животного
    public double getWeight() {
        return weight;
    }

    //----------------------------------------------------------------------------
//2.2 Реализовать метод
//public double getFoodCoeff(), который возвращает коэффициент веса еды
//к весу тела животного. Для класса Animal это 0.02
//--------------------------------------------------------------------------------------
    //double foodCoeff = 0.02;

    public double getFoodCoeff() {
        return foodCoeff;
    }

    //---------------------------------------------------------------------------------------
//2.6 Для класса Animal, реализовать метод:
//public double calculateFoodWeight(), который рассчитывает необходимый вес еды,
// по формуле - вес-еды = вес-животного * коэффициент веса тела.
//----------------------------------------------------------------------------------
    double foodWeight;

    public double calculateFoodWeight() {
        foodWeight = weight * foodCoeff;
        return foodWeight;
    }

    //----------------------------------------------------------------------------------
    //2.7 Для класса Animal, создать метод
    //public String toStringFull(), что бы он возвращал информацию о животном в формате:
    //I am <AnimalKind>, eat <FoodKind> <CalculateFoodWeight>
    //----------------------------------------------------------------------------------
    public String toStringFull() {
        return "I am " + getKind() + ", eat " + getFoodKind() + " " + calculateFoodWeight();
    }

    public static void main(String[] args) {

    }


}

//------------------------------------------------------------------------------------



