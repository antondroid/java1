package ru.progwards.java1.lessons.basics;

public class Astronomy {
    public static Double r;
    public static double s1;                                       //Во всех функциях, где это необходимо, считаем число π = 3.14

    public static Double sphereSquare(Double r) { //которая вычисляет площадь поверхности сферы// радиуса R по формуле S = 4πR2.
        int b2 = 2;
        s1 = Math.pow(r, 2) * 4 * 3.14;
        // System.out.println("площадь сферы с радиусом " + r +" = " + s1 + " km.kv");
        return s1;
    }

    public static double sEarth;
    public static double rEarth = 6.3712e3;

    public static Double earthSquare() {// площадь поверхности Земли, радиус 6 371.2 км
        r = rEarth;
        sphereSquare(r);
        sEarth = s1;
        //   System.out.println("площадь Earth с радиусом " + rEarth +" = " + sEarth + " km.kv");
        return sEarth;
    }

    public static double sMerc;
    public static double rMerc = 2.4397e3;

    public static Double mercurySquare() {// площадь поверхности Меркурия,радиус 2 439,7 км
        r = rMerc;
        sphereSquare(r);
        sMerc = s1;
        //  System.out.println("площадь sMerc с радиусом " + rMerc + " = " + sMerc + " km.kv");
        return sMerc;
    }

    public static double sJup;
    public static double rJup = 71.492e3;

    public static Double jupiterSquare() {//площадь поверхности Юпитера,радиус 71 492 км
        r = rJup;
        sphereSquare(r);
        sJup = s1;
        //   System.out.println("площадь sJup с радиусом " + rJup + " = " + sJup + " km.kv");
        return sJup;

    }

    public static double eaMercRatio;

    public static Double earthVsMercury() {//отношение поверхности Земли к поверхности Меркурия ratio
        eaMercRatio = earthSquare() / mercurySquare();
        //   System.out.println("earthVsMercury" + " = " + eaMercRatio + " times ");
        return eaMercRatio;
    }

    public static double eaJupRatio;

    public static Double earthVsJupiter() {//отношение поверхности Земли к поверхности Юпитера ratio
        eaJupRatio = earthSquare() / jupiterSquare();
        //   System.out.println("earthVsJupiter" + " = " + eaJupRatio + " times");
        return eaJupRatio;
    }


    public static void main(String[] args) {
/*        System.out.println("========= main ==========");
        System.out.println("sphere  = "+sphereSquare(1.0));
        System.out.println("earth  = "+earthSquare());
        System.out.println("mercurySquare  = "+mercurySquare());
        System.out.println("jupiterSquare  = "+jupiterSquare());
        System.out.println("earthVsMercury  = "+earthVsMercury());
        System.out.println("earthVsJupiter  = "+earthVsJupiter());
        System.out.println("========= end of main ==========");
        sphereSquare(1.0);
        earthSquare();
        mercurySquare();
        jupiterSquare();
        earthVsMercury();
        earthVsJupiter();

        System.out.println("площадь Earth с радиусом " + rEarth +" = " + sEarth + " km.kv");
 */
    }

}
