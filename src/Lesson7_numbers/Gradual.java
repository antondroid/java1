package Lesson7_numbers;

import Lesson6.Rectangle;

/*Создайте метод, возвращающий значение enum Grade по числовой оценке.
Сигнатура метода static Grade intToGrade(int grade)
Соответствие оценок
1 - VERYBAD
2 - BAD
3 - SATISFACTORILY
4 - GOOD
5 - EXCELLENT
все остальное NOTDEFINED
Например, intToGrade(4) должно вернуть GOOD
*/
public class Gradual {
    Grade  gradition = Grade.NOTDEFINED;
    Gradual() {
        this.gradition=Grade.GOOD;
    }
    //-----------------------for the frame insertion---------------
    enum Grade {BAD, EXCELLENT, GOOD, NOTDEFINED, SATISFACTORILY, VERYBAD}
    //static int  grade;

    static Grade intToGrade(int grade)
    {
        Grade  gradition=Grade.NOTDEFINED;
        switch (grade)
        {
            case 1:gradition=Grade.VERYBAD;
            break;
            case 2:gradition=Grade.BAD;
            break;
            case 3:gradition=Grade.SATISFACTORILY;
            break;
            case 4:gradition=Grade.GOOD;
            break;
            case 5:gradition=Grade.EXCELLENT;
            break;
            default:gradition=Grade.NOTDEFINED;
            break;
        }
        return gradition;
    }
//-----------------------------------------------------------------
    public static void main(String[] args) {
        Gradual test1 = new Gradual();
        test1.intToGrade(1);
        System.out.println("    test1.compareTo(test2)           " +test1.intToGrade(1));
        System.out.println("    test1.compareTo(test2)           " +test1.intToGrade(5));
        System.out.println("    test1.compareTo(test2)           " +test1.intToGrade(115));
        System.out.println(1<<1);
        System.out.println(2<<1);
        System.out.println(3<<1);
        System.out.println(1<<2);
        System.out.println(7<<3);
        System.out.println(5<<5);
        System.out.println(4<<4);




    }
}
