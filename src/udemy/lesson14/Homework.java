package udemy.lesson14;

import udemy.Lesson11.Student;

public class Homework {
    public static void vremya() {

        Chas:
        for (int chas = 0; chas < 6; chas++) {
            Minuta:
            for (int minuta = 0; minuta < 60; minuta++) {
                if (chas > 1 && minuta % 10 == 0) {
                    break Chas;
                    }
                    Secunda:
                    for (int secunda = 0; secunda < 60; secunda++) {

                        if (secunda * chas > minuta) {
                            continue Minuta;
                        }
                        System.out.println(chas + ":" + minuta + ":" + secunda);

                    }
                }
            }


        }

    public static void main(String[] args) {
        vremya();
    }
    }






