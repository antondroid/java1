package Lesson8_hsh_eqls;

//this is original copy of Rectangle, it's working and Rectangle is testing copy
// !!! need testing copy to rename from Rectangle1 to Rectangle   !!!  every time!
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
public class Rectangle1
{
    private double a;
    private double b;

    public Rectangle1(double a, double b)
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

//----------------------------------------------------------------------------

//---------------------------equals -------------------------------------------------
   /* public boolean equals(Object anObject)
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
        Rectangle1 test1 = new Rectangle1(3, 2); //test is rectangle(3,2)
        Rectangle1 test2 = new Rectangle1(2, 2);
        Rectangle1 test3 = new Rectangle1(2, 4);
        Rectangle1 test4 = new Rectangle1(2, 3);
        Rectangle1 test5 = new Rectangle1(1, 3);
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
        //System.out.println(result);

    }



}
