package Test_pack;

import java.util.Arrays;

public class Animal2 {
    double weight;  //class property
    //String animalKind1,foodKind;
    double foodCoeff;

    Animal2() { }


    //1.0----------------------------------------------------------------------
    Animal2(double weight)//конструктор который сохраняет вес животного.
    {
        this.weight = weight;
    }
    //AnimalKind animalKind;
    //FoodKind foodKind;
    //String ANIMAL;
   // animalKind=animalKind1;


    //String result;

    enum AnimalKind {ANIMAL, COW, HAMSTER, DUCK}
   static AnimalKind animalKind = AnimalKind.COW;
   static AnimalKind anim;
    //animalKind = new  AnimalKind.COW;

    //1.1----------------------------------------------------------------------
    public static AnimalKind getKind() //Метод: который возвращает вид животного
    {                           //enum AnimalKind
        animalKind = AnimalKind.DUCK;
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
        System.out.println("Arrays   "+Arrays.toString(AnimalKind.values()));
        //System.out.println(Arrays.toString(Season.values()));
        return animalKind;  //return result;

    }

    //1.2 -----------------------------------------------------------------
    //enum FoodKind {UNKNOWN, HAY, CORN}

    //FoodKind foodKind = FoodKind.UNKNOWN;

   /* public Animal.FoodKind getFoodKind()    //, который возвращает вид еды,
    {
        switch (foodKind) {
            case UNKNOWN:
                foodKind= Animal.FoodKind.UNKNOWN;
                break;
            case HAY:
                foodKind = Animal.FoodKind.HAY;
                break;
            case CORN:
                foodKind= Animal.FoodKind.CORN;
                break;
        }
        return foodKind;
    }*/

    public static void main(String[] args) {

        System.out.println("getkind == "+getKind());
       // getKind();

    }

}
