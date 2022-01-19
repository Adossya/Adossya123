package udemyBlackBeltJava;

public class recursoin {

   public static int recursFunc (int i) {
       if (i <= 1) {
           return i;
       }

       return recursFunc(i - 1) + recursFunc(i - 2);
   }

    public static void main(String[] args) {
        System.out.println(recursFunc(5));
    }
}

//1*2*3
//1*2*3*4=24
//4->3->2->1        1*2 1*3 1*4


// i=5   return  (4)   +  (3)
// i=4   return  (3)   +   (2)
// i=3   return  (2)
// i=2   return  (1)
// i=1   return   1;


// 0 1 1 2 3 5 8 13

