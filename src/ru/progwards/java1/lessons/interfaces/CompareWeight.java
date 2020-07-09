package ru.progwards.java1.lessons.interfaces;

public interface CompareWeight {
   default public CompareResult compareWeight(CompareWeight smthHasWeigt) {
        if (Double.compare(this.getWeight(), smthHasWeigt.getWeight())==1) return CompareResult.GREATER;
        if (Double.compare(this.getWeight(), smthHasWeigt.getWeight())==0) return CompareResult.EQUAL;
        else return CompareResult.LESS;
    }
    double getWeight();
    public enum CompareResult {LESS, EQUAL, GREATER}
}
