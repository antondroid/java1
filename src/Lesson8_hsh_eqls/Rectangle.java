package Lesson8_hsh_eqls;

import java.util.Objects;

/*Описан класс

	class Rectangle {
		private double a;
		private double b;

		public Rectangle(double a, double b) {
		        this.a = a;
			this.b = b;
                 }

		public double area() {

			return a*b;
		}
}

переопределите метод equals с сигнатурой
public boolean equals(Object anObject) который
 должен сравнивать прямоугольники
 по величине их площади.

Например

прямоугольник 2x2 != прямоугольнику 1x1
прямоугольник 2x3 == прямоугольнику 3x2
* */
public class Rectangle
{
    private double a;
    private double b;

    public Rectangle(double a, double b)
    {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return a * b;
    }
//-----------------------------------compare -----------------------------------------

    public int compareTo (Rectangle anRectangle)
    {
        Double rect1 = this.area();
        int result = 0;
        result = Double.compare(this.area(), anRectangle.area());
        return result;
    }
//------------------------------------------for insertion ---------------------------------------------
    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) return true;
        if (!(anObject instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) anObject;
        if (this.area() == ((Rectangle)anObject).area()) {
            return true;
        }
        return false;
    }
//------------------------------------------& insertion -----------------------------------------------
    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
//----------------------------------------------------------------------------
//--------------------------------sample1-------------------------------------
/*package com.company.bean;

    public class Rectangle {
        private double height;
        private double weight;

        public Rectangle(){
        }

        public Rectangle(double height, double weight){
            this.height = height;
            this.weight = weight;
        }

        @Override
        public boolean equals(Object obj) {
            return this.getArea() == ((Rectangle)obj).getArea();
        }

        public double getArea() {
            return height*weight;
        }
    }    */
//-----------------------------& of sample1 ----------------------------------



//---------------------------equals -------------------------------------------------
    /*public boolean equals(Object anObject)
    {   boolean b =false;
        Double rect1 = this.area();
        //Double rect2 = Object anObject.area();
        //int result = 0;
     //   b=(this.area().equals (anObject.area()));
        //b=(boolean)(this.area().equals (anObject.area()));//try this - same not work
        //= Double.equals(this.area(), anObject.area());// try this same not work

        return b;
    }*/
//https://github.com/antondroid/java1/commit/78a6de93d4ad6189625007b8f7a81e329fb66eef
//----------------------------------------------------------------------------





    public static void main (String[]args)
    {
        Rectangle test1 = new Rectangle(3, 2); //test is rectangle(3,2)
        Rectangle test2 = new Rectangle(2, 2);
        Rectangle test3 = new Rectangle(2, 4);
        Rectangle test4 = new Rectangle(2, 3);
        Rectangle test5 = new Rectangle(1, 3);
        Rectangle test6 = new Rectangle(6, 2);
        Rectangle test7 = new Rectangle(3, 4);
        //test1.area();
        test1.equals(test2);
        System.out.println("       test1                         " + test1.area());// here we compare the rectangle properties - one of it' prop is 'area'
        System.out.println("       test2                         " + test2.area());
        System.out.println("       test3                         " + test3.area());
        System.out.println("       test4                         " + test4.area());
        System.out.println("       test5                         " + test5.area());
        System.out.println("    test1.compareTo(test2)           " + test1.equals(test2));
        System.out.println("    test1.compareTo(test3)           " + test1.equals(test3));
        System.out.println("    test1.compareTo(test4)           " + test1.equals(test4));
        System.out.println("    test1.compareTo(test5)           " + test1.equals(test5));
        System.out.println("    test1.compareTo(test5)           " + test1.equals(test5));
        System.out.println("    test6.compareTo(test7)           " + test6.equals(test7));

        //System.out.println(result);

    }



}
