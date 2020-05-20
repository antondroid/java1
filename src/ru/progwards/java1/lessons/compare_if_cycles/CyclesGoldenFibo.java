package ru.progwards.java1.lessons.compare_if_cycles;

// Теперь проведём исследование. Есть ли у Золотого треугольника связь
// с числами Фибоначчи. Золотой треугольник это равнобедренный треугольник
// у которого ребро относится к основанию как 1.61803 (приблизительно),
// то есть по правилу Золотого сечения.
// Числа Фибоначчи это ряд чисел 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
// в котором первые два элемента равны 1, а каждый следующий равен сумме двух предыдущих.
// Для проведения этого исследования нам придётся решить две задачи.
//
//3.2 Реализовать, используя любой цикл, функцию
//public static int fiboNumber(int n), которая будет возвращать
// n-ое число Фибоначчи (нумерация начинается с 1, то есть при n = 3
// должно вернуться число Фибоначчи 2, а при n = 10 число 55).
//
//3.3 Реализовать функцию
//public static boolean isGoldenTriangle(int a, int b, int c),
// которая будет возвращать true, если треугольник
// со сторонами a, b, c является Золотым. Определим критерии.
// Он должен быть равнобедренным и отношение ребра к основанию
// должно лежать между значениями 1.61703 и 1.61903.
// Далее в функции public static void main(String[] args)
// вывести на консоль, используя цикл, 15 первых чисел Фибоначчи.
// После этого, используя вложенные циклы, определить: есть ли среди треугольников,
// длины сторон которых являются натуральными числами не превышающими 100,
// Золотые треугольники. И если есть, вывести на консоль длины основания
// и рёбер этих треугольников.
//
// Если всё получилось, посмотрите на консоль и сделайте вывод:
// есть ли связь между числами Фибоначчи и Золотыми треугольниками.
//




public class CyclesGoldenFibo {

//3.1 Реализовать функцию
//public static boolean containsDigit(int number, int digit),
// которая будет возвращать true, если число number
// содержит цифру digit.
//
public static boolean containsDigit(int number, int digit)
{
    int n1 = number;
    int n2 =0;
    boolean contain=false;
    while (number > 0) {
        n2=number%10;
        if (n2==digit)  //528%10==8
        {
            contain=true;
            break;
        }
        else
        {
            number /= 10;   //drop last dig
        }
    }
    //System.out.println("number "+n1+ " contain "+digit);
    return contain;
}

    public static void main(String[] args) {
        System.out.println("number included "  + containsDigit(1234567698, 8));
    }
}
