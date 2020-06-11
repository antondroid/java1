package Lesson6;

import java.lang.reflect.Array;
import java.util.Arrays;

/*Реализуйте функцию, возвращающую максимальный по значению элемент массива.
Если в массиве 0 элементов, вернуть 0. Сигнатура функции
public int arrayMax(int[] a)
Подсказка - для быстрой реализации удобно использовать функцию Arrays.sort()   */
public class ArrayMax {
//static int a[]  = {1,12,2,4,7,3,25};
int a[]  = {};
int a1[] = {1,12,2,4,7,3,25};
public int arrayMax(int[] a) //i made it static, need to know how to start it without any changing(as is)
{   int b [] = {3,8,9,7,1};
    int a_length = a.length;
    int maxCell=0;
    if (a_length==0){
        System.out.println( "congratulations! u have find the max array's cell! 0"  );
        return maxCell;
    }
    System.out.println(" print a array " +a);
    System.out.println(" print b array " +b);
    Arrays.toString(a); // - for output only, didn'change array itself!
    System.out.println("arr a_2_str - array itself  "+   a);
    System.out.println("arr a_2_str - function toString   "+   Arrays.toString(a));
    System.out.println("-------------was unsorted and sorted now---------------" );
    Arrays.sort(a);  //must be from 1 - 25
    System.out.println("sorted array a  " +a ); //must be from 1 - 25
    System.out.println("arr a_2_str - function toString   "+   Arrays.toString(a));
    System.out.println("sorted array a ==> String  " +a );
    System.out.println( " int a_length = a.length; " + a_length );
    maxCell = a[a_length-1]; //the max num is less than length by 1
    System.out.println( "congratulations! u have find the max array's cell! "+maxCell  );
    return maxCell;
}
    public int arraySiTest(int N)
    {
     int b=0;
     boolean sieve[]=new boolean[6];
     System.out.println("arr sieve - function toString   "+   Arrays.toString(sieve));
     Arrays.fill(sieve,true);
     System.out.println("arr sieve - function toString   "+   Arrays.toString(sieve));
        return b;
    }
//-----------------------------------------------------------------------------------------
public int arraySiTest2(int N)
{
    int b=0;
    boolean sieve[]=new boolean[6];
    System.out.println("arr siTEST2 AFTER ARRAY INIT   "+   Arrays.toString(sieve));
    Arrays.fill(sieve,true);
    System.out.println("arr siTEST2 AFTER ARRAY FILL BY TRUE   "+   Arrays.toString(sieve));
    return b;
}
//-----------------------------------------------------------------------------------------

    public static void main(String[] args) {
        int b[] = {1,12,2,4,7,3,25};
        int N=6;
        //System.out.println("just array a "+ a);
        //System.out.println("just array "+ b);
        //System.out.println("arr a_2_str   "+   Arrays.toString(a));
        System.out.println( "------------------direct from method------------------------------" );
        //ArrayMax.arrayMax(a);
        //ArrayMax(a); // как тут правильно записать чтобы run  стартанул (сейчас это дает ошибку)
                        //даже static не помогает
        ArrayMax am = new ArrayMax();
        int max = am.arrayMax(b);//и затем у используя переменную вызвать сам метод
        ArrayMax amsieve = new ArrayMax();
        int max2 =amsieve.arraySiTest(N);
        //-------------------2nd way 2traceout------------------------------------
        ArrayMax arrMax1 = new ArrayMax(); // и для него вызвать метод
        arrMax1.arraySiTest2(N);
        //--------------------------------------------------------------
    }
}
