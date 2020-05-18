package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    //объём шара 4/3πR3.     6.3712e3
    //------------        3.1 Реализовать функцию которая будет возвращать
    // объём шара с радиусом radius и основана на типе double.
    public static double radius;
    public static float radiusFl;
    public static double volumeBallDouble;
    public static float volumeBallFloat;
    public static double calculateAccuracy;
    public static double volumeBallDouble(double radius){
        volumeBallDouble = Math.pow(radius, 3.0d) * 4.0d/3.0d * 3.14d;
        //System.out.println("volumeBallDouble " + radius +" = " + volumeBallDouble + " km.kv");
        return volumeBallDouble;
    }
    //------------        3.2 Реализовать функцию которая будет возвращать
    // объём шара с радиусом radius и основана на типе float.
    public static float volumeBallFloat(float radius) {
        radiusFl = (float) radius;
        volumeBallFloat = (float)  (Math.pow(radiusFl, 3.0f) * 4.0f/3.0f * 3.14f);
        //System.out.println("volumeBallFloat " + radiusFl +" = " + volumeBallFloat + " km.kv");
        return volumeBallFloat;
    }
    //------------        3.3 Реализовать функцию которая будет возвращать
    // разницу между функциями volumeBallDouble и volumeBallFloat
    // (они должны быть вызваны из неё с параметром radius).
    public static double calculateAccuracy(double radius){
        radiusFl = (float) radius;
        calculateAccuracy = (volumeBallDouble(radius) - (double) volumeBallFloat(radiusFl));
        //System.out.println("calculateAccuracy" + " = " + calculateAccuracy + " km.kv");
        return calculateAccuracy;
    }


    //для получения значения типа float из параметра типа double используйте конструкцию: (float) radius;
    // после создания функций для вычисления объёма проверьте результат на радиусе равном 1, если функция вернёт Pi, то думайте... .



    public static void main(String[] args) {

        volumeBallDouble(6.3712e3);
        volumeBallFloat(6.3712e3f);
        calculateAccuracy(6.3712e3d);


    }
}