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
    int pos,num,N,a_length;
    private int arrayInt[];//3.1 в классе разместить private переменную - массив целых чисел
    public int a1[]; //output array
    public DIntArray(){} //3.2 конструктор - по умолчанию.
    public DIntArray(int pos,int num,int N)
    {
        this.pos=pos;
        this.num=num;
        this.N=N;
        this.a_length=a_length;
        System.out.println(" -------- the Start of const output  ---------");
        if((N<0)|(pos<0))
        {
            System.out.println(pos+" nor pos nor size cant be the negative "+N);
            System.exit(3);
        }
        if (pos>N)
        {
            System.out.println(pos+" pos out of array size "+N);
            System.exit(2);
        }
        arrayInt=new int[N];
        a_length = arrayInt.length;
        a_length++;
        System.out.println("print a_length after filling                     " +(a_length));
        System.out.println("print arrayInt before filling                    " +Arrays.toString(arrayInt));
        Arrays.fill(arrayInt,num);
        System.out.println("print arrayInt after filling                     " +Arrays.toString(arrayInt));
        System.out.println(" ----------the end of const output  ---------------");

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
        System.out.println(" -------- the Start of add output  ---------");
        int a_length = arrayInt.length;
        a_length++;
        int a1[] = new int [a_length];
        System.out.println("after init a1                                    "+Arrays.toString(a1));
        //AtomicInteger[] arrayIntCopy = Arrays. copyOf(arrayInt, arrayInt. length);
        a1 = Arrays.copyOf(arrayInt,a_length);
        System.out.println("print arrayInt                                   " +Arrays.toString(arrayInt));
        System.out.println("after copy arrayInt 2 a1                         "+Arrays.toString(a1));
        a1[a_length-1] = num;
        System.out.println("print a1 after add the  num value 2 the last cell"+Arrays.toString(a1));
        System.out.println(" ----------the end of add output  ---------------");
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
    {   System.out.println(" -------- the Start of atInsert output  ---------");
        System.out.println("print a_length after filling                     " +(a_length));
        System.out.println("print arrayInt                                   " +Arrays.toString(arrayInt));
        a1 = Arrays.copyOf(arrayInt,a_length);
        System.out.println("      print a1                                   " +Arrays.toString(a1));
        a1[pos-1] = num;
        System.out.println("      print a1 after num has put                 " +Arrays.toString(a1));
        System.out.println(" -------- the end of atInsert output  -----------");
    }
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


       System.out.println(" -------- the Start of atDelete output  ---------");



       
       System.out.println(" -------- the end of atDelete output  -----------");
       
   }

//-------------------------------------------------------------------
/*
3.5 метод
public int at(int pos)

 - возвращает элемент по индексу pos. */
public int at(int pos)
{
    System.out.println(" ---------- the Start of at output  -------------");
    System.out.println(" ---------- the end of at output  ---------------");
return pos;

}

//-----------------------------------------------------------------

    public static void main(String[] args)
    {
    //int N=5;int num=4;int pos=2;
    DIntArray testD=new DIntArray(2,7,5);
    //testD.add(12);
    testD.atInsert(4,8);
    testD.atDelete(4);
    testD.at(4);

    }

}

