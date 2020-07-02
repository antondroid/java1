package ru.progwards.java1.lessons.interfaces;
/*
Реализовать класс ComplexNum, реализующий операции в комплексных числах.
Напоминаем, что комплексное число записывается как z = a + bi,
где z это комплексное число, a действительная часть, b мнимая часть,
i обозначение мнимой части.
a и b реализуем целыми числами

3.1 конструктор
public ComplexNum(int a, int b), который инициализирует комплексное число

3.2 метод
public String toString(), приведение к строке, выдать в формате a+bi, например,
 при a=1 и b=56 должно быть выдано 1+56i

3.3 метод
public ComplexNum add(ComplexNum num), сложение комплексных чисел по формуле:
(a + bi) + (c + di) = (a + c) + (b + d)i

3.4 метод
public ComplexNum sub(ComplexNum num), вычитание комплексных чисел по формуле:
(a + bi) - (c + di) = (a - c) + (b - d)i

3.5 метод
public ComplexNum mul(ComplexNum num), умножение комплексных чисел по формуле:
(a + bi) * (c + di) = (a*c - b*d) + (b*c + a*d)i

3.6 метод
public ComplexNum div(ComplexNum num), деление комплексных чисел по формуле:
(a + bi) / (c + di) = (a*c + b*d)/(c*c+d*d) + ((b*c - a*d)/(c*c+d*d))i
 */
public class ComplexNum {
    int a, b;
    ComplexNum () {}

//--------------------------------------------------------------
//3.1 конструктор
//public ComplexNum(int a, int b), который инициализирует комплексное число
//----------------------------------------------------------
public ComplexNum   (int a,int b) //constructor
{
    this.a=a;
    this.b=b;
}
//----------------------------------------------------------
//3.2 метод
//public String toString(), приведение к строке, выдать в формате a+bi, например,
// при a=1 и b=56 должно быть выдано 1+56i
//-----------------------------------------------------------
public String toString()
{
    return a + "+"+b +"i";
}
//-----------------------------------------------------------

//----------------------------------------------------------
//3.3 метод
//public ComplexNum add(ComplexNum num), сложение комплексных чисел по формуле:
//(a + bi) + (c + di) = (a + c) + (b + d)i
//-----------------------------------------------------------
public ComplexNum add(ComplexNum num)
{
    ComplexNum sum = new ComplexNum();
    sum.a = a + num.a;
    sum.b = b + num.b;
    //(a + bi) + (c + di) = (a + c) + (b + d)i
    return sum;
}
//-----------------------------------------------------------

//----------------------------------------------------------
//3.4 метод
//public ComplexNum sub(ComplexNum num), вычитание комплексных чисел по формуле:
//(a + bi) - (c + di) = (a - c) + (b - d)i
//-----------------------------------------------------------
public ComplexNum sub(ComplexNum num)
{
    ComplexNum dif = new ComplexNum();
    dif.a=a-num.a;
    dif.b=b-num.b;

    return dif;
}
//-----------------------------------------------------------


//----------------------------------------------------------
//3.5 метод
//public ComplexNum mul(ComplexNum num), умножение комплексных чисел по формуле:
//(a + bi) * (c + di) = (a*c - b*d) + (b*c + a*d)i
//-----------------------------------------------------------
public ComplexNum mul(ComplexNum num)
{
    ComplexNum mtpl= new ComplexNum();
    mtpl.a = a * num.a - b * num.b;
    mtpl.b = b*num.a+ a*num.b;

    return mtpl;
}
//-----------------------------------------------------------

//----------------------------------------------------------
//3.6 метод
//public ComplexNum div(ComplexNum num), деление комплексных чисел по формуле:
//(a + bi) / (c + di) = (a*c + b*d)/(c*c+d*d) + ((b*c - a*d)/(c*c+d*d))i
//-----------------------------------------------------------
public ComplexNum div(ComplexNum num)
{

    ComplexNum divd = new ComplexNum();
    divd.a = (a * num.a + b*num.b)/(num.a*num.a + num.b*num.b);
    divd.b = (b*num.a-a*num.b)/(num.a*num.a + num.b*num.b);
    return divd;
}
//-----------------------------------------------------------

//-----------------------------------------------------------
//
//-----------------------------------------------------------

//-----------------------------------------------------------

    public static void main(String[] args) {

    }
}
