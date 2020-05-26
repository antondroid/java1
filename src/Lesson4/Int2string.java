package Lesson4;
/*
Напишите метод, который складывает 2 числа,
как строки. Сигнатура метода
static int addAsStrings(int n1, int n2)

 */
public class Int2string {
        //public
        //static int n1;
        //static int n2;
        static int addAsStrings(int n1, int n2){
            //===================== these are the samples below
            //static String toString(int i) Представление числа строкой в 10-тичной системе счисления
            //String str = new String("Добро пожаловать  ");
            //Integer.valueOf(stout)   probably out 62+36 ==> 6236
            //Integer.parseInt(stout)   000555===>555
            String str1 = Integer.toString(n1);
            String str2 = Integer.toString(n2);
            String stout = str1 + str2;
            // System.out.println(str1);
            // System.out.println(str2);
            // System.out.println(stout);
            n1 = Integer.valueOf(stout);
            //System.out.println(n1);
            return n1;
        }

        public static void main(String[] args) {
            addAsStrings(36,10);
            System.out.println(addAsStrings(36,10));
        }
}
