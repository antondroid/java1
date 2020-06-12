package ru.progwards.java1.lessons.bitsworld;
/* Binary3.1 Реализовать конструктор
public Binary(byte num).
3.2 Реализовать метод
public String toString(), который возвращает
 двоичное представление числа типа byte,
  используя только битовые операции.
  В выводимом значении всегда должно быть 8 символов
Например:
0: "00000000"
1: "00000001"
127: "01111111"
-128: "10000000"
-1: "11111111"*/
public class Binary {
    byte num;

    public Binary(byte num)   //constructor
    {
      this.num=num;


    }
    public String toString()
    {

        String result="+num ";
        byte a2[];
        a2 = new byte[8];
        System.out.println("----------------- & of Demo printout  -------------");
        if((num>127)|(num<-127))
        {
            System.out.println(num + "num is out of bound of 1 byte    ");
            return result;
        }
//-----------------------------------------------------------------------------
        int j=0;int j1=7;
        byte sum =0;
        byte result1=0b0;
        while (j<8)
        {
            result1  = (byte) (num & 0b00000001);
            a2[j1]=result1;
            num = (byte) (num>>1);
            j++;j1--;
        }
//-----------------------------------------------------------------------------
        //String s2 = ("\""+a2[0]+a2[1]+a2[2]+a2[3]+ a2[4]+a2[5]+a2[6]+a2[7]+"\" ");
        String s2 = (""+a2[0]+a2[1]+a2[2]+a2[3]+ a2[4]+a2[5]+a2[6]+a2[7]+"");
        System.out.println(s2);
        result=s2;
        return  result;
    }

    public static void main(String[] args) {
        byte num=0;
        Binary test1 = new Binary((byte) 0b11111100);
        test1.toString();
    }
}
