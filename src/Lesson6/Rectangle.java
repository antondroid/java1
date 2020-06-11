package Lesson6;

/*
Описан класс

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

реализуйте метод compareTo с сигнатурой
public int compareTo(Rectangle anRectangle) который должен сравнивать прямоугольники по величине их площади.
При сравнении a.compareTo(b) метод должен возвращать
a   > b : 1
a == b : 0
a   < b : -1

Например

прямоугольник 2x2  >  прямоугольника 1x1 - результат 1
прямоугольник 2x3 == прямоугольнику 3x2 - результат 0
прямоугольник 2x2  <  прямоугольника 3x3 - результат -1
 */
public class Rectangle
{
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {

        return a*b;
    }
//----------------------------------------------------------------------------

    public  int compareTo(Rectangle anRectangle)
    {
        Double rect1 = this.area();
        int result=0;
        result = Double.compare(this.area(), anRectangle.area());
        return result;
    }

//----------------------------------------------------------------------------

    public static void main(String[] args)
    {
        Rectangle test1 = new Rectangle(3,2); //test is rectangle(3,2)
        Rectangle test2 = new Rectangle(2,2);
        Rectangle test3 = new Rectangle(2,4);
        Rectangle test4 = new Rectangle(2,3);
        Rectangle test5 = new Rectangle(1,3);
        //test1.area();
        test1.compareTo(test2);
        System.out.println("       test1                         " +test1.area());// here we compare the rectangle properties - one of it' prop is 'area'
        System.out.println("       test2                         " +test2.area());
        System.out.println("       test3                         " +test3.area());
        System.out.println("       test4                         " +test4.area());
        System.out.println("       test5                         " +test5.area());
        System.out.println("    test1.compareTo(test2)           " +test1.compareTo(test2));
        System.out.println("    test1.compareTo(test3)           " +test1.compareTo(test3));
        System.out.println("    test1.compareTo(test4)           " +test1.compareTo(test4));
        System.out.println("    test1.compareTo(test5)           " +test1.compareTo(test5));
        //System.out.println(result);

    }

}
