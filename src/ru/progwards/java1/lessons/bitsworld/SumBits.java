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
    {   value=0;
        int decValue=0;
        


        System.out.println(decValue);
        return decValue;
    }

    public static void main(String[] args) {
        SumBits test1=new SumBits();
        byte value;
        test1.sumBits((byte) 4);

    }
}
