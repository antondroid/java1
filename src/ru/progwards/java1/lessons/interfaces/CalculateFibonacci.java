package ru.progwards.java1.lessons.interfaces;

//--------------------------------------------------------------------
/*2.1 Разместить в классе CalculateFibonacci функцию
public static int fiboNumber(int n)

        2.2 Разместить вложенный класс
public static class CacheInfo, содержащий пару свойств

        public int n - число, для которого рассчитываем Фибоначчи
public int fibo - результат расчета

        2.3 Разместить в классе CalculateFibonacci приватную статическую переменную CacheInfo lastFibo;

        2.4 В статической функции fiboNumber, проверять параметр n
        на совпадение с последним рассчитанным значением, и если совпадает
        - возвращать уже готовый результат. Если не совпадает -
        рассчитывать и сохранять в статической переменной lastFibo.

        2.5 Реализовать метод public static CacheInfo getLastFibo() который возвращает lastFibo

        2.6 Реализовать метод public static void clearLastFibo(), который сбрасывает lastFibo в null*/

//-----------------------------------------------------------------------


//--------------------------------------------------------------
/*2.1 Разместить в классе CalculateFibonacci функцию
public static int fiboNumber(int n)
2.3 Разместить в классе CalculateFibonacci приватную статическую
 переменную CacheInfo lastFibo;
*/
public class CalculateFibonacci   {
    //  private static  CacheInfo lastFibo;
   private static  CacheInfo lastFibo = new CacheInfo(0,0);
    //static int n3;
  /*CalculateFibonacci(CacheInfo lastFibo)
  {

  }*/

//---------------------------------------------------------------
    public static int fiboNumber(int n)
    {   int fibo = 1;int n3;
        if ((lastFibo==null))
        {
            lastFibo = new CacheInfo(0,0);
            //getLastFibo().n=0;
            //getLastFibo().fibo=0;
        }
    n3=getLastFibo().n;
        if (n != getLastFibo().n)
        {

            int i = 2;
            int n1 = 1;
            int n2 = 1;
            if ((n == 1) | (n == 2))
                {
                    ifNdef("msg1 took from settings  "+ " n="+n +" fibo=" + fibo);
                    getLastFibo().n = n;
                    getLastFibo().fibo=fibo;
                    return fibo;
                } else
                    {
                        if (n > 2)
                        {
                            while (i < n) {
                                fibo = n1 + n2;
                                n1 = n2;
                                n2 = fibo;
                                i++;
                            }
                        }

                    }
            ifNdef("msg2 calculated  "+ " n="+n +" fibo=" + fibo);
                getLastFibo().n = n;
            getLastFibo().fibo=fibo;
                return fibo;
            }
                else{
                        fibo=getLastFibo().fibo;
                        ifNdef("msg3 took from cash  " + " n="+n +" fibo=" + fibo);
                        return fibo;
                    }
    }
    //-------------------------------------------------------------------

 /*2.2 Разместить вложенный класс
    public static class CacheInfo, содержащий пару свойств

    public int n - число, для которого рассчитываем Фибоначчи
    public int fibo - результат расчета
*/
//--------------------------------------------------------------------
     public static class CacheInfo
     {
         public int n;
     public int fibo;
         CacheInfo(int n, int fibo)
         {
            this.n=n;
            this.fibo=fibo;
         }

     }
//-----------------------------------------------------
//2.5 Реализовать метод public static CacheInfo getLastFibo() который возвращает lastFibo

//-----------------------------------------------------
    public static CacheInfo getLastFibo()
    {
        return lastFibo;
    }
//---------------------------------------------------------------
    // 2.6 Реализовать метод public static void clearLastFibo(),
    // который сбрасывает lastFibo в null*/
//-----------------------------------------------------------------
    public static void clearLastFibo()
    {   ifNdef("msg4 clear  ");
        lastFibo=null;
    }
//-------------------------------------------------------------
static int outPut=1;
    static void ifNdef(String str)
    {
        if ((outPut==1))
        {
            System.out.println(  str );
        }
    }
//------------------------------------------------------------
//------------------------------------------------------------
    public static void main(String[] args)
    {
         CalculateFibonacci test1 = new CalculateFibonacci();
         CalculateFibonacci test2= new CalculateFibonacci();
         int n=2;
         while (n<5) {
             n++;
             test1.fiboNumber(n);

         }
        while (n>1) {
            test1.fiboNumber(n);
            n--;
        }
        test1.fiboNumber(3);
        test1.fiboNumber(3);
        test1.clearLastFibo();
        test1.fiboNumber(3);
        ifNdef("msg3 took from cash  " + " n="+n +" fibo=" + lastFibo);
    }
}
