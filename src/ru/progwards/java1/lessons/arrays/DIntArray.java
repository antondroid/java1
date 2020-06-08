package ru.progwards.java1.lessons.arrays;

import javax.validation.constraints.Null;
import java.util.Arrays;

/*
Реализовать динамический, саморастущий массив целых чисел,

по следующей спецификации:

3.1 в классе разместить private переменную - массив целых чисел.
3.2 конструктор - по умолчанию.
3.2 метод
public void add(int num)

 - добавляет элемент num в конец массива,
при этом размер массива должен увеличиться на 1.
 Для этого нужно будет разместить новый массив нужного размера,
 скопировать в него старый, и добавить в хвост элемент num.
3.3 метод
public void atInsert(int pos, int num)

- добавляет элемент
num в позицию pos массива, при этом размер массива должен увеличиться на 1.
 Для этого нужно будет разместить новый массив нужного размера, скопировать
  в него старый, c учетом того, что новый элемент окажется где-то в середине,
  и потом положить в нужный индекс элемент num.
3.4 метод
public void atDelete(int pos)

 - удаляет элемент в позиции pos массива,
при этом размер массива должен уменьшиться на 1. Для этого нужно будет
 разместить новый массив нужного размера, скопировать в него старый,
  уже без элемента, который был в позиции pos.
3.5 метод
public int at(int pos)

 - возвращает элемент по индексу pos.
 */
public class DIntArray
{
    private int arrayInt[];//3.1 в классе разместить private переменную - массив целых чисел
    int pos,num,N;

    public int a1[]; //output array
    public DIntArray(){} //3.2 конструктор - по умолчанию.
    public DIntArray(int arrayInt[], int pos, int num, int N)


    {
        this.arrayInt=arrayInt;
        this.pos=pos;
        this.num=num;
        this.N=N;
        int a_length = 0;
        if ((arrayInt == null )|(arrayInt.length == 0))
        {
            System.out.println(" arrayInt is empty "+arrayInt);
            System.exit(13);
        }
        a_length=arrayInt.length;
        System.out.println("print arrayInt before filling                    " +Arrays.toString(arrayInt));
        //this.a_length=a_length;
        /*if (a_length<0)
        {
            System.exit(3);
        }*/
        //System.out.println(" -------- the Start of const output  ---------");
        if((N<0)|(pos<0))
        {
            //System.out.println(pos+" nor pos nor size cant be the negative "+N);
            System.exit(3);
        }
        if (a_length<pos)
        {
            System.out.println(pos+" pos out of array size "+N);
            System.exit(2);
        }
        if(a_length<1)
        {
            //System.out.println(pos+" nor pos nor size cant be the negative "+N);
            System.exit(3);
        }
        //---------------------------------------create artificial array--------------------------------------------
        /*arrayInt=new int[N];
        int i=0;  //cell counter
        while(i<N)//until pos reached
        {
            arrayInt[i]=i;i++;
        }
        int a_length = arrayInt.length;*/
//--------------------------------------end of create array ----------------------------------------------


        //a_length++;
        System.out.println("print a_length after filling                     " +(a_length));
        //System.out.println("print arrayInt before filling                    " +Arrays.toString(arrayInt));
        //Arrays.fill(arrayInt,num);
        //System.out.println("print arrayInt after filling                     " +Arrays.toString(arrayInt));
        //System.out.println(" ----------the end of const output  ---------------");

    }
//----------------------------------------------------------------------
    //3.2 метод
    //public void add(int num)
    //
    // - добавляет элемент num в конец массива,
    //при этом размер массива должен увеличиться на 1.
    // Для этого нужно будет разместить новый массив нужного размера,
    // скопировать в него старый, и добавить в хвост элемент num.
    public void add(int num)
    {
        //System.out.println(" -------- the Start of add output  ---------");
//-----------------------------------------------------------------------------------
        /*arrayInt=new int[N];
        int i=0;  //cell counter
        while(i<N)//until pos reached
        {
            arrayInt[i]=i;i++;
        }
        int a_length = arrayInt.length;*/
//------------------------------------------------------------------------------------
        int a_length = arrayInt.length;
        if (pos>a_length)
        {
            System.out.println(pos+" pos out of array size "+N);
            System.exit(2);
        }
        if(a_length<1)
        {
            //System.out.println(pos+" nor pos nor size cant be the negative "+N);
            System.exit(3);
        }
        a_length++;
        int a1[] = new int [a_length];
        //System.out.println("after init a1                                    "+Arrays.toString(a1));
        //AtomicInteger[] arrayIntCopy = Arrays. copyOf(arrayInt, arrayInt. length);
        a1 = Arrays.copyOf(arrayInt,a_length);
       // System.out.println("print arrayInt                                   " +Arrays.toString(arrayInt));
       // System.out.println("after copy arrayInt 2 a1                         "+Arrays.toString(a1));
        a1[a_length-1] = num;
        System.out.println("a1 after add the  num value 2 the last cell      "+Arrays.toString(a1));
        //System.out.println(" ----------the end of add output  ---------------");
    }
    //--------------------------------------------------------------------------
/*
   3.3 метод
public void atInsert(int pos, int num)

- добавляет элемент
num в позицию pos массива, при этом размер массива должен увеличиться на 1.
 Для этого нужно будет разместить новый массив нужного размера, скопировать
  в него старый, c учетом того, что новый элемент окажется где-то в середине,
  и потом положить в нужный индекс элемент num.
 */

    public void atInsert(int pos, int num)
    {   //System.out.println(" -------- the Start of atInsert output  ---------");
        if ((arrayInt == null )|(arrayInt.length == 0))
        {
            System.out.println(" arrayInt is empty "+arrayInt);
            System.exit(13);
        }
        int a_length = arrayInt.length;
        if (pos>a_length)
        {
            System.out.println(pos+" pos out of array size "+N);
            System.exit(2);
        }
        if(a_length<1)
        {
            //System.out.println(pos+" nor pos nor size cant be the negative "+N);
            System.exit(3);
        }
       // System.out.println("print a_length after filling                     " +(a_length));
       // System.out.println("print arrayInt                                   " +Arrays.toString(arrayInt));
        a1=new int[a_length+1]; //create new output array nose part
        //int a1_length=a1.length;
        //a1 = Arrays.copyOf(arrayInt,(a_length+1)  ); //copy first part to output array
        //System.out.println("      print a1                                   " +Arrays.toString(a1));

//-----------------------------copy the  nose cells   ---------------------------------------
        int i=0;  //cell counter
        while(i<pos)//until pos reached
        {
            a1[i]=arrayInt[i];i++;
        }
//----------------------------insert the  target cell --------------------------------------
        //System.out.println("      print a1                                   " +Arrays.toString(a1));
        a1[pos]=num;
        System.out.println("      print a1  after insertion pos              " +Arrays.toString(a1));
//----------------------------fill the rest cells ------------------------------------------
        i=pos;
        while(i<(a_length))
        {
            a1[i+1]=arrayInt[i];i++;
           // System.out.println("      print a1                                   " +Arrays.toString(a1));
        }

//----------------------------end of filling ----------------------------------------------

        //System.out.println("      print a1   after fill the tail             " +Arrays.toString(a1));
       System.out.println("      print a1 after num has put                 " +Arrays.toString(a1));
        //System.out.println(" -------- the end of atInsert output  -----------");
    }
//-------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------
    //a2=Arrays.copyOfRange(arrayInt, (pos-1), a_length); //copy tail to the a2
 //copyOfRange(T[] original,int from, int to)
//-------------------------------------------------------------------
/*3.4 метод
public void atDelete(int pos)

 - удаляет элемент в позиции pos массива,
при этом размер массива должен уменьшиться на 1. Для этого нужно будет
 разместить новый массив нужного размера, скопировать в него старый,
  уже без элемента, который был в позиции pos.

 */
   public void atDelete(int pos)
   {


       //System.out.println(" -------- the Start of atDelete output  ---------");
       //System.out.println("      print a1                                   " +Arrays.toString(a1));
//--------------------------------------------outof boundcheck-----------------------------------
       if((N<0)|(pos<0))
       {
           //System.out.println(pos+" nor pos nor size cant be the negative "+N);
           System.exit(3);
       }
       if (pos>N)
       {
           //System.out.println(pos+" pos out of array size "+N);
           System.exit(2);
       }
//--------------------------------------------check & -------------------------------------------
       int a2_length=arrayInt.length-1;
       int a_length=arrayInt.length;
       //System.out.println("      pos ="  +pos  +"     a_length="  + a2_length);
       int a2[] =new int [a2_length];
       //System.out.println("      print a2                                   " +Arrays.toString(a2));
//-----------------------------copy the  nose cells   ---------------------------------------
       int i=0;  //cell counter
       while(i<pos)//until pos reached
       {
           a2[i]=arrayInt[i];i++;
       }
//----------------------------insert the  target cell --------------------------------------
       //System.out.println("      print arrayInt                            " +Arrays.toString(arrayInt));
      // a1[pos-1]=num;  // copy nothing
      // System.out.println("      print a2                                   " +Arrays.toString(a2));
//----------------------------fill the rest cells ------------------------------------------
       i=pos;
       while(i<(a_length))
       {
           a2[i-1]=arrayInt[i];i++;
          // System.out.println("      print a2                                   " +Arrays.toString(a2));
       }

//----------------------------end of filling ----------------------------------------------
       System.out.println("      print a2   after deleting inside           " +Arrays.toString(a2));
       //System.out.println(" -------- the end of atDelete output  -----------");
   }

//-------------------------------------------------------------------
/*
3.5 метод
public int at(int pos)

 - возвращает элемент по индексу pos. */
public int at(int pos)
{
    //System.out.println(" -------- the Start of at output  ---------");
    if((N<0)|(pos<=0))
    {
        //System.out.println(pos+" nor pos nor size cant be the negative and position started from 1 " +N);
        System.exit(3);
    }
    if (pos>N)
    {
        //System.out.println(pos+" pos out of array size "+N);
        System.exit(2);
    }

//---------------------------------------------------------------------------
    //System.out.println("      print a1                                   " +Arrays.toString(arrayInt));
    int value=  arrayInt[pos];
    System.out.println("      print value                                " +value);
    //System.out.println(" ---------- the end of at output  ---------------");
return value;

}

/*
public int testNeg()    //try to test it for outbunds
{
    testD.add(12);
    testD.atInsert(4,8);
    testD.atDelete(4);
    testD.at(4);

    return 0;
}*/

//-----------------------------------------------------------------

    public static void main(String[] args)
    {
        //int N=5;int num=4;int pos=2;
        //DIntArray testD=new DIntArray(new int[]{1,-3,2,12,9,11,7,-5},2,7,8);
        DIntArray testD=new DIntArray(new int[]{0},0,7,8);
        testD.add(12);
        testD.atInsert(4,8);
        testD.atDelete(5);
        testD.at(4);
        //testD.sort(new int[]{1,-3,2,9,7,-5});  //input array modelling
    }

}

