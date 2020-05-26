package Lesson4;

public class Factorial {
    //    Напишите метод, вычисляющий факториал числа - n!.
//    Сигнатура метода
//public
//        Напомним, что факториал n это произведение всех чисел от 1 до n и факториал 0 == 1
    //public static long n;
    static long factorial(long n){
        int m=1,i=0,b=0; long factorial=1;
            while (n > 0)
            {   n--;
                factorial *= m;
                m++;
            }
     return factorial;
    }
   long args;

    public static void main(String[] args) {
        //factorial(3);
        System.out.println( " n!"   + "  "+ " factorial "+ factorial(5));

    }













}
