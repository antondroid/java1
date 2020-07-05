package ru.progwards.java1.lessons.interfaces;

public interface FoodCompare {
    int outPut =0;
    //-------------sample---------------------------------------------------
/*
public int compare(House h1, House h2) {
    if (h1.price == h2.price) {
        return 0;
    }
    if (h1.price > h2.price) {
        return 1;
    }
    else {
        return -1;
    }
}
*/
    int  compareFoodPrice(Animal aminal);

    //-------------& sample --------------------------------------------------------
    //----------------------------------------------------------------------------
     /*public  int compareTo(Rectangle anRectangle)
     {
         Double rect1 = this.area();
         int result=0;
         result = Double.compare(this.area(), anRectangle.area());
         return result;
     }*/
    //----------------------& public int compareFoodPrice(Animal aminal)----------------------------------------------
    void ifNdef(String str);
}
