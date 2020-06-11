package Lesson7_numbers;
/*Написать программный код, который возвращает младший (нулевой)
бит переменной byte value. Ответ нужно поместить в переменную int result.
Таким образом, если младший бит параметра value равен 0, то result должен
быть равен 0. Если младший бит равен 1, то и result должен быть равен 1.*/

public class Value
{
public byte value;
public Value()
{
    this.value=value;
}
public int  valueOf(byte value)
{
//--------------for upload to frame --
    int result=0;
    byte mask=0x01;
    result = value&mask;
//--------------------------------------
    return result;

}

    public static void main(String[] args)
    {
      Value test1 = new Value();
      test1.valueOf((byte) 0xAF);
        System.out.println("result    " + test1.valueOf((byte) 0xAd));
    }
}

