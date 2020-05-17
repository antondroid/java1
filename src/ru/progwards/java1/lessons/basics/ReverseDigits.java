package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number){
        int n = 12345678;
        System.out.println(n);

        int n1 = 0;
        while(n != 0){
            n1 = n1*10 + n%10;
            n /= 10;
        }
        System.out.println(n1);
        return (n1);

    }

}