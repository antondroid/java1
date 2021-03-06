package ru.progwards.java1.SeaBattle.win22n;




import ru.progwards.java1.SeaBattle.SeaBattle;

import java.util.Arrays;

/*import ru.progwards.java1.SeaBattle.system.SeaBattle;
        import ru.progwards.java1.SeaBattle.system.SeaBattle.FireResult;
*/
public class SeaBattleAlg0 {
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
    /*VERSION 0.1  with the most comments. this version get 178 points
     0.2 - totally removed all messages and arrays, keep one only. 178 points 56 shots
     0.3 - add some messages, and checked with random ships config
     0.4.corrected get 192 or 185 points (uncommented fire)
     0.5 upto 227 points
     0.6 upto 242 points + stack clear -  less fail, but exist yet (1 of 8 running fails)
     ALg0- the copy of 0.6 version
     Alg1 - the same w/0 print output arrays. // removing doesn/t help.
     Alg2 - made of Alg0 removed HIT point defining from switch case directly. ()
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    * */

    int    v          = 0;
    int    h          = 0;
    String array1[][] = new String[10][10];


    public void Array1()   //
    {
        String put = ". ";//unknown square

        while ((v < 10)) {
            while ((h < 10)) {
                array1[v][h] = put;
                h++;
                System.out.print(put + " ");
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
        System.out.println("  ");
        System.out.println("   X  0  1  2  3  4  5  6  7  8  9  ---- array 2");
        System.out.println("Y  ");
        while ((v1 < 10)) {
            System.out.print(v1 + "     ");
            while ((h1 < 10)) {

                System.out.print(array1[v1][h1] + " ");
                h1++;

            }
            System.out.println();
            v1++;
            h1 = 0;
        }
        System.out.println("shot " + totalShot + " d=" + d + " x=" + x + " y=" + y + " killed  ship1= " + ship1 + "  ship2=" + ship2 + "  ship3=" + ship3 + "  ship4=" + ship4);
        // System.out.println("hitNumberF   " + hitNumberF);
        //v=0;h=0;
    }

    //-------------------------------------------------------------------
    boolean dirHorisontal    = false;
    boolean dirVertical      = false;
    boolean dirUp            = false;
    boolean dirDown          = false;
    boolean dirLeft          = false;
    boolean dirRight         = false;
    boolean gotocaseHit      = false;
    boolean over;
    boolean checkedDir       = false;
    boolean checkedHor       = false;
    boolean checkedUp        = false;
    boolean checkedDown      = false;
    boolean checkedRight     = false;
    boolean checkedLeft      = false;
    boolean checkedVert      = false;
    boolean checkedAll       = false;
    boolean shipServicing    = false;
    boolean changedDirection = false;
    int     hitNumber        = 0;
    int     hitNumberF;
    int     x0, x1, x2, x3, x4, x5, x6, y0, y1, y2, y3, y4, y5, y6;
    int array_x[] = {x1, x2, x3, x4, x5, x6};
    int array_y[] = {y1, y2, y3, y4, y5, y6};
    int ship1, ship2, ship3, ship4, ship5;
    //SeaBattle.FireResult fireResult;

    //--------------------------------------case HIT  -----------------------------------
    public void caseHit(SeaBattle seaBattle) {
        if ((hitNumber == 1) & (shipServicing == false))// we find the new ship
        {//keep original point
            shipServicing = true;
            y0 = y;
            x0 = x;
            changedDirection = false;
            //System.out.println(Arrays.toString(array_x)+ "  x");
            //System.out.println("print arrayInt " + (String)  Arrays.toString (array1 [y][x]));
            Array2();
            //------------------------------flag settings -----------------------------------------


            if ((y == 9)) checkedDown = true;
            if ((y == 0)) checkedUp = true;
            if ((x == 9)) checkedUp = true;
            if ((x == 0)) checkedLeft = true;
        }
        if ((shipServicing == true) & (changedDirection == true)) {
            y = y0;
            x = x0;
        }
        //------------------------------& flag settings ------------------------------------
        gotocaseHit = changedDirection = over = false;
        //-----------------------------------start  vertical fire - try 2 fire below hit  \|/
        if ((y < 9) & (checkedDown == false))   //check if it on down edge field
        {
            y++;//  set hit point below 1st hit
            dirDown = true;
        } else {
            if ((y > 0) & (checkedUp == false)) {
                if ((checkedDown == false)) {
                    y = y0;
                    x = x0;
                    checkedDown = true;
                }
                dirUp = true;
                dirDown = false;
                //if ((changedDirection==true)){ y= y0;}
                y--;
            } else {
                if ((x < 9) & (checkedRight == false)) {
                    if ((checkedUp == false)) {
                        y = y0;
                        x = x0;
                        checkedUp = true;
                    }
                    dirRight = true;
                    x++;
                    // if ((x>9)){}
                } else {
                    if ((x > 0) & (checkedLeft == false)) {
                        if ((checkedRight == false)) {
                            y = y0;
                            x = x0;
                            checkedRight = true;
                        }
                        dirLeft = true;
                        //if ((changedDirection==true))  x=x0;
                        x--;
                    }

                }
            }
        }

// -------------------------------------------firing 1 ----------------------------------------------------------------------------------------
        System.out.println(" y=" + y + " x=" + x + " y0=" + y0 +"  x0=" +x0 );
        if ((y >= 0) & (y <= 9) & (x >= 0) & (x <= 9) & (array1[y][x] != "c ") & (array1[y][x] != "C ") & (array1[y][x] != "H ") & (array1[y][x] != "D ")) //check below 1st hit - if it was already checked, go up
        {
            totalShot++;
            SeaBattle.FireResult fireResult = seaBattle.fire(x, y);
            switch (fireResult) {
                case HIT:  //check which type we need
                    // -----------------------------------array to find max cell
                    hitNumber++;
                    array_y[hitNumber] = y;
                    array_x[hitNumber] = x;
                    array1[y][x] = "H ";//put mark in our notepad
                    //Array2();
                    caseHit(seaBattle);
                    break;
                case DESTROYED: //check to close ship type
                    caseDestroyed(seaBattle);
                    break;
                case MISS: //do nothing
                    array1[y][x] = "C ";
                    Array2();
                    if ((dirDown == true)) {
                        checkedDown = true;
                        changedDirection = true;
                        dirDown = false;
                        gotocaseHit = true;
                    }
                    if ((dirUp == true) & (gotocaseHit == false)) {
                        dirUp = false;
                        checkedUp = true;
                        changedDirection = true;
                        gotocaseHit = true;
                    }
                    if ((dirRight == true) & (gotocaseHit == false)) {
                        dirRight = false;
                        checkedRight = true;
                        changedDirection = true;
                        gotocaseHit = true;
                    }
                    caseHit(seaBattle);
                    //if we go down, & miss, it mean, that we start from the middle
                    //so we turn back and start from original point +1 to accordingly direction
                    break;
                default:
                    break;
            }

        } else { //-------------v r here bcs of trying 2 fire 2 already checked field or outside square.
            //-------if fire 2 checked field, we repeat as MISS option.if try 2 fire outside, do nothing and go out
            if ((dirDown == true)) {
                checkedDown = true;
                changedDirection = true;
                dirDown = false;
                gotocaseHit = true;
            }
            if ((dirUp == true) & (gotocaseHit == false)) {
                dirUp = false;
                checkedUp = true;
                changedDirection = true;
                gotocaseHit = true;
            }
            if ((dirRight == true) & (gotocaseHit == false)) {
                dirRight = false;
                checkedRight = true;
                changedDirection = true;
                gotocaseHit = true;
            }
            caseHit(seaBattle);
        }


    //we come here because of the edge and continue to fire, so coordinates don't reset
return;
}//   end of method //we come here because of the edge and continue to fire, so coordinates don't reset
//----------------------------end firing 1 ----------------------------------------------------------------------




    //--------------------------- DESTROYED ---------------------------------------------
    public void caseDestroyed(SeaBattle seaBattle)
    {
        hitNumber++;
        array1[y][x] = "D ";
        Array2();
        array_y[hitNumber]=y;  // array to find max cell
        array_x[hitNumber]=x;
        Arrays.sort(array_x);
        dirHorisontal=dirVertical=false;
        int result1 = Double.compare(array_x[4],array_x[5]);
        switch (result1)
        {
            case 0: dirVertical=true;break;
            case 1: dirHorisontal=true;break;
            case -1: dirHorisontal=true;break;

        }
        Arrays.sort(array_y);
        int result2 = Double.compare(array_y[4],array_y[5]);
        switch (result2)
        {
            case 0: dirHorisontal=true;break;
            case 1: dirVertical=true;break;
            case -1: dirVertical=true;break;

        }

        if((dirVertical==true))
        {
            //-------------------- set side points for vertical ship
            int length1 = hitNumber ;     //ship length
            int maxLine=array_y[5] ;// max y  line
            int botLine=maxLine+1;
            int topLine=(maxLine)-hitNumber;

//------------------------- bot line --------------------------
            if ((botLine <= 9) & (dirVertical == true)) {
                array1[botLine][(x)] = "c ";
                if ((x+1) <= 9) array1[botLine][(x + 1)] = "c ";
                if ((x-1) >= 0) array1[botLine][(x - 1)] = "c ";
            }
            //Array2();
//-------------------------top line --------------------------------
            if ((topLine >= 0) & (dirVertical == true)) {
                array1[topLine][(x)] = "c ";
                if ((x+1) <= 9) array1[topLine][(x + 1)] = "c ";
                if ((x-1) >= 0) array1[topLine][(x - 1)] = "c ";
            }
            //Array2();
//-------------------------right side   ---------------------------
            if ((dirVertical == true) & ((x+1) <= 9)) {
                int i = length1;int j=maxLine;
                while (i > 0) {
                    array1[j][(x + 1)] = "c ";   //right top field
                    j--;i--;
                }
               // Array2();
            }
//-------------------- left side ----------------------------------
            if ((dirVertical == true) & ((x-1) >= 0)) {
                int i = length1;int j=maxLine;
                while (i > 0) {
                    array1[j][(x - 1)] = "c ";   //right top field
                    j--;i--;
                   // Array2();
                }
            }
        }
//----------------------& set side points for vertical ship ------------------------------

//---------------------- set top / bottom points for horizontal ship --------------------------
        if((dirHorisontal==true))
        {   int length1 = hitNumber ;     //ship length
            int maxLine=array_y[5] ;// max y  line
            int maxColumn=array_x[5] ;// max x line
            int minColumn=maxColumn-hitNumber+1;
            int rightSide=maxColumn+1;
            int leftSide=minColumn-1;
            int botLineHor=maxLine+1;
            int topLineHor=maxLine-1;
            //-------------------------top line --------------------------------
            if ((topLineHor >= 0))
            {
                int i=length1; int j=maxColumn;
                while ((i>0) )
                    {
                        array1[topLineHor][(j)] = "c ";
                        j--;
                        i--;
                    }
            }
            //Array2();
            //------------------------- bot line --------------------------
            if ((botLineHor <= 9))
            {
                int i=length1;int j=maxColumn;
                while  ((i>0))
                {
                    array1[botLineHor][(j)] = "c ";
                    j--;
                    i--;
                   //Array2();
                }
            }
    //-------------------------right side   ---------------------------
            if ((rightSide <= 9))
            {
                if ((topLineHor>=0))array1[topLineHor][(rightSide)] = "c ";   //left top field
                array1[maxLine][(rightSide)] = "c ";   //right top field
                if ((botLineHor<=9))array1[botLineHor][(rightSide)] = "c ";   //left top field
              // Array2();
            }
    //-------------------- left side ----------------------------------
            if ((leftSide >= 0))
            {
                if ((topLineHor>=0))array1[topLineHor][(leftSide)] = "c ";   //left top field
                array1[maxLine][(leftSide)] = "c ";   //right top field
                if ((botLineHor<=9))array1[botLineHor][(leftSide)] = "c ";   //left bot field
               // Array2();
            }
        }

//------------------------  & set top / bottom points for horizontal ship
switch (hitNumber)
{
    case 1: ship1++;break;
    case 2: ship2++;break;
    case 3: ship3++;break;
    case 4: ship4++;break;
}
       System.out.println( "repeated shot "+totalShot+  " ship1= "+ ship1+"  ship2="+ship2+"  ship3="+ship3 +"  ship4="+ship4     );

//-----------------clear buffer------------------------------------
        hitNumber=5;
        while (hitNumber!=0)
        {
            array_x[hitNumber]=0;
            array_y[hitNumber]=0;
            hitNumber--;
        }
        checkedAll=checkedLeft=checkedRight=checkedUp=checkedDown=shipServicing=dirVertical=dirHorisontal = false;
        dirLeft=dirRight=dirUp=dirDown=gotocaseHit=changedDirection=false;
        over =true;
        return;
    }
//---------------------------------- & DESTROYED -------------------------------------------

    //----------------------------  MISS -----------------------------------------------
    public void caseMiss(SeaBattle seaBattle)
    {
        array1[y][x] = "C ";   //little c -from sophisticated, big C -  from firing
        //Array2();
    }

    //----------------------------- & MISS ---------------------------------------------
//-------------------------- Decision  ---------------------------------------------------
   /* public void decision (SeaBattle  seaBattle)
    {
        switch (fireResult)
        {
            case HIT:  //check which type we need
                //array1[y][x]="H ";
               // System.out.println(fireResult + " switch casehit ");
                caseHit(seaBattle);
                break;
            case DESTROYED: //check to close ship type
               // System.out.println(fireResult + " switch casehit ");
                caseDestroyed(seaBattle);
                break;
            case MISS: //do nothing
               // System.out.println(fireResult + " switch casehit ");
               // System.out.println(x + "  " + y);
                caseMiss(seaBattle);
                v = v + 4;
                break;
            default:   //do nothing
                break;
        }
    }*/

//------------------------- Decision -----------------------------------------
    int x = 0;
    int y = 0;
    int d=3;
    int totalShot=0;

    public void battleAlgorithm(SeaBattle seaBattle)
    {
        Array1();// 1.create firing notepad
        label: while ( !((ship1==4)& (ship2==3)&(ship3==2)&(ship4==1)))    //original string
        {
            while (h <= 9)
            {
                if (h > 0) v = ~(h) + 1;
                v -= d;
//---------------------------------------vertical fire----------------------------------
      label2:   while ((v <=9) | (y <= 9))
                {
                    if (((ship1==4)& (ship2==3)&(ship3==2)&(ship4==1))) break label;
                    //if ((d==3)&(over==true)&(v>9) ) break label2;
                    if ((v < -12)) v = v + 12;

                    else if (v < -8) {
                        v = v + 8;
                    } else {
                        if (v < -4) {
                            v = v + 4;
                        }
                    }
                    v = v + 4;
                    if ((v > 9)&(over==true)) break label2;
                    if ((v > 9)) break;
                    x = h;
                    y = v;
//--------------------------------- firing -------------------------------------------------------
                    if ((y>=0)&(y<=9)&(x>=0)&(x<=9)&(array1[y][x] != "c ") &  (array1[y][x] != "C ") & (array1[y][x] != "H ") & (array1[y][x] != "D ")) //check up
                    {
                        SeaBattle.FireResult fireResult = seaBattle.fire(x, y);totalShot++;
                        checkedAll = checkedLeft = checkedRight = checkedUp = checkedDown = false;
                        switch (fireResult)
                            {
                                case HIT:  //check which type we need
                                    hitNumber++;
                                    array_y[hitNumber]=y;
                                    array_x[hitNumber]=x;
                                    array1[y][x] = "H ";//put mark in our notepad
                                    Array2();
                                    caseHit(seaBattle);
                                    break;
                                case DESTROYED: //check to close ship type
                                    caseDestroyed(seaBattle);
                                    break;
                                case MISS: //do nothing
                                    caseMiss(seaBattle);
                                    break;
                                default:   //do nothing
                                    break;
                            }
                            Array2();
                            System.out.println( "d=" +d+ "  x=" + x +  "  y="+y + "  hitNumberF   " + hitNumberF);
                    }
                    else
                           if((totalShot>1))
                           {
                               System.out.println("repeated shot " + totalShot + " d=" + d + " x=" + x + " y=" + y + " killed  ship1= " + ship1 + "  ship2=" + ship2 + "  ship3=" + ship3 + "  ship4=" + ship4);
                           }
//---------------------------------------& firing------------------------------

                }
                over=false;
//-----------------end vertical fire
                h++;
            }
//------------------------------------& horizontal fire cycle -------------------------
            v=h=0;
            System.out.println( "inside killed  ship1= "+ ship1+"  ship2="+ship2+"  ship3="+ship3 +"  ship4="+ship4     );
            System.out.println( "d=" +d+ "  x=" + x +  "  y="+y + " horizontal fire cycle  hitNumberF   " + hitNumberF);
            switch (d)
            {
               /* case 0:break;
                case 1: d=3;break;
                case 3: d=4;break;
                case 4: d=2;break;
                default: d=8; break; //do nothing 178*/
                case 0: ;break;
                case 3: d=1;break;
                case 1: d=2;break;
                case 2: d=0;break;
                default: break; //do nothing
            }
            System.out.println( "d=" +d+ "  x=" + x +  "  y="+y + "  hitNumberF   " + hitNumberF);

        }
            //Array2();
    }


    // функция для отладки
    public static void main(String[] args)
        {
         //SeaBattle seaBattle = new SeaBattle(true);    //true config
         SeaBattle seaBattle = new SeaBattle();      //random config
            new SeaBattleAlg0().battleAlgorithm(seaBattle);
            System.out.println(seaBattle.getResult());
            System.out.println(seaBattle);
        }
}

