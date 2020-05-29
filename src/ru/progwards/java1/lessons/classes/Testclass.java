package ru.progwards.java1.lessons.classes;

public class Testclass
{
    class Animal {
        public Animal() {
            System.out.println("Animal()");
        }

        public Animal(int i) {
            System.out.println("Animal(int)");
        }
    }

    class Duck extends Animal {
        public Duck() {
            System.out.println("Duck()");
        }
        public Duck(int i) {
            System.out.println("Duck(int)");
        }

    }

    public class TTest {
        public void main(String[] args) {
            //Animal a = new Animal(1);
            Duck d = new Duck(1);
        }
    }

    public static void main(String[] args) {
        //Duck.Duck();
//--------------------------------------------------
       // Duck d = new Duck(1);  //make static??????
//---------------------------------------------------
        System.out.println("Duck(int)");
    }
}
