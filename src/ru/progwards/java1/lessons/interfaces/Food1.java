package ru.progwards.java1.lessons.interfaces;

import java.util.Arrays;

/*
3.5 Создать класс Food (еда), которое никак не связано иерархией наследования с Animal.
3.6 В классе Food разместить приватную переменную int weight - вес еды в граммах,
реализовать в классе конструктор, принимающий и устанавливающий значение веса.
 */
public class Food1 implements CompareWeight
{
    //private static String name=("zero ");
    private int weight;

    Food1(int weight)
    {
        //this.name = name;
        this.weight=weight;
    }

    //ifNdef(" getclass "+getClass());
    //-----------------------------------------------------------------------------

    //-----------------------------------------------------


    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeigt) {
        if (Double.compare(this.getWeight(), smthHasWeigt.getWeight())==1) return CompareResult.GREATER;
        if (Double.compare(this.getWeight(), smthHasWeigt.getWeight())==0) return CompareResult.EQUAL;
        else return CompareResult.LESS;
    }
    public double getWeight() {
        return weight;
    }
    @Override
    public String toString() {
        //return getClass().getSimpleName() + "[name="  + "]";
        return "wgt= " + weight + " ";
        //return getClass().getSimpleName() + "[ weight = " + weight + " ]";
    }
//---------------------------------------------------------------------
/*class Person {

    private String name;

    public Person(String name){

        this.name=name;
    }

    @Override
    public String toString(){

        return "Person " + name;
    }  */

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
        Food1 duck = new Food1(3000);
        Food1 hamster2 = new Food1(2000);
        Food1 duck3 = new Food1(3000);
        Food1 hamster17 = new Food1(1700);
        Food1 hamster18 = new Food1(1800);
        Food1 hamster19 = new Food1(1900);


        System.out.println("  "+duck.compareWeight(duck3));
        System.out.println("  "+duck.compareWeight(hamster2));
        System.out.println("  "+hamster2.compareWeight(duck3));
        System.out.println("  "+hamster2.compareWeight(hamster18));
        System.out.println("  "+hamster17.compareWeight(hamster18));
        //--------------------sort-by int (original )----------------------------------
        //Food1 testD=new Food1(testD,3000);
        /*ArraySort testF =new ArraySort(new int[]{1},6);
        testF.sort(new int[]{1800,duck,hamster2,duck3,hamster17,hamster18,hamster19});*/
//----------------------------sort by Food-----------------------------------------------
       Food1 a[]={duck,hamster2,duck3,hamster17,hamster18,hamster19};
        ArraySort1 testF =new ArraySort1(new Food1[]{duck},6);
        System.out.println("before sort " + Arrays.toString(a) );
        testF.sort(a);
        System.out.println("after sort" + Arrays.deepToString(a));
        //System.out.println("print arrayInt after filling " + duck);

       //testF.sort(new Food[]{duck,hamster2,duck3,hamster17,hamster18,hamster19});
        //System.out.println("print arrayInt after filling " + Arrays.toString(a));
    }



   /* @Override
    public CompareResult compareWeight(CompareWeight smthHasWeigt) {
        return null;
    }
    @Override
    public double getWeight() {
        return 0;
    }*/
}
/*
3.7 Реализовать метод
public int getWeight(), возвращающий сохраненное значение веса.
3.7 Для класса Food реализовать интерфейс CompareWeight..
Сравнение сделать на основе веса еды.


public static void sort(CompareWeight [] a)
 */
