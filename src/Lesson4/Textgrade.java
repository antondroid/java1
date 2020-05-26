package Lesson4;

/*
Напишите метод, который возвращает текстовую
характеристику оценки по числовой.

0 - не оценено
1..20 - очень плохо
21..40 - плохо
41..60 - удовлетворительно
61..80 - хорошо
81..100 - отлично
в остальных случаях - не определено

Сигнатура метода static String textGrade(int grade)

Например, textGrade(45) должна вернуть "удовлетворительно"
 */
public class Textgrade {
    static String textGrade(int grade) {
        String stout = " ";
        if (grade == 0) { stout = "не оценено"; }
        else { if (grade >=1   & grade <= 20) { stout = "очень плохо"; }
               else { if (grade >=21  & grade <= 40) {stout = "плохо"; }
                      else {if (grade >= 41   & grade <= 60) {stout = "удовлетворительно";}
                            else {if (grade >= 61  & grade <= 80) {stout = "хорошо";}
                                  else{if (grade >= 81  & grade <= 100) {stout = "отлично";}
                                       else {if ( grade<0 | grade > 100) stout = "не определено";
                            }
                        }
                    }
                }
            }
        } return(stout);
    }
    //else stout = "не определено";



    public static void main(String[] args) {
        System.out.println(textGrade(100));

    }

}