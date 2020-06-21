package ru.progwards.java1.SeaBattle.win22n;



import ru.progwards.java1.SeaBattle.SeaBattle;

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
    boolean dirUp         = false;
    boolean dirDown=false;
    boolean dirLeft=false;
    boolean dirRight=false;
    int     hitNumber     = 0;
    int x0,x1,x2,x3,x4,y0,y1,y2,y3,y4;
    int array_x[] ={x1,x2,x3,x4};
    int array_y[]={y1,y2,y3,y4};
    //--------------------------------------case HIT  -----------------------------------
    public void caseHit(SeaBattle seaBattle) {
        /*if (hitNumber == 0) {
            hitNumber = 1;
        } else {
            hitNumber++;
        }*/

        switch (hitNumber){
            case 0: x1=x;y1=y;
            case 1: x2=x;y2=y;
            case 2: x3=x;y3=y;
            case 3: x4=x;y4=y;
        }
        if ((hitNumber > 0) & (dirUp = true)&(x<9)) {
            array1[y][x + 1] = "C ";
        }
        if ((hitNumber > 0) & (dirUp = true)&(x>0)) {
            array1[y][x - 1] = "C ";
        }
        array1[y][x] = "H ";  //put mark in our notepad
        if (hitNumber==0) y0=y;  //keep original point
       array_y[hitNumber]=y;  // array to find max cell
        //System.out.println("print arrayInt after filling                     " + (String)  Arrays.toString (array1 [y][x]));
        System.out.println("print arrayInt after filling                     " + (String) (array1[y][x]));
        //--------------------------------check vertical fire - try 2 fire below hit
        if (y < 9)   //check if it on down edge field
        {
            y++;//  set hit point below 1st hit
            System.out.println("we go down y= " + y + "y0= "+ y0 );
            if ((array1[y][x] != "C ")) //check below 1st hit - if it was already checked, go up
            {
                SeaBattle.FireResult fireResult = seaBattle.fire(x, y);
                System.out.println(fireResult);
                switch (fireResult)
                {
                    case HIT:  //check which type we need
                        //array1[y][x]="H ";
                        System.out.println(fireResult + " switch casehit ");
                        System.out.println(x + " x   y " + y);
                        caseHit(seaBattle);
                        break;
                    case DESTROYED: //check to close ship type
                        System.out.println(fireResult + " switch casehit ");
                        System.out.println(x + " x   y " + y);
                        caseDestroyed(seaBattle);
                        break;
                    case MISS: //do nothing
                        System.out.println(fireResult + " switch casehit ");
                        System.out.println(x + " x   y " + y);
                        caseMiss(seaBattle);
                        break;
                    default:   //do nothing
                        break;
                }


            }
        }
        else  // if below already miss we must go up
        {
            if (y > 0)         //check if it on upper edge field
            {
                y--;   //  set hit point above 1st hit
                dirUp = true;  // if below miss we must go up
                System.out.println("print array1 we go up" + (array1[y][x]));
                if ((array1[y][x] != "C ")) //check up
                {
                    SeaBattle.FireResult fireResult = seaBattle.fire(x, y);
                    System.out.println(fireResult);
                    //dirHorisontal = true;
                    switch (fireResult)
                    {
                        case HIT:  //check which type we need
                            //array1[y][x]="H ";
                            System.out.println(fireResult + " switch casehit go up ");
                            System.out.println(x + " x   y " + y);
                            caseHit(seaBattle);
                            break;
                        case DESTROYED: //check to close ship type
                            System.out.println(fireResult + " switch casehit go up ");
                            System.out.println(x + " x   y " + y);
                            caseDestroyed(seaBattle);
                            break;
                        case MISS: //do nothing
                            System.out.println(fireResult + " switch casehit go up");
                            System.out.println(x + " x   y " + y);
                            caseMiss(seaBattle);
                            break;
                        default:   //do nothing
                            break;
                    }
                    Array2();
                    //call check horisontal now
                }
            }
        }


    }
//-------------------------- & case HIT ---------------------------------------------

    //--------------------------- DESTROYED ---------------------------------------------
    public void caseDestroyed(SeaBattle seaBattle) {
        hitNumber++;
        array1[y][x] = "D ";
        x4=x;y4=y;
        System.out.println( "kill" + hitNumber + "point ship" );
        if (hitNumber==1) {
            x1=x4;y1=y4;

        }

//-------------------- set side points for vertical ship
        if ((hitNumber > 0) & (dirUp = true)&(x<9)) {
            array1[y][x + 1] = "C ";
        }
        if ((hitNumber > 0) & (dirUp = true)&(x>0)) {
            array1[y][x - 1] = "C ";
        }Array2();
//----------------------& set side points for vertical ship ------------------------------

//---------------------- set top / bottom points for vertical ship --------------------------
        if ((hitNumber > 0) & (dirUp = true)&(y<9)) {    //bottom
            if (y4>y1) //(D is below)
            {
                if (y4<9) array1[y4+1][x ] = "C ";
                if ((x<9)& (y4<9)) array1[y4+1][x + 1] = "C ";
                if ((x>0)& (y4<9)) array1[y4+1][x - 1] = "C ";
            }
            if (y4<y1)           //y4<y1  (D is above)
                {
                    if (y4>0) array1[y4-1][x ] = "C ";
                    if ((x<9)& (y4>0)) array1[y4-1][x + 1] = "C ";
                    if ((x>0)& (y4>0) ) array1[y4-1][x - 1] = "C ";
                }


        }
        if ((hitNumber > 0) & (dirUp = true)&(y>0)) {     //top
            if (y4>y1) //  (D is below)
            {
               if (y1>0) array1[y1-1][x ] = "C ";
                if ((x<9)& (y1>0)) array1[y1-1][x + 1] = "C ";
                if ((x>0)& (y1>0)) array1[y1-1][x - 1] = "C ";
            }
            if (y4<y1)   //y4<y1  (D is above)
            {
                if(y4>0)  array1[y4-1][x ] = "C ";
                if ((x<9)& (y4>0)) array1[y4-1][x + 1] = "C ";
                if ((x>0)& (y4>0)) array1[y4-1][x - 1] = "C ";
            }
        }Array2();

//------------------------  & set top / bottom points for vertical ship
     hitNumber=0;
    }



//---------------------------------- & DESTROYED -------------------------------------------

    //----------------------------  MISS -----------------------------------------------
    public void caseMiss(SeaBattle seaBattle) {

        array1[y][x] = "C ";
        Array2();
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

                    switch (fireResult) {
                        case HIT:  //check which type we need
                            System.out.println(fireResult + " switch");
                            //x=h;y=v;
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

