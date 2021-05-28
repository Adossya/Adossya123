package udemy.lesson13.Homework;

public class Month {

    public static void Method1 (int numberoOfMonth) {
        switch (numberoOfMonth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("In the month 31 days");
                break;
            case 2:
                System.out.println("In the month 28 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("In the month 30 days");
                break;
            default:
                System.out.println("In the year only 12 months");
        }
    }

    public static void main(String[] args) {

     Method1(2);
     Method1(4);
     Method1(12);
    }
}