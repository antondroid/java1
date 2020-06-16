package Lesson8_hsh_eqls;

public class  Goat implements Speaking, Eating{
    public String say()
    { String say = "Мее";
        return say;
    }
    public String eat()
    {
        String eat= "Сено";
        return eat;
    }
    public static void main(String[] args) {
        Goat test1 = new Goat();
        test1.say();
        System.out.println(test1.say()+ "   "+test1.eat());
    }
}
