package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {
//
//      2.2 Реализовать функцию
//    public static boolean isRightTriangle(int a, int b, int c)
//    , которая возвращает true, если треугольник со
//    сторонами a, b, c является прямоугольным.
//    Из геометрии известно, что для прямоугольного треугольника
//    выполняется теорема Пифагора
//    (сумма квадратов катетов равна квадрату гипотенузы).
//      2.3 Реализовать функцию
//    public static boolean isIsoscelesTriangle(int a, int b, int c)
//    , которая возвращает true, если треугольник со сторонами a, b, c
//    является равнобедренным. Из геометрии известно, что
//    в равнобедренном треугольнике есть две равные стороны.

//    2.1 Реализовать функцию
//    public static boolean isTriangle(int a, int b, int c),
//    которая возвращает true, если по данным трём сторонам (a, b, c)
//    можно построить треугольник. Из геометрии известно, что в треугольнике
//    длина каждой из сторон меньше суммы длин двух других сторон.

    public static boolean isTriangle(int a, int b, int c) {
        boolean isTriangl;
        if (  (a < (b + c) ) & (b < (a + c)) & (c < (a + b))  )
        {
            isTriangl = true;
        }
        else
        {
            isTriangl = false;
        }
        return isTriangl;

    }

        public static void main(String[] args) {
            System.out.println( "isTriangle " + isTriangle(2,2,8));

    }
}
