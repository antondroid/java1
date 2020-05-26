package lesson5;
/* Создайте класс Calculator, содержащий

приватную переменную int result;
    конструктор по умолчанию, устанавливающий result = 0;
    публичную функцию set(int num), устанавливающую значение result равный num
    публичную функцию add(int num), увеличивающую result на num
    публичную функцию sub(int num), уменьшающую result на num
    публичную функцию int getResult()*/
class Calculator
{
    private int result;
    int num;
    public Calculator()
    {
        result=0;
    }
    //this();
public int set(int num)  //устанавливающую значение result равный num
    {
        result = num;
        return result;
    }
public int add(int num)  //увеличивающую result на num
    {
        result += num;
        return result;
    }
    public int sub(int num)  //уменьшающую result на num
    {
        result -= num;
        return result;
    }
    public int getResult()  //
    {
        return result;
    }



    public static void main(String[] args) {

    }




}
