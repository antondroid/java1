package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

/*
Эратосфе́н Кире́нский (др.-греч. Ἐρατοσθένης ὁ Κυρηναῖος; 276 год до н. э.—194 год до н. э.) — греческий математик, астроном, географ, филолог и поэт.
Решето́ Эратосфе́на — алгоритм нахождения всех простых чисел до заданного целого числа N. Согласно легенде, Эратосфен писал числа на дощечке, покрытой воском, и прокалывал дырочки в тех местах, где были написаны составные числа. Поэтому дощечка являлась неким подобием решета, через которое «просеивались» все составные числа, а оставались только числа простые.

Алгоритм:
Для нахождения всех простых чисел не больше заданного числа N, следуя методу Эратосфена, нужно выполнить следующие шаги:

    Выписать подряд все целые числа от двух до n (2, 3, 4, …, N).
    Пусть переменная p изначально равна двум — первому простому числу.
    Зачеркнуть в списке числа от 2p до N считая шагами по p (это будут числа кратные p: 2p, 3p, 4p, …).
    Найти первое незачёркнутое число в списке, большее чем p, и присвоить значению переменной p это число.
    Повторять шаги 3 и 4, пока возможно.

Теперь все незачёркнутые числа в списке — это все простые числа от 2 до n.
Говоря простым языком, надо вначале вычеркнуть все числа,
которые делятся на 2, кроме самой двойки, т.е. каждое второе число,
 потом, которые делятся на 3, т.е. каждое 3-е число, кроме самой 3-ки,
  и т.д. в цикле

1.1 Реализовать класс Eratosthenes
,
 содержащий:
массив чисел, собственно, "решето"
private boolean[] sieve

, для того, чтобы узнать, я является ли
число n простым, нужно взять значение по индексу в массиве. sieve[n].
Значение true, означает простое число, false - составное.
1.2 Реализовать конструктор
public Eratosthenes(int N)

, который должен разместить массив
sieve с размером в N и заполнить его значениями true, после чего
вызвать метод sift()
1.3 Реализовать метод
private void sift()

,который, собственно и реализует
алгоритм Эратосфена, просеивая составные числа.
Подсказка - нужно реализовать 2 вложенных цикла,
внешний, например по i от 2 до N-1, и внутренний,
например по j который будет просеивать числа,
кратные переменной внешнего цикла i*j.
1.4 Реализовать метод
public boolean isSimple(int n)

,который возвращает sieve[n],
 что бы можно было узнать, простое число n или составное
 */
public class Eratosthenes
{private boolean sieve[]; int N;
 //static    int N=27;
    public Eratosthenes(){}
    public Eratosthenes(int N)  //constructor
    {
        this.N=N;
        if(N < 2){System.exit(2);}
        sieve = new boolean[N+1];
        System.out.println("arr sieve before - init  function toString   "+   Arrays.toString(sieve));
        Arrays.fill(sieve,true);
        Arrays.toString(sieve); // - for output only, didn'change array itself!
        System.out.println("arr sieve after - function toString   "+   Arrays.toString(sieve));
//--------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------
        sift();

    }
    private  void  sift()
    //private  void  sift(int N)
    {   int div=2;   //start divider number
        System.out.println("arr a_2_str - array itself  "+   sieve);
        System.out.println("arr a_2_str - function toString   "+   Arrays.toString(sieve));
        while(div<(N/2))
        {
            int i = 2;     //step counter (at least 2 times more than div number)
            int pos = 0;   //arrays pointer
            while (pos <= N)
            {
                sieve[pos] = false;

                pos = div * i; //complicate number position which has divider == div
                if (pos > N)
                {
                    System.out.println("the & of array had reached");break;
                }

                System.out.println( " pos " + pos);
                System.out.println( "  simple " + sieve[pos]);
                System.out.println( "  pos " + pos);
                i++;
            }
            div++;
        }

    }
    public boolean isSimple(int n)
    {
        if (n<2){ return true;}
        System.out.println( n + "  simple " + sieve[n]);
        return sieve[n];
    }

    public static void main(String[] args)
        {int N=0; int n=0;
        //System.out.println( Eratosthenes(N););
     //--------------------------------------------------
       // Eratosthenes amsieve = new Eratosthenes();
      //  int max2 =  amsieve.sift();
     //--------------------------------------------------
        Eratosthenes amsieve1 = new Eratosthenes(0);
        //amsieve1.sift(N);
        amsieve1.isSimple(1);


        //--------------------------------------------------
       //sift();
    }
}
    /*ArrayMax amsieve = new ArrayMax();
    int max2 =amsieve.arraySiTest(N);*/