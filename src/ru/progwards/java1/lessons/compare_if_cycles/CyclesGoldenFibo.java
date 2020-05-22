package ru.progwards.java1.lessons.compare_if_cycles;


import static ru.progwards.java1.lessons.compare_if_cycles.TriangleInfo.isIsoscelesTriangle;

public class CyclesGoldenFibo {
//static int a,b,c;
//3.1 Реализовать функцию
//public static boolean containsDigit(int number, int digit),
// которая будет возвращать true, если число number
// содержит цифру digit.
//----------------------------------review--------------------------
  /*  OK: Тест "Тест containsDigit" пройден успешно.
    ERROR: Тест "Тест containsDigit с нулями" не пройден.
    Проверка containsDigit() expected:true but was:false
    OK: Тест "Тест fiboNumber" пройден успешно.
    ERROR: Тест "Тест isGoldenTriangle" не пройден.
    Проверка isGoldenTriangle() expected:true but was:false*/
static int number =0; static int digit=1;
public static boolean containsDigit(int number, int digit)
{
    int n1 = number;
    int n2 =0;
    boolean contain=false;
    if ((number==0)&(digit==0)) {contain=true;}
    else
        {
            while (n1 > 0) {
                //System.out.println("номер " + number);
                n2 = n1 % 10;
                if (n2 == digit)  //528%10==8
                {
                    contain = true;
                    // System.out.println("цыфра "+ digit);

                    break;
                } else {
                    n1 /= 10;   //drop last dig
                }
            }
        }
    //System.out.println("number "+n1+ " contain "+digit);
    return contain;
}
//--------------------------------------------------------------------
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
//--------------------------------------------------------------------
public static void cls() {
    try {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    } catch (Exception E) {
        System.out.println(E);
    }
}
//--------------------------------------------------------------------

    //3.2 Реализовать, используя любой цикл, функцию
//public static int fiboNumber(int n), которая будет возвращать
// n-ое число Фибоначчи (нумерация начинается с 1, то есть при n = 3
// должно вернуться число Фибоначчи 2, а при n = 10 число 55).
// Числа Фибоначчи это ряд чисел 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
// в котором первые два элемента равны 1, а каждый следующий
// равен сумме двух предыдущих.
//----------------------- review -------------------------------------------------
/*    ERROR: Тест "Тест isGoldenTriangle" не пройден.
    Проверка isGoldenTriangle() expected:true but was:false */
//
public static int fiboNumber(int n)
{
    int fibo=1;int i=2;
    int n1=1;int n2=1;
        if((n==1)|(n==2))
        {
            return fibo;
        }
         else
             {
                 if(n>2)
                 {
                     while (i<n)
                     {
                        fibo=n1+n2;
                        n1=n2;n2=fibo;
                        i++;
                     }
                 }
             }

   return fibo;
}
//---------------------------------------------------------------------
    // Теперь проведём исследование. Есть ли у Золотого треугольника связь
// с числами Фибоначчи. Золотой треугольник это равнобедренный треугольник
// у которого ребро относится к основанию как 1.61803 (приблизительно),
// то есть по правилу Золотого сечения.

// Для проведения этого исследования нам придётся решить две задачи.
//

//3.3 Реализовать функцию
//public static boolean isGoldenTriangle(int a, int b, int c),
// которая будет возвращать true, если треугольник
// со сторонами a, b, c является Золотым. Определим критерии.
// Он должен быть равнобедренным и отношение ребра к основанию
// должно лежать между значениями 1.61703 и 1.61903.
// Далее в функции public static void main(String[] args)
// вывести на консоль, используя цикл, 15 первых чисел Фибоначчи.
// После этого, используя вложенные циклы, определить: есть ли среди треугольников,
// длины сторон которых являются натуральными числами не превышающими 100,
// Золотые треугольники. И если есть, вывести на консоль длины основания
// и рёбер этих треугольников.
//
// Если всё получилось, посмотрите на консоль и сделайте вывод:
// есть ли связь между числами Фибоначчи и Золотыми треугольниками.
//----------------------------------------------------------------------------------
// которая будет возвращать true, если треугольник
// со сторонами a, b, c является Золотым. Определим критерии.
// Он должен быть равнобедренным и отношение ребра к основанию
// должно лежать между значениями 1.61703 и 1.61903.
//-------------------------------------------------------------------------
//     ряд чисел 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,
//-------------------------------------------------------------------------
//static int a=89,c=55,b=a; for check - real triangle  ratio
  static int a,c,b=a;
public static boolean isGoldenTriangle(int a, int b, int c)
{
    boolean isGoldTri;
    double a1= a;
    double b1= b;
    double c1= c;
    double  l = 1.61703d; //low lim
    double h =1.61903d;   // high lim
    double r1 = a1/c1;
    if ((r1>l)&(r1<h))
    {
        //System.out.println(" this is golden ratio " + a + " to " + c+ " ratio " +r1);
    }
    else {
        //System.out.println(" this is bad ratio " + a + " to " + c +" ratio "  +r1);
        }
    //if (  ( (a == b) & ( (c1/a1)>l ) & ( (c1/a1)<h )  ) |   ( (a == c) & ( (a1/b1)>l ) & ( (a1/b1)<h )   ) | ( (c == b) & ( (a1/b1)>l ) & ( (a1/b1)<h )  )  )
    if ( ( (a == b) & ( (a1/c1)>l ) & ( (a1/c1)<h )  ) |   ( (a == c) & ( (a1/b1)>l ) & ( (a1/b1)<h )   ) | ( (c == b) & ( (b1/a1)>l ) & ( (b1/a1)<h )  )  )
    {
        //System.out.println(" this is golden ratio " + a + " to " + c+ " ratio " +r1);
       // System.out.println(" ");
        isGoldTri = true;
    }
    else
    {
       isGoldTri = false;
    }
    return isGoldTri;
}

//----------------------------------------------------------------------------------
// вывести на консоль, используя цикл, 15 первых чисел Фибоначчи.
// После этого, используя вложенные циклы, определить: есть ли среди треугольников,
// длины сторон которых являются натуральными числами не превышающими 100,
// Золотые треугольники. И если есть, вывести на консоль длины основания
// и рёбер этих треугольников.
//------------------------------------------------------------------------------------
    //static int a,b,c;
    static int n=15;static int m=n-1;
// вывести на консоль, используя цикл, 15 первых чисел Фибоначчи.
public static void fiboNumber15(int n,int m) throws InterruptedException {
    System.out.println("------- 15 first Fibonacci numbers figuring out ---------------");
    System.out.println(" ");
    Thread.sleep(10000); // спать 1000 милисекунд.
    n=1;
    int cats[] = new int[16];
       //int number=0;
       while ((n<16))
       {
          // fiboNumber(n);

           //cats[n]=fiboNumber(n);
            if(n<=10){System.out.print(n+"   ");}
            else{System.out.print(n+"  ");}
           Thread.sleep(1000); // спать 1000 милисекунд.
            //System.out.print(number);
           //System.out.println(fiboNumber(n));
          /* System.out.print(" cats "+fiboNumber(n));
           System.out.println(" base "+fiboNumber(n-1));*/

           n++;
       }
    System.out.println(" ");
       n=1;
    while ((n<16))
    {

        //fiboNumber(n);
        cats[n]=fiboNumber(n);
        //System.out.print(n+"  ");
        //System.out.print(number);
         if (cats[n]<10) {  System.out.print(cats [n]+"   ");}
         else   {
                    if(cats[n]<100){System.out.print(cats [n]+"  ");}
                    else {System.out.print(cats [n]+" ");}
                }
        Thread.sleep(1000); // спать 1000 милисекунд.
          /* System.out.print(" cats "+fiboNumber(n));
           System.out.println(" base "+fiboNumber(n-1));*/

        n++;
    }
    System.out.println("  ");
    System.out.println("------- Fibonacchi numbers is over---------------");
    System.out.println(" ");
    Thread.sleep(10000); // спать 1000 милисекунд.
}

    /*
    // После этого, используя вложенные циклы, определить: есть ли среди треугольников,
    // длины сторон которых являются натуральными числами не превышающими 100,
    // Золотые треугольники. И если есть, вывести на консоль длины основания
    // и рёбер этих треугольников.
    */
    public static void  fiboGold100 (int n,int m) throws InterruptedException {
        n=1;m=n-1; int goldquantity=0;
        int cats[] = new int[16];   //just for you wouldn't think, that i can't do to work with arrays
        int base[] = new int[16];   //just for you wouldn't think, that i can't do to work with arrays!
        clearScreen();
        cls();
        System.out.println(" Start mining  golden triangles   " );
        System.out.println(" "); System.out.println(" "); System.out.println(" ");
        Thread.sleep(5000); // спать 1000 милисекунд.
        System.out.println(" mining ....   " );
        System.out.println(" ");
        Thread.sleep(15000); // спать 1000 милисекунд.
        // int number=0;
        while ((n<16)&&(fiboNumber(n)<100))
        {
            fiboNumber(n);
            cats[n]=fiboNumber(n); //just for you wouldn't think, that i can't do to work with arrays!
            base[m]=fiboNumber(m); //just for you wouldn't think, that i can't do to work with arrays
            System.out.print(n+" ");
            //System.out.print(number);

            System.out.print(fiboNumber(n));
            System.out.print(" cats "+fiboNumber(n)); //just for you wouldn't think, that i can't do to work with methods!
            System.out.print(" cats [n] "+cats[n]);    //just for you wouldn't think, that i can't do to work with arrays!
            System.out.println(" base "+fiboNumber(n-1));// //just for ...... that i can't do to work with both!
            System.out.println("U have find one more " + isGoldenTriangle(a,b,c)+  "  triangle   " );
            Thread.sleep(3000); // спать 1000 милисекунд.
            System.out.println(" "); System.out.println(" ");
            //================just for you wouldn't think, that ====================
            // ======= i can't do to work with methods & arrays together! ==========
            a=cats[n];b=a;c=fiboNumber(n-1);
            boolean onemoregold =   isGoldenTriangle(a,b,c);
            if (onemoregold==true)
            { System.out.println(" ");
                goldquantity ++;
                System.out.println("U have found "  +goldquantity + "  " + isGoldenTriangle(a,b,c)+  " Golden triangles ") ;
                Thread.sleep(10000); // спать 1000 милисекунд.
                System.out.println(" "); System.out.println(" ");
            }



            n++;
        }
        System.out.println(" mining is over ...   " + isGoldenTriangle(a,b,c));
        System.out.println(" "); System.out.println(" ");
        Thread.sleep(15000); // спать 1000 милисекунд.
        System.out.println("U have find "  +goldquantity +"   " + isGoldenTriangle(a,b,c) +" golden triangles" );
        Thread.sleep(15000); // спать 1000 милисекунд.
        System.out.println(" "); System.out.println(" "); System.out.println(" ");
        System.out.println("U R a Billionaire Now   !  !  !");
        Thread.sleep(10000); // спать 1000 милисекунд.
        System.out.println(" "); System.out.println(" "); System.out.println(" ");
        System.out.println("GAME OVER ");
        Thread.sleep(10000); // спать 1000 милисекунд.
        System.out.println(" "); System.out.println(" "); System.out.println(" ");
        System.out.println("------ game is  not over yet..........  -------");
        Thread.sleep(10000); // спать 1000 милисекунд.
        System.out.println(" "); System.out.println(" "); System.out.println(" ");
        System.out.println("------ ...........digits finding started  -------");

    }




public static void main(String[] args) throws InterruptedException {
// вывести на консоль, используя цикл, 15 первых чисел Фибоначчи.

        fiboNumber15(n,m);

        fiboGold100(n,m);
        System.out.println("number " +number + " include digit  "  + digit +" is " + containsDigit(number,digit));
        //System.out.println("golden triangle   " + isGoldenTriangle(a,b,c));
        //System.out.println(a,b,c);
        //System.out.println("number fibo is "  + fiboNumber(10));
        //Числа Фибоначчи 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
    System.out.println("------- now is REALLY over ---------------");
    Thread.sleep(10000); // спать 1000 милисекунд.

}












}
