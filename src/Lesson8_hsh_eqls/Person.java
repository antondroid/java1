package Lesson8_hsh_eqls;
/* Создайте класс Person, а внутри него 2 класса

    вложенный класс Child1
    внутренний класс Child2

У каждого класса, Child1 и Child2 создайте метод String hello()

У Child1 String hello() должен вернуть "привет"
У Child2 String hello() должен вернуть "servus"*/
public class Person
{

   static class Child1   //nested
    {
        String hello()
        {
            String hello1="привет";
            return hello1;
        }
    }


    class Child2            //inner
    {
        String hello()
        {
            String hello2="servus";
            return hello2;
        }

    }


    public static void main(String[] args) {
        Person test1 =new Person();
        Child1 test11 = new Child1();

        System.out.println(test11.hello());
//---------------------------------------------------
        Person test2 = new Person();
        Person.Child2 test22 = test2. new Child2();
        System.out.println(test22.hello() );    //say "привет"



    }


}
