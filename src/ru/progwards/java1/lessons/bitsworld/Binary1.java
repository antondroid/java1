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
//this is for exercise and keep out some interesting codes in binary all cleaned
public class Binary1 {
    byte num;

    public Binary1(byte num)   //constructor
    {
      this.num=num;


    }
    public String toString()
    {

        String result="+num ";
        String s1 = String.valueOf(num);
        System.out.println(s1+result);
        byte a2[];
        a2 = new byte[8];

        //System.out.println(s2);



//---------------------convert 2 string -------------------------
        int i=10;
        String s=String.valueOf(i);//Now it will return "10"
        System.out.println("decValue             "+s);
//---------------------------------------------------------------
        int a = 128;
        System.out.println("int 128 to string "+Integer.toString(a, 2));
//----------------------------------------------------------------
// ----------------------------------------------------------------
       // byte b = 0b00010001;
        //System.out.println(Byte.toString(b, 2));
//---------------------- & of convert 2 string  ------------------
        System.out.println("----------------- & of Demo printout  -------------");
        if((num>127)|(num<-127))
        {
            System.out.println(num + "num is out of bound of 1 byte    ");
            return result;
        }
//------------------------------------------------------------------------------
        int decValue=0;
        int j=0;int j1=7;
        byte sum =0;
        byte result1=0b0;
        while (j<8)
        {
            //(byte)
            result1  = (byte) (num & 0b00000001);
            a2[j1]=result1;
            sum = (byte) (sum+result1);
            num = (byte) (num>>1);
            j++;j1--;
        }
        decValue=sum;

//-----------------------------------------------------------------------------


        System.out.println("num             "+num);
        System.out.println("result             "+result);
        String s2 = ("\""+a2[0]+a2[1]+a2[2]+a2[3]+ a2[4]+a2[5]+a2[6]+a2[7]+"\" ");
        System.out.println(s2);
        result=s2;
        return  result;
    }




    public static void main(String[] args) {
        byte num=0;
        Binary1 test1 = new Binary1((byte) 0b11111100);
        test1.toString();
    }
}
