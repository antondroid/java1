package ru.progwards.java1.lessons.bitsworld;
/* 2.1 Реализовать функцию
 public static int checkBit(byte value,int bitNumber)
 которая возвращает значение бита с
 порядковым номером bitNumber
 от параметра value.
 При этом следует помнить, что нумерация начинается
 с нуля и нулевой бит является младшим.
 */
public class CheckBit {
    public static int checkBit(byte value,int bitNumber)
    {
        int decValue;
        byte sum=0; byte result,mask;
        mask = (byte) (1<<bitNumber);
        result  = (byte) (value & mask);
        sum = (byte) (sum+result);
        value = (byte) (value>>1);
        if(sum==0)  decValue=sum;
        else decValue=1;
        System.out.println("value of bit "+bitNumber +" equal to "+decValue);
        return decValue;
    }


//package ru.progwards.java1.telegrambot;

    public static void main(String[] args) {
        CheckBit test1=new CheckBit();
        byte value;int bitNumber;
        test1.checkBit((byte) 0b01111011,2);
        test1.checkBit((byte) ~0b00000000,7);
        test1.checkBit((byte) 0b00000000,6);
        test1.checkBit((byte) 0b10101010,5);
        test1.checkBit((byte) ~0b10101010,5);

    }
}
