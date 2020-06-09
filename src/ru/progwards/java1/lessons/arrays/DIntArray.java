package ru.progwards.java1.lessons.arrays;

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
    //int pos,num,N,a_length;
    int pos,num,N;
    public int a1[]; //output array1
    public int a2[]; //output array2
    public DIntArray()//3.2 конструктор - по умолчанию.  remove 1
    {
        this.arrayInt=new int [0];

    }
    public DIntArray(int arrayInt[], int pos, int num)
    //public DIntArray()
    {
        this(); //remove 1
        this.arrayInt=arrayInt;
        this.pos=pos;
        this.num=num;
        //zerg[a] = new Zerg(a);
        //this.N=N;
        //this.a_length = a_length;
        int a_length=arrayInt.length;
        //System.out.println("arrayInt original length is                "+arrayInt.length);
        System.out.println("arrayInt original                          " +Arrays.toString(arrayInt));
//-----------------------------check null empty var ----------------
        if ((arrayInt == null ))
            //|(arrayInt == [ ] ))
        {
            System.out.println(" arrayInt is empty "+arrayInt);
            System.out.println("arrayInt before filling " + "                   " +Arrays.toString(arrayInt));
            //System.exit(13);
            arrayInt=new int[1];
            arrayInt[1]=0;
            a_length=0;
        }
        else{
            a_length=arrayInt.length;
            }
        if (a_length<pos)
        {
            System.out.println(pos+" pos out of array size "+N);
            System.exit(2);
        }
        if(a_length<1)
        {
            System.out.println(pos+" nor pos nor size cant be the negative "+N);
            System.exit(3);
        }
//-----------------------------end check ---------------------------

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
        //System.out.println("a_length after filling                     " +(a_length));
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
        DIntArray dia = new DIntArray();
        for (int i = 0; i< arrayInt.length; i++)
        dia.add(arrayInt[i]);
        System.out.println("arrayInt                               " +Arrays.toString(arrayInt));
        System.out.println(" --- the Start of add output  ---------");
        this.arrayInt=arrayInt;

        //System.out.println("print arrayInt" +Arrays.toString(arrayInt));

        int a_length = arrayInt.length;
        System.out.println("arrayInt                               " +Arrays.toString(arrayInt));
        System.out.println(" a_length                              "+a_length);
        a_length++;
        a1 = new int [a_length];
        //System.out.println("after init a1                                    "+Arrays.toString(a1));
        //AtomicInteger[] arrayIntCopy = Arrays. copyOf(arrayInt, arrayInt. length);
        a1 = Arrays.copyOf(arrayInt,a_length);
       //
       // System.out.println("after copy arrayInt 2 a1                         "+Arrays.toString(a1));
        a1[a_length-1] = num;
        System.out.println("a1 after add the  num value 2 the end  "+Arrays.toString(a1));
        System.out.println(" ----------the end of add output  -----");
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
        /*if ((arrayInt == null )|(arrayInt.length == 0))
        {
            System.out.println(" arrayInt is empty "+arrayInt);
            System.exit(13);
        }

        if (pos>a_length)
        {
            System.out.println(pos+" pos out of array size "+N);
            System.exit(2);
        }
        if(a_length<1)
        {
            //System.out.println(pos+" nor pos nor size cant be the negative "+N);
            System.exit(3);
        }*/
        //a_length = arrayInt.length;

       // System.out.println("print a_length after filling                     " +(a_length));
       // System.out.println("print arrayInt                                   " +Arrays.toString(arrayInt));
        int a_length = arrayInt.length;
        a1=new int[a_length+1]; //create new output array nose part
        //int a1_length=a1.length;
        //a1 = Arrays.copyOf(arrayInt,(a_length+1)  ); //copy first part to output array
        //System.out.println("      print a1                                   " +Arrays.toString(a1));

//-----------------------------copy the  nose cells   ---------------------------------------
        int i=0;  //cell counter
        while(i<pos)//until pos reached
        {
            if (i<a_length){

                a1[i]=arrayInt[i];i++;
            }
            else{System.out.println("      position is out of bound a1 " +Arrays.toString(a1));
            break;

            }


        }
//----------------------------insert the  target cell --------------------------------------
        //System.out.println("      print a1 " +Arrays.toString(a1));
        if (pos<=a_length) {
            a1[pos] = num;
        }else {
            System.out.println("      a1  after insertion pos              " + Arrays.toString(a1));
        }
        //----------------------------fill the rest cells ------------------------------------------
        i=pos;
        while(i<(a_length))
        {
            a1[i+1]=arrayInt[i];i++;
           // System.out.println("      print a1                                   " +Arrays.toString(a1));
        }

//----------------------------end of filling ----------------------------------------------

        //System.out.println("      print a1   after fill the tail             " +Arrays.toString(a1));
       System.out.println("      a1 after num has put                 " +Arrays.toString(a1));
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

//--------------------------------------------check & -------------------------------------------
       int a_length = arrayInt.length;
       int a2_length=arrayInt.length-1;
       //int a_length=arrayInt.length;
       //System.out.println("      pos ="  +pos  +"     a_length="  + a2_length);

       if (a2_length>0)
       {
           int a2[] = new int[a2_length];
       }
       else
           {
               System.out.println("      pos ="  +pos  +"     a_length="  + a2_length);
            }

       //System.out.println("      print a2                                   " +Arrays.toString(a2));
//-----------------------------copy the  nose cells   ---------------------------------------
       int i=0;  //cell counter
       while(i<pos)//until pos reached
       {
           if (i<a2_length) {
               a2[i] = arrayInt[i];
               i++;
           }else{
               System.out.println("      print a2                                   " +Arrays.toString(a2));
               break;
           }
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
       System.out.println("      a2   after deleting inside           " +Arrays.toString(a2));
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

//---------------------------------------------------------------------------
    //System.out.println("      print a1                                   " +Arrays.toString(arrayInt));
    int a_length=arrayInt.length;int value=0;
    if (pos<a_length) {

        value = arrayInt[pos];
    }else {
        System.out.println("      value   cannot be found from outside                             ");
    }


    System.out.println("      value                                " +value);
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
//-------------------------------test 0---------------------------------------
        //int N=5;int num=4;int pos=2;
        /*DIntArray testD=new DIntArray(new int[]{1,-3,2,12,9,11,7,-5},2,7,8);
        testD.add(12);
        testD.atInsert(0,8);
        testD.atDelete(5);
        testD.at(4);*/
//--------------------------------test1 ---------------------------------------------
       // DIntArray testD=new DIntArray(new int[]{ , }, 0,7,8);
        //testD.add(12);
        //testD.atInsert(0,8);
        //testD.atDelete(5);
        //testD.at(4);

//-----------------------------test2 ------------------------------------------
        //int[] ia = {1, 2, 3, 4, 5,6};
        int[] ia = {1, 2, 3};
        // DIntArray dia = new DIntArray(ia, 1,7);
        DIntArray dia = new DIntArray();

        //for (int i = 0; i< ia.length-1; i++) //w/o errors but robot give nullpoint exeption
            for (int i = 0; i< ia.length; i++)
        {
            dia.add(ia[i]);
            //dia.atInsert(ia[i], ia[i]);
            //dia.atDelete(ia[i]);
            //dia.at(ia[i]);
        }
//-----------------------------test3-----------------------------------------
        /*DIntArray testD=new DIntArray(ia, 3,7);
        testD.add(12);
        testD.add(10);
        testD.add(8);
        testD.add(6);
        testD.add(5);
        testD.add(2);
        testD.add(8);
        testD.atInsert(0,8);
        testD.atDelete(5);
        testD.at(4);*/
//--------------------------------------test4 --------------------------------
       /* DIntArray testD=new DIntArray();
        testD.add(12);
        testD.add(10);
        testD.add(8);
        testD.add(6);
        testD.add(5);
        testD.add(2);
        testD.add(8);
        testD.atInsert(0,8);
        testD.atDelete(5);
        testD.at(4);*/
// -------------------------------------------------------------------------
// testD.sort(new int[]{1,-3,2,9,7,-5});  //input array modelling
    }

}

