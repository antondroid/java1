package Lesson6;

import java.util.Arrays;

/*Реализуйте функцию, возвращающую максимальный по значению элемент массива.
Если в массиве 0 элементов, вернуть 0. Сигнатура функции
public int arrayMax(int[] a)
Подсказка - для быстрой реализации удобно использовать функцию Arrays.sort()   */
public class ArrayMax_for_test {
//static int a[]  = {1,12,2,4,7,3,25};
//static int a1[] = {1,12,2,4,7,3,25};

//--------------------------------------------------------------------
//static
public int arrayMax(int[] a)
{   //int b [] = {3,8,9,7,1};
    int maxCell=0;int a_length = a.length;
    if (a_length==0)
    {
        //System.out.println("congratulations! u have find the max array's cell! 0");
        return maxCell;
    }


   /* System.out.println(" print a array " +a);
    System.out.println(" print b array " +b);
    Arrays.toString(a); // - for output only, didn'change array itself!
    System.out.println("arr a_2_str - array itself  "+   a);
    System.out.println("arr a_2_str - function toString   "+   Arrays.toString(a));
    System.out.println("-------------was unsorted and sorted now---------------" );*/
    Arrays.sort(a);  //must be from 1 - 25
    /*System.out.println("sorted array a  " +a ); //must be from 1 - 25
    System.out.println("arr a_2_str - function toString   "+   Arrays.toString(a));
    System.out.println("sorted array a ==> String  " +a );
    System.out.println( " int a_length = a.length; " + a_length );*/
    maxCell = a[a_length-1]; //the max num is less than length by 1
   /* System.out.println( "congratulations! u have find the max array's cell! "+maxCell  );*/
    return maxCell;
}
//---------------------------------------------------------------------

    public static void main(String[] args) {
        //System.out.println(Arrays.sort(a));
        //System.out.println("just array a "+ a);
        //System.out.println("just array "+ b);
        //System.out.println("arr a_2_str   "+   Arrays.toString(a));
        System.out.println( "------------------direct from method------------------------------" );
        //ArrayMax_for_test.arrayMax(a);
    }



}
