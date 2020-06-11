package ru.progwards.java1.lessons.bitsworld;
/*  1.1 Реализовать функцию
public static int sumBits(byte value),
 которая суммирует все биты параметра value.
 Например, для двоичного числа 0100101 функция должна вернуть 3.

Подсказки:

    используйте & с числом 1 для того, чтобы оставить только один правый значащий бит;
    используйте сдвиг вправо для того, чтобы проверить следующий бит.
       */
public class SumBits {
    public static int sumBits(byte value)
    {   //value=0;
        int decValue=0;
        int i=0;
        byte sum =0;
        byte result=0b0;
        while (i<8)
        {
            //(byte)
            result  = (byte) (value & 0b00000001);
            sum = (byte) (sum+result);
            value = (byte) (value>>1);
            i++;
        }
        decValue=sum;

        System.out.println("decValue             "+decValue);
        return decValue;
    }

    public static void main(String[] args) {
        SumBits test1=new SumBits();
        byte value;
        test1.sumBits((byte) 0b00000111);
        test1.sumBits((byte) 0b01101011);
        test1.sumBits((byte) 0b00000000);
        test1.sumBits((byte) ~0b00000000);
    }
}
