package ru.progwards.java1.lessons.interfaces;

import java.util.Arrays;

/*
3.5 Создать класс Food (еда), которое никак не связано иерархией наследования с Animal.
3.6 В классе Food разместить приватную переменную int weight - вес еды в граммах,
реализовать в классе конструктор, принимающий и устанавливающий значение веса.
 */
public class Food implements CompareWeight
{
    //private static String name=("zero ");
    private int weight;
    Food(int weight)
    {
        //this.name = name;
        this.weight=weight;
    }
    //-----------------------------------------------------------------------------

    //-----------------------------------------------------
   /* @Override  //if not default it's interface realisation
    public CompareResult compareWeight(CompareWeight smthHasWeigt) {
        if (Double.compare(this.getWeight(), smthHasWeigt.getWeight())==1) return CompareResult.GREATER;
        if (Double.compare(this.getWeight(), smthHasWeigt.getWeight())==0) return CompareResult.EQUAL;
        else return CompareResult.LESS;
    }*/
    public double getWeight() {
        return weight;
    }
    @Override
    public String toString() {
        //return getClass().getSimpleName() + "[name="  + "]";
        return "wgt= " + weight + " ";
        //return getClass().getSimpleName() + "[ weight = " + weight + " ]";
    }
//----------------------------------------------------------------------
    //--------------------------------------------------------------
    int outPut=0;
    public void ifNdef(String str)
    {
        if ((outPut==1))
        {
            System.out.println(  str );
        }
    }
    //--------------------------------------------------------------
    public static void main(String[] args) {
        Food duck = new Food(3000);
        Food hamster2 = new Food(2000);
        Food duck3 = new Food(3000);
        Food hamster17 = new Food(1700);
        Food hamster18 = new Food(1800);
        Food hamster19 = new Food(1900);
        System.out.println("  "+duck.compareWeight(duck3));
        System.out.println("  "+duck.compareWeight(hamster2));
        System.out.println("  "+hamster2.compareWeight(duck3));
        System.out.println("  "+hamster2.compareWeight(hamster18));
        System.out.println("  "+hamster17.compareWeight(hamster18));
//----------------------------sort by Food-----------------------------------------------
       Food a[]={duck,hamster2,duck3,hamster17,hamster18,hamster19};
        ArraySort1 testF =new ArraySort1(new Food[]{duck},6);
        System.out.println("before sort " + Arrays.toString(a) );
        testF.sort(a);
        System.out.println("after sort" + Arrays.deepToString(a));
    }
}
/*
3.7 Реализовать метод
public int getWeight(), возвращающий сохраненное значение веса.
3.7 Для класса Food реализовать интерфейс CompareWeight..
Сравнение сделать на основе веса еды.


public static void sort(CompareWeight [] a)
 */
