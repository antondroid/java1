package Lesson8_hsh_eqls;

public class Dog implements Speaking, Eating {
    @Override
    public String say()
    { String say = "Гав";
        return say;
    }
    @Override
    public String eat()
    {
        String eat= "Мясо";
        return eat;
    }
    public static void main(String[] args) {
        Dog test1 = new Dog();
        test1.say();
        System.out.println(test1.say()+ "   "+test1.eat());
    }
}
