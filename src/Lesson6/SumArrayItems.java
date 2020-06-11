package Lesson6;
/*
Напишите функцию, суммирующие значения элементов одномерного массива, содержащего целые числа. Сигнатура:

public int sumArrayItems(int[] a)
 */
public  class SumArrayItems {
//------------------------------------------------------------------------------------------------
    public int sumArrayItems(int[] a)  //  4 homework
    {
        int sum=0;int i=0;
        int LengthOF_a=a.length;
        while (i<LengthOF_a)
        {
           sum=sum+ a[i];
           i++;
        }
        return sum;
    }
//------------------------------------------------------------------------------------------------
    public static void main(String[] args)
    {
        int a[]={0,1,2,3,4,5};
        SumArrayItems test1 = new SumArrayItems();
        test1.sumArrayItems(a);
        System.out.println("      total zed                      "   +   test1.sumArrayItems(a));
        //System.out.println(sumArrayItems(a));

    }
}
