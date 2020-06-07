package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

/*
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
public class ArraySort1 {
    int a[];
    private static int N;
    ArraySort1(){}
    ArraySort1(int[] a, int N)
    {
    this.N=N;
    }
    public static void sort(int[] a) {
        //-----------------------------------------------------------------------------------
        a = new int[N];
        int a_length = a.length;
        int i = 0;  //cell counter
        int cellValue = N;
        while (i < N)//until pos reached
        {
            a[i] = cellValue;
            i++;
            cellValue--;
        }
        System.out.println("print arrayInt after filling                     " + Arrays.toString(a));
        //-----------------------------------------------------------------------------------
        i = 0;
        int x,y;
        while (i < N)
            {
            int j = i+1;
            while (j < N)
                {
                    x = a[i];
                    y = a[j];
                    if (y < x)
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
    public static void main(String[] args) {
        int a[]=new int[]{1};     //this is transfer array from main to method sort (if uncommented)

        ArraySort1 testD=new ArraySort1(new int[]{1},6);
        testD.sort(new int[]{1});


    }
}
