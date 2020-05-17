package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number) {
        int n1 = 0;
        while (number != 0) {
            n1 = n1 * 10 + number % 10;  //528%10==8
            number /= 10; // 3/10==0
        }
        return (n1);
    }

    public static void main(String[] args) {
        System.out.println("reverse = " + reverseDigits(38625));
    }

}