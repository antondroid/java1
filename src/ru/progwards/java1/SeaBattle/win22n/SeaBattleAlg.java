package ru.progwards.java1.SeaBattle.win22n;



import Lesson6.CompareTo;
import ru.progwards.java1.SeaBattle.SeaBattle;
import ru.progwards.java1.lessons.arrays.ArraySort;

import java.lang.reflect.Array;
import java.util.Arrays;

/*import ru.progwards.java1.SeaBattle.system.SeaBattle;
        import ru.progwards.java1.SeaBattle.system.SeaBattle.FireResult;
*/
public class SeaBattleAlg {
    // Тестовое поле создаётся конструктором
    //     SeaBattle seaBattle = new SeaBattle(true);
    //
    // Обычное поле создаётся конструктором по умолчанию:
    //     SeaBattle seaBattle = new SeaBattle();
    //     SeaBattle seaBattle = new SeaBattle(false);
    //
    // Посомтреть результаты стрельбы можно в любой момент,
    // выведя объект класса SeaBattle на консоль. Например так:
    //     System.out.println(seaBattle);
    //
    //
    // Вид тестового поля:
    //
    //           0 1 2 3 4 5 6 7 8 9    координата x
    //         0|.|.|.|.|.|.|.|X|.|.|
    //         1|.|.|.|.|.|X|.|.|.|.|
    //         2|X|X|.|.|.|.|.|.|.|.|
    //         3|.|.|.|.|.|.|.|X|X|X|
    //         4|.|.|.|.|X|.|.|.|.|.|
    //         5|.|.|.|.|X|.|.|Х|.|.|
    //         6|.|.|.|.|.|.|.|Х|.|X|
    //         7|X|.|X|.|.|.|.|Х|.|X|
    //         8|X|.|.|.|.|.|.|X|.|.|
    //         9|X|.|.|.|X|.|.|.|.|.|
//--------------------------------------------------------------------------
  /*  public void battleAlgorithm(SeaBattle seaBattle) {
        // пример алгоритма:
        // стрельба по всем квадратам поля полным перебором
        for (int y = 0; y < seaBattle.getSizeX(); y++) {
            for (int x = 0; x < seaBattle.getSizeY(); x++) {
                SeaBattle.FireResult fireResult = seaBattle.fire(x, y);
                System.out.println(fireResult);
            }
        }
    }
*/
    //--------------------------------------------------------------------

    int v             = 0;
    int h             = 0;
    String array1[][] = new String[10][10];


    public void Array1()   //
    {
        String put = ". ";//unknown square

        while ((v < 10)) {
            while ((h < 10)) {
                array1[v][h] = put;
                h++;
                System.out.print(put + " ");
                //System.out.print(array1[v][h]+" ");
            }
            System.out.println();
            v++;
            h = 0;
        }

        v = 0;
        h = 0;
    }
//--------------------------------------------------------------------

    //--------------------------------------------------------------------
    public void Array2()   //
    {
        //String put = "N ";//unknown square
        int v1 = 0;
        int h1 = 0;
        System.out.println(" array 2");
        while ((v1 < 10)) {
            while ((h1 < 10)) {
                //array1[v][h];
                System.out.print(array1[v1][h1] + " ");
                h1++;

            }
            System.out.println();
            v1++;
            h1 = 0;
        }

        //v=0;h=0;
    }

    //-------------------------------------------------------------------
    boolean dirHorisontal = false;
    boolean dirVertical = false;
    boolean dirUp         = false;
    boolean dirDown=false;
    boolean dirLeft=false;
    boolean dirRight=false;
    boolean checkedDir=false;
    boolean checkedHor=false;
    boolean checkedUp=false;
    boolean checkedDown=false;
    boolean checkedRight=false;
    boolean checkedLeft=false;
    boolean checkedVert=false;
    boolean checkedAll=false;
    boolean shipServicing=false;
    int     hitNumber     = 0;
    int x0,x1,x2,x3,x4,x5,x6,y0,y1,y2,y3,y4,y5,y6;
    int array_x[] ={x1,x2,x3,x4,x5};
    int array_y[]={y1,y2,y3,y4,y5};
    //--------------------------------------case HIT  -----------------------------------
    public void caseHit(SeaBattle seaBattle) {
        if (hitNumber==1)// we find the new ship
        {shipServicing=true; y0=y;x0=x; } //keep original point
        //else hitNumber++;
        //shipServicing=true;

       array_y[hitNumber]=y;  // array to find max cell
        array_x[hitNumber]=x;
        System.out.println(Arrays.toString(array_y) + "  y" );
        System.out.println(Arrays.toString(array_x)+ "  x");

        //System.out.println("print arrayInt after filling                     " + (String)  Arrays.toString (array1 [y][x]));
        System.out.println(" arrayInt point" + (String) (array1[y][x]));
        Array2();
//-------------        //--------------------------------check vertical fire - try 2 fire below hit
        if ((y < 9)&(checkedDown==false))   //check if it on down edge field
        {
            y++;//  set hit point below 1st hit
            System.out.println("we go down y= " + y + "y0= "+ y0 );
            if ((array1[y][x] != "C ")) //check below 1st hit - if it was already checked, go up
            {
                dirVertical=true;dirDown=true;  //    dirDown probably!
                SeaBattle.FireResult fireResult = seaBattle.fire(x, y);
                System.out.println(fireResult);
                switch (fireResult)
                {
                    case HIT:  //check which type we need
                        //array1[y][x]="H ";
                        System.out.println(fireResult + " switch case hit ");
                        System.out.println(x + " x   y " + y);
                        array1[y][x] = "H ";//put mark in our notepad
                        hitNumber++;
                        caseHit(seaBattle);
                        break;
                    case DESTROYED: //check to close ship type
                        System.out.println(fireResult + " switch case hit destroyed ");
                        System.out.println(x + " x   y " + y);
                        caseDestroyed(seaBattle);
                        break;
                    case MISS: //do nothing
                        System.out.println(fireResult + " switch casehit ");
                        System.out.println(x + " x   y " + y);
                        //array1[y][x] = "c ";//put mark in our notepad
                        checkedDown=true;
                        array1[y][x] = "C ";
                        if ((checkedAll==false)){x=x0;y=y0;caseHit(seaBattle); }
                        //caseMiss(seaBattle);
                        break;
                    default:   //do nothing
                        break;
                }Array2();


            }

        }
//------------------------------------         // if below already miss we must go up

            if  ((y > 0)& (checkedUp==false) )        //check if it on upper edge field
            {
                y--;   //  set hit point above 1st hit
                System.out.println("print array1 we go up" + (array1[y][x]));
                if ((array1[y][x] != "C ")) //check up
                {   dirVertical=true;
                    dirUp = true;  // if below miss probably we must go up
                    SeaBattle.FireResult fireResult = seaBattle.fire(x, y);
                    System.out.println(fireResult);
                    //dirHorisontal = true;
                    switch (fireResult)
                    {
                        case HIT:  //check which type we need
                            array1[y][x]="H ";hitNumber++;
                            //System.out.println(fireResult + " switch case hit go up ");
                            System.out.println(x + " x   y " + y);
                            caseHit(seaBattle);
                            break;
                        case DESTROYED: //check to close ship type
                            //System.out.println(fireResult + " switch case dest go up ");
                            System.out.println(x + " x   y " + y);
                            caseDestroyed(seaBattle);
                            break;
                        case MISS: //do nothing
                            //System.out.println(fireResult + " switch case miss go up");
                            System.out.println(x + " x   y " + y);
                            checkedUp=true;
                            array1[y][x] = "C ";
                            if ((checkedAll==false)){x=x0;y=y0;caseHit(seaBattle); }
                            //caseMiss(seaBattle);
                            break;
                        default:   //do nothing
                            break;
                    }
                    Array2();
                    //call check horisontal now
                }
            }
        //
         //we will check horizontal direction

//--------- go right ---------------------------------------
            if ((x<9) &(checkedRight==false ))
            {
                x++;
                System.out.println("we go right y= " + y + "y0= "+ y0 );
                if ((array1[y][x] != "C ")) //check right of 1st hit - if it was already checked, go left
                {
                    dirHorisontal=true;dirRight=true;  //    dirRight probably! try left then.
                    SeaBattle.FireResult fireResult = seaBattle.fire(x, y);
                    System.out.println(fireResult);
                    switch (fireResult)
                    {
                        case HIT:  //check which type we need
                            array1[y][x]="H ";hitNumber++;
                            System.out.println(fireResult + " switch case hit go right  ");
                            System.out.println(x + " x   y " + y);
                            caseHit(seaBattle);
                            break;
                        case DESTROYED: //check to close ship type
                            System.out.println(fireResult + " switch case hi go right  ");
                            System.out.println(x + " x   y " + y);
                            caseDestroyed(seaBattle);
                            break;
                        case MISS: //do nothing
                            System.out.println(fireResult + " switch case hit go right");
                            System.out.println(x + " x   y " + y);
                            checkedRight=true;
                            array1[y][x] = "C ";
                            if ((checkedAll==false)){x=x0;y=y0;caseHit(seaBattle); }
                            //caseMiss(seaBattle);
                            break;
                        default:   //do nothing
                            break;
                    }
                }
            }else {checkedRight=true;  x=x0;y=y0; }
 //--------------------- check it left now ----------------------------------
            if  ((x>0)  &(checkedLeft==false))
            {
                x--;
                System.out.println("we go right y= " + y + "y0= "+ y0 );
                if ((array1[y][x] != "C ")) //check 2 the left from the 1st hit - if it was already checked, it's the end.
                {
                    dirHorisontal=true;dirLeft=true;  //    dirRight probably! try left then.
                    SeaBattle.FireResult fireResult = seaBattle.fire(x, y);
                    System.out.println(fireResult);
                    switch (fireResult)
                    {
                        case HIT:  //check which type we need
                            array1[y][x]="H ";hitNumber++;
                            System.out.println(fireResult + " switch case hit go right  ");
                            System.out.println(x + " x   y " + y);
                            caseHit(seaBattle);
                            break;
                        case DESTROYED: //check to close ship type
                            System.out.println(fireResult + " switch case hi go right  ");
                            System.out.println(x + " x   y " + y);
                            caseDestroyed(seaBattle);
                            break;
                        case MISS: //do nothing
                            System.out.println(fireResult + " switch case hit go right");
                            System.out.println(x + " x   y " + y);
                            checkedLeft=true;checkedAll=true;
                            array1[y][x] = "C ";
                            //if ((checkedAll==false)){x=x0;y=y0;caseHit(seaBattle); }
                            //caseMiss(seaBattle);
                            break;
                        default:   //do nothing
                            break;
                    }
                }
            }

    }
//-------------------------- & case HIT ---------------------------------------------

    //--------------------------- DESTROYED ---------------------------------------------
    public void caseDestroyed(SeaBattle seaBattle) {
        hitNumber++;
        array1[y][x] = "D ";
        Array2();
        //if (hitNumber==0) {y0=y;x0=x; }  //keep original point
        array_y[hitNumber]=y;  // array to find max cell
        array_x[hitNumber]=x;
        System.out.println(Arrays.toString(array_y) + "  y" );
        System.out.println(Arrays.toString(array_x)+ "  x");
        Arrays.sort(array_x);
        System.out.println(Arrays.toString(array_x)+ "x sorted" );

        int result1 = Double.compare(array_x[3],array_x[4]);
        switch (result1)
        {
            case 0: dirVertical=true;break;
            case 1: dirHorisontal=true;break;
            case -1: dirHorisontal=true;break;

        }
        /*int result2 = Double.compare(array_x[1],array_x[2]);
        int result3 = Double.compare(array_x[2],array_x[3]);*/
       // result = Double.compare(this.area(), anRectangle.area()); // sample
        Arrays.sort(array_y);
        System.out.println(Arrays.toString(array_y)+ "y sorted");
        int result2 = Double.compare(array_y[3],array_y[4]);
        switch (result2)
        {
            case 0: dirHorisontal=true;break;
            case 1: dirVertical=true;break;
            case -1: dirVertical=true;break;

        }
//-------------------- set side points for vertical ship
        int length1 = hitNumber ;     //ship length
        int maxLine=array_y[4] ;// max y  line
        int minLine=maxLine-hitNumber;
        int botLine=maxLine+1;
        int topLine=maxLine-hitNumber;
        if((dirHorisontal==false))
        {
//------------------------- bot line --------------------------
            if ((botLine <= 9) & (dirVertical == true)) {
                array1[botLine][(x)] = "C ";
                if (x < 9) array1[botLine][(x + 1)] = "C ";
                if (x > 0) array1[botLine][(x - 1)] = "C ";
            }
//-------------------------top line --------------------------------
            if ((topLine >= 0) & (dirVertical == true)) {
                array1[topLine][(x)] = "C ";
                if (x < 9) array1[topLine][(x + 1)] = "C ";
                if (x > 0) array1[topLine][(x - 1)] = "C ";
            }
            Array2();
//-------------------------right side   ---------------------------
            if ((dirVertical == true) & (x < 9)) {
                int i = length1;
                while (i >= 0) {
                    array1[maxLine][(x + 1)] = "C ";   //right top field
                    maxLine--;
                    i--;
                }Array2();
            }
//-------------------- left side ----------------------------------
            if ((dirVertical == true) & (x > 0)) {
                int i = length1;
                while (i >= 0) {
                    array1[maxLine][(x - 1)] = "C ";   //right top field
                    maxLine--;
                    i--;
                }

            }Array2();

        }
//----------------------& set side points for vertical ship ------------------------------

//---------------------- set top / bottom points for vertical ship --------------------------

//------------------------  & set top / bottom points for vertical ship

//-----------------clear buffer------------------------------------
        hitNumber=4;
        while (hitNumber!=0)
        {
            array_x[hitNumber]=0;
            array_y[hitNumber]=0;
            hitNumber--;
        }
        System.out.println(Arrays.toString(array_x)+ "x sorted" );
        System.out.println(Arrays.toString(array_y)+ "y sorted");
        checkedAll=checkedLeft=checkedRight=checkedUp=checkedDown=true;

    }



//---------------------------------- & DESTROYED -------------------------------------------

