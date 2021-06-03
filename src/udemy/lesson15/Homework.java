package udemy.lesson15;

public class Homework {
    public static void vremya() {
        int Hour=0;
        int Minute=0;
        OuterHour: while (Hour<6 && Hour>0){
            MiddleMinute:do {

                if (Hour>1 && Minute%10==0){
                    break OuterHour;}
                }while (Minute<60);
                int Second=0;
                InnerSecond:
                while (Second<60){
                    if(Second*Hour>Minute){
                       /* continue MiddMinute;*/
                    }
                    System.out.println(Hour+":"+Minute+":"+Second);
                }
            }






        }

      /*  OuterHour:
        for (int chas = 0; chas < 6; chas++) {
            MiddleMinute:
            for (int minuta = 0; minuta < 60; minuta++) {
                if (chas > 1 && minuta % 10 == 0) {
                    break Chas;
                }
                InnerSecond:
                for (int secunda = 0; secunda < 60; secunda++) {

                    if (secunda * chas > minuta) {
                        continue Minuta;
                    }
                    System.out.println(chas + ":" + minuta + ":" + secunda);

                }
            }
        }*/
      public static void main(String[] args) {
          vremya();
      }

    }



