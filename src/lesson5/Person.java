package lesson5;
/*
Создайте класс Person, содержащий
приватную переменную String name;
приватную переменную int age;
приватную переменную String country;

конструктор по умолчанию, устанавливающий
country = "RU";

конструктор с параметрами String name, int age,
вызывающий конструктор по умолчанию,
и устанавливающий значения переменным
name и age из соответствующих параметров;

публичные функции String getName(), int getAge(),
String getCountry(),
возвращающие значения соответствующих переменных
*/

public class Person //Создайте класс Person, содержащий
{
    private String name;//приватную переменную String name;
    private int age; //приватную переменную int age;
    private String country;//приватную переменную String country;
    public Person() {     //конструктор по умолчанию, устанавливающий
        country = "RU";            //конструктор по умолчанию, устанавливающий country = "RU";
    }
    Person (String name, int age)    //конструктор с параметрами String name, int age,
            {                              //вызывающий конструктор по умолчанию,
                this();
                this.name = name;          //и устанавливающий значения переменным
                this.age = age;            //name и age из соответствующих параметров;*/
            }
        public String getName()// v.2 String getName()// публичные функции
        {
            return name;// возвращающие значения соответствующих переменных
        }
        public int getAge()// int getAge()
        {
            //age+=3;
            return age;
        }
        public String getCountry() // String getCountry()
        {
            return country;
        }

    public static void main(String[] args) {
        //System.out.println(getAge());
    }
}