    //----------------------------  MISS -----------------------------------------------
    public void caseMiss(SeaBattle seaBattle)
    {
        array1[y][x] = "C ";   //little c - from firing, big C - from sophisticated
        /*Array2();
        if ((checkedAll==false)& (shipServicing==true) &(checkedLeft==false))
            {x=x0;y=y0;caseHit(seaBattle); }  //go up
        else
            {x=x0;y=y0;}//do nothing//do nothing*/
    }

    //----------------------------- & MISS ---------------------------------------------
//-------------------------- Decision  ---------------------------------------------------
   /* public void decision (SeaBattle  seaBattle)
    {
        switch (fireResult)
        {
            case HIT:  //check which type we need
                //array1[y][x]="H ";
                System.out.println(fireResult + " switch casehit ");
                caseHit(seaBattle);
                break;
            case DESTROYED: //check to close ship type
                System.out.println(fireResult + " switch casehit ");
                caseDestroyed(seaBattle);
                break;
            case MISS: //do nothing
                System.out.println(fireResult + " switch casehit ");
                System.out.println(x + "  " + y);
                caseMiss(seaBattle);
                v = v + 4;
                break;
            default:   //do nothing
                break;
        }
    }*/

//------------------------- Decision -----------------------------------------
    //SeaBattle seaBattle;
    int x = 0;
    int y = 0;

    public void battleAlgorithm(SeaBattle seaBattle)
    {
        Array1();// 1.create firing notepad
        while (h < 10)
        {
            System.out.println(v + "  " + h);
            if (h > 0) v = ~(h) + 1;
            System.out.println(v + "  " + h);
            v -= 1;
            System.out.println(v);
            while ((v < 10) | (y < 10))
            {
                if (v < -8)
                {
                    v = v + 8;
                }
                else {
                        if (v < -4)
                            {
                             v = v + 4;
                            }
                     }
                v = v + 4;
                if (v > 9) break;
                x = h;
                y = v;
                if ((array1[y][x] != "C ")) //check up
                {
                    SeaBattle.FireResult fireResult = seaBattle.fire(x, y);
                    System.out.println(fireResult);
                    checkedAll=checkedLeft=checkedRight=checkedUp=checkedDown=false;

                    switch (fireResult) {
                        case HIT:  //check which type we need
                            System.out.println(fireResult + " switch main");
                            array1[y][x] = "H ";//put mark in our notepad
                            hitNumber++;
                            caseHit(seaBattle);
                            break;
                        case DESTROYED: //check to close ship type
                            System.out.println(fireResult + " switch");
                            caseDestroyed(seaBattle);
                            break;
                        case MISS: //do nothing
                            System.out.println(fireResult + " switch");
                            System.out.println(x + "  " + y);
                            caseMiss(seaBattle);
                            //v=v+4;
                            break;
                        default:   //do nothing
                            break;
                    }
                }
            }
            h++;
        }

        Array2();
    }


    // функция для отладки
    public static void main(String[] args)
        {
        System.out.println("Sea battle");

        SeaBattle seaBattle = new SeaBattle(true);
        new SeaBattleAlg().battleAlgorithm(seaBattle);

        System.out.println(seaBattle.getResult());
        System.out.println(seaBattle);
        }
}

