package ru.progwards.java1.lessons.interfaces;



import java.util.Arrays;
import java.util.Objects;

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
 1. Классы Animal, Cow, Hamster, Duck
1.1 Для класса Animal из задач 1 и 2, домашнего задания к уроку 5 реализовать метод:
public boolean equals(Object anObject), который возвращает true, если объекты равны и false
если не равны по параметру - вес животного. Убедится, что при равном весе,
утка все равно не равна хомяку. Обратите внимание на тип принимаемого параметра и
 подумайте над тем, что будет делать ваша программа, если в качестве параметра
  будет передан объект не являющийся экземпляром Animal.

Для класса Animal реализовать интерфейс FoodCompare, который сравнивает животных по цене потребляемой еды.
public interface FoodCompare {
    public int compareFoodPrice();
}

Для этого
1.2 В класс Animal добавить метод
public double getFood1kgPrice(), который возвращает информацию о цене 1 кг еды.
метод реализовать в виде switch по FoodKind со следующими значениями
HAY : 20
CORN: 50
UNKNOWN: 0

1.3 В класс Animal добавить метод
public double getFoodPrice(), который возвращает информацию о цене еды для
 данного животного по формуле calculateFoodWeight() * getFood1kgPrice()

1.4 В отдельном файле объявить interface FoodCompare
interface FoodCompare {
    public int compareFoodPrice(Animal animal);
}

1.5 В класс Animal реализовать
public int compareFoodPrice(Animal aminal), который возвращает результаты
 сравнения цены еды для данного животного с ценой еды для другого животного,
 используя Double.compare;



//---------------------------------------------------------------------------------------
 */
class Animal implements  FoodCompare, CompareWeight {
    double weight;  //class property
    //AnimalKind animalKind = AnimalKind.ANIMAL;
    // FoodKind foodKind = FoodKind.UNKNOWN;


    // FoodKind foodKind;
    Animal() {
    }

    //1.0----------------------------------------------------------------------
    Animal(double weight)//конструктор который сохраняет вес животного.
    {//AnimalKind animalKind,FoodKind foodKind,double foodCoeff
        this.weight = weight;
        /*this.animalKind=animalKind;
        this.foodKind=foodKind;
        this.foodCoeff=foodCoeff;*/

        ifNdef(" animal weight  " + weight);

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
    //AnimalKind anim;
    //animalKind = new  AnimalKind.COW;
    //1.1----------------------------------------------------------------------
       /* public AnimalKind getKind() //Метод: который возвращает вид животного
        {                           //enum AnimalKind
            //switch is just for the sample, there needn't it really
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
                    anim= AnimalKind.DUCK;
                    break;
            }*/
    public AnimalKind getKind() {
        //System.out.println("Duck kind " +animalKind);
        //AnimalKind animalKind = AnimalKind.ANIMAL;
        //System.out.println("anim  " +anim);

        //System.out.println("Arrays   "+ Arrays.toString(AnimalKind.values()));
        //System.out.println(Arrays.toString(Season.values()));
         //return result;
        //System.out.println("animal kind  " + getKind());
        return AnimalKind.ANIMAL;
    }

    //1.2 -----------------------------------------------------------------
    enum FoodKind {UNKNOWN, HAY, CORN}

    //////  ////FoodKind foodKind1;
//switch is just for the sample, there needn't it really
    public FoodKind getFoodKind()    //, который возвращает вид еды,
    {
        //System.out.println("animal foodKind "    +getFoodKind());

        return FoodKind.UNKNOWN;
    }

    //--1.3 Метод
//public String toString(), который возвращает информацию о животном в формате:
//I am <AnimalKind>, eat <FoodKind>
//-------------------------------------------------------------------------------
    public String toString() {
       // System.out.println("Animal var : I am " + animalKind + ", eat " + foodKind);
        ifNdef("Animal_func: I am " + getKind() + ", eat " + getFoodKind());
        return "I am " + getKind() + ", eat " + getFoodKind() ;

    }

    //------------------------------------------------------------------------------
// 2.1 В классе Animal реализовать метод:
//public double getWeight(), который возвращает вес животного
    public double getWeight() {
        ifNdef("animal weight  "        +weight);
        return weight;
    }

    //----------------------------------------------------------------------------
//2.2 Реализовать метод
//public double getFoodCoeff(), который возвращает коэффициент веса еды
//к весу тела животного. Для класса Animal это 0.02
//--------------------------------------------------------------------------------------
    //double foodCoeff = 0.02;

    public double getFoodCoeff() {
        //double foodCoeff=0.02;
        //System.out.println("animal foodCoeff  "        +foodCoeff);
        return 0.02;
    }

    //---------------------------------------------------------------------------------------
//2.6 Для класса Animal, реализовать метод:
//public double calculateFoodWeight(), который рассчитывает необходимый вес еды,
// по формуле - вес-еды = вес-животного * коэффициент веса тела.
//----------------------------------------------------------------------------------


    public double calculateFoodWeight() {
        double foodWeight;
        //foodWeight = (weight * foodCoeff);
        foodWeight = (getWeight() * getFoodCoeff());
       // System.out.println("foodCoeff  " + animalKind+ "   "+foodCoeff);
        ifNdef("foodCoeff  " + getKind()+ "   "+getFoodCoeff());
        return foodWeight;
    }

    //----------------------------------------------------------------------------------
    //2.7 Для класса Animal, создать метод
    //public String toStringFull(), что бы он возвращал информацию о животном в формате:
    //I am <AnimalKind>, eat <FoodKind> <CalculateFoodWeight>
    //----------------------------------------------------------------------------------
    public String toStringFull() {
       // System.out.println("I am " + animalKind + ", eat " + foodKind + " " + foodWeight); //inheritance didn't work if use variable - functions output
        ifNdef("I am " + getKind() + ", eat " + getFoodKind() + " " + calculateFoodWeight()); //inheritance work if use functions
        return "I am " + getKind() + ", eat " + getFoodKind() + " " + calculateFoodWeight();
    }
//--------------------------------------------------------------------------------------
 /*1. Классы Animal, Cow, Hamster, Duck
1.1 Для класса Animal из задач 1 и 2, домашнего задания к уроку 5 реализовать метод:
    public boolean equals(Object anObject), который возвращает true,
    если объекты равны и false
    если не равны по параметру - вес животного. Убедится, что при равном весе,
    утка все равно не равна хомяку. Обратите внимание на тип принимаемого параметра и
    подумайте над тем,                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           что будет делать ваша программа, если в качестве параметра
    будет передан объект не являющийся экземпляром Animal.*/

//-------------------------------public boolean equals(Object anObject)-------------------------------------------------------
 /*   @Override
public boolean equals(Object anObject)
{

    if (this == anObject) return true;
    if (!(anObject instanceof Animal               )) return false;
    Animal animal  = (Animal) anObject;
    if (this.weight == ((Animal)anObject).weight) {
        return true;
    }
    return false;

}
//-----------------------------------------------------------------------------------------
//----------------------------------------------------------------------------
 /*public  int compareTo(Rectangle anRectangle)
 {
     Double rect1 = this.area();
     int result=0;
     result = Double.compare(this.area(), anRectangle.area());
     return result;
 }*/
//----------------------& public int compareFoodPrice(Animal aminal)-------------------------

    /*@Override
    public int hashCode() {
        return Objects.hash(getWeight());
    }*/

    /*@Override
    public boolean equals(Object anObject) {
        if (this == anObject) return true;
        if (!(anObject instanceof Animal)) return false;
        if (this.weight == ((Animal)anObject).weight) {
            return true;
        }
        return false;
    }*/
//--------------------------------------------------------------------
    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) return true;
        if (!(anObject instanceof Animal)) return false;
        if(anObject==null || getClass() != anObject.getClass()) return false;
        if (this.weight == ((Animal)anObject).weight) {
            return true;
        }
        return false;
    }
//------------------------------------------------------------------

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    //-------------------------------& public boolean equals(Object anObject)-------------------------------------------------------

 //-------------------------------------------------------------------

 /*1.2 В класс Animal добавить метод
    public double getFood1kgPrice(), который возвращает информацию о цене 1 кг еды.
    метод реализовать в виде switch по FoodKind со следующими значениями
    HAY : 20
    CORN: 50
    UNKNOWN: 0*/

 //-----------------------------------------------------------------------
 public double getFood1kgPrice()
 { //FoodKind foodKind = FoodKind.UNKNOWN;
     double food1kgPrice=0;
     switch (getFoodKind())
     {
         case UNKNOWN:
             food1kgPrice = 0;
             break;
         case HAY:
             food1kgPrice = 20;
             break;
         case CORN:
             food1kgPrice = 50;
             break;

     }

     ifNdef(    "food1kgPrice="+ food1kgPrice);
     return food1kgPrice;
 }
//--------------------------sample---------------------------------------
/*{ FoodKind foodKind1 = FoodKind.UNKNOWN;
    switch (foodKind1) {
        //case FoodKind.UNKNOWN:
        case UNKNOWN:
            //foodKind=FoodKind.UNKNOWN;
            foodKind1= FoodKind.UNKNOWN;
            break;
        case HAY:
            foodKind1 = FoodKind.HAY;
            break;
        case CORN:
            foodKind1= FoodKind.CORN;
            break;
    }*/
//--------------------------& sample-------------------------------------
//-----------------------------public double getFoodPrice()-----------------------------------------------------------

    /*1.3 В класс Animal добавить метод
    public double getFoodPrice(), который возвращает информацию о цене еды для
    данного животного по формуле calculateFoodWeight() * getFood1kgPrice()*/

//--------------------------------&-public double getFoodPrice()-------------------------------------------------------

    public double getFoodPrice()
    {
        double foodPrice=0;
        foodPrice=calculateFoodWeight()*getFood1kgPrice();
        ifNdef(" getclass "+getClass());
        return foodPrice;

    }

//--------------------------------------------------------------------

 /*1.5 В класс Animal реализовать
    public int compareFoodPrice(Animal aminal), который возвращает результаты
    сравнения цены еды для данного животного с ценой еды для другого животного,
    используя Double.compare;   */
//----------------------public int compareFoodPrice(Animal aminal)---------------------------------------------------

    //-------------sample---------------------------------------------------
/*
public int compare(House h1, House h2) {
    if (h1.price == h2.price) {
        return 0;
    }
    if (h1.price > h2.price) {
        return 1;
    }
    else {
        return -1;
    }
}//-------------& sample --------------------------------------------------------
*/
    @Override
    public int  compareFoodPrice(Animal aminal)
    {
        // Double rect1 = this.getFoodPrice();
        int result=0;
       /*if (Double.compare(this.getFoodPrice(), animal.getFoodPrice())==1) result=1;
        if (Double.compare(this.getFoodPrice(), animal.getFoodPrice())==0) result=0;
        if (Double.compare(this.getFoodPrice(), animal.getFoodPrice())==-1) result=-1;*/
        result=Double.compare(this.getFoodPrice(), aminal.getFoodPrice());

        return result;

    }


    //----------------------------------------------------------------------------
     /*public  int compareTo(Rectangle anRectangle)
     {
         Double rect1 = this.area();
         int result=0;
         result = Double.compare(this.area(), anRectangle.area());
         return result;
     }*/
    //----------------------& public int compareFoodPrice(Animal aminal)----------------------------------------------
//-----------------------------------------------------------------------------------------
 /*3.4 Для класса Animal реализовать интерфейс CompareWeight..Сравнение сделать на основе веса животного.
    Метод CompareResult compareWeight должен возвращать
    LESS если свой вес < веса параметра метода
    EQUAL если свой вес = веса параметра метода
    GREATER если свой вес > веса параметра метода*/

    //public enum CompareResult {LESS, EQUAL, GREATER}
    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeigt)
    {
        if (Double.compare(this.getWeight(), smthHasWeigt.getWeight())==1) return CompareResult.GREATER;
        if (Double.compare(this.getWeight(), smthHasWeigt.getWeight())==0) return CompareResult.EQUAL;
        if (Double.compare(this.getWeight(), smthHasWeigt.getWeight())==-1) return CompareResult.LESS;
        else return CompareResult.LESS;
    }
//-----------------------------------------------------------------------------
    int outPut=0;
    public void ifNdef(String str)
    {
        if ((outPut==1))
        {
            System.out.println(  str );
        }
    }
    //-----------------------------------------------------
    public static void main(String[] args)
    {
        Animal test0 = new Animal ();
        Animal test1 = new Animal (4);
        Animal test2 = new Animal (6);
        Hamster test3 = new Hamster(4);
        Hamster test4 = new Hamster(4);
        Animal animal = new Animal (7);
        Duck duck = new Duck(3);
        Duck duck4 = new Duck(4);
        Hamster hamster = new Hamster(4);
        test1.equals(test2);
        System.out.println("    test1.compareTo(test2)           " + test1.equals(test2));
        System.out.println("    test3.compareTo(test4)           " + test3.equals(test4));
        System.out.println("    test1.compareTo(test4)           " + test1.equals(test4));
        System.out.println("    test1.compareTo(test3)           " + test1.equals(test3));
        System.out.println("    test1.compareTo(test3)           " + test1.equals(test3));
        System.out.println("    animal.compareTo(hamster)           " + animal.equals(hamster));
        System.out.println("    animal.compareTo(duck)           " + animal.equals(duck));
        System.out.println("    duck3.compareTo(hamster4)           " + duck.equals(hamster));
        System.out.println("    duck4.compareTo(hamster4)           " + duck4.equals(hamster));

        //-------------------compare foodprice ------------------------------------------------------------
        test1.compareFoodPrice(test2);
        System.out.println("    duck3compareFoodPrice(hamster4)           " + duck.compareFoodPrice(hamster));
        System.out.println("    duck4.compareFoodPrice(hamster4)           " + duck4.compareFoodPrice(hamster));
        animal.compareWeight(duck);
        System.out.println("  "+animal.compareWeight(duck));
        System.out.println("  "+duck.compareWeight(animal));
        System.out.println("  "+duck.compareWeight(duck));
    }


}

//------------------------------------------------------------------------------------



