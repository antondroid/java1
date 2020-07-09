package ru.progwards.java1.lessons.interfaces;

import java.util.Arrays;

/*
sort1 - changed type to food
array sort0-original
array sort - current version
2.1 Реализовать метод, сортирующий произвольный массив целых чисел:
public static void sort(int[] a), по следующему алгоритму:
1. Берем первый элемент и сравниваем его со вторым,
если второй меньше, меняем элементы в массиве местами.
2. Далее, сравниваем первый элемент с третьим, и если
третий меньше, меняем их местами.
3. Так делаем для всех элементов с индексом больше первого
4. Берем второй элемент и сравниваем его с третьим, если нужно, меняем местам
5. Далее сравниваем второй элемент с четвертым, и если нужно, меняем местами.
6. Делаем так для всех элементов, с индексом больше 2-го
7. Переходим к элементу с индексом 3...
8. Обобщая, алгоритм звучит следующим образом - сделать 2 вложенных цикла,
 внешний по i и внутренний по j. Внутренний цикл начинается от i+1,
  и если a[i] > a[j], то нужно поменять элементы a[i] и a[j] местами.
 */
public class ArraySort implements CompareWeight{
    Food a[];
    private static int N;
    ArraySort(){}
    //ArraySort(int a[], int N)
    ArraySort(Food a[], int N)
    {
    this.N=N;
    this.a=a;
    }

    public ArraySort(CompareWeight[] compareWeights, int n) {
    }


    public static void sort(CompareWeight[] a) {
        System.out.println("print arrayInt after input                     " + Arrays.toString(a));
        //-----------------------------------------------------------------------------------
        //a = new int[N];
        int a_length = a.length;
        N=a_length;
        //----------------------------------------create own array----------------------------------------------------
        int i = 0;  //cell counter
       /* int cellValue = N;
        while (i < N)//until pos reached
        {
            a[i] = cellValue;
            i++;
            cellValue--;
        }*/
        System.out.println("print arrayInt after filling " + Arrays.toString(a));
        //----------------------------------------------end of create array-------------------------------------
        i = 0;
        Food x;
        Food y;
        while (i < N)
            {
            int j = i+1;
            while (j < N)
                {
                    x = (Food) a[i];
                    y = (Food) a[j];
                    //if (y < x)
                    if (y.compareWeight(x)==CompareResult.LESS)
                    {
                        a[i] = y;
                        a[j] = x;
                        System.out.println("print arrayInt after filling                     " + Arrays.toString(a)+" "+i+" "+j);
                    }
                    j++;
                }
                i++;
            }
    }
//---------------------------------------------------------
/*public static void sort(CompareWeight [] a)
{
    //ArraySort0 testF =new ArraySort0(new Food[]{duck},6);
   // testF.sort(new Food[]{duck,hamster2,duck3,hamster17,hamster18,hamster19});
}*/

//---------------------------------------------------------
    public static void main(String[] args) {
       // int a[]=new int[]{1};     //this is transfer array from main to method sort (if uncommented)

       /* ArraySort1 testD=new ArraySort1(new Food[]{duck},6); //these parameter not mentioned it'just for took place
        testD.sort(new CompareWeight[]{du,-3,2,9,7,-5});  //input array modelling*/
//---------------------------------------------------------------------


//---------------------------------------------------------------------

    }

    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeigt) {
        if (Double.compare(this.getWeight(), smthHasWeigt.getWeight())==1) return CompareResult.GREATER;
        if (Double.compare(this.getWeight(), smthHasWeigt.getWeight())==0) return CompareResult.EQUAL;
        else return CompareResult.LESS;
    }


    @Override
    public double getWeight()
    {
        return 0;
    }
}
