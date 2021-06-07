package CodeWars;

public class WillYouMakeIt {
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {

        return distanceToPump <= mpg*fuelLeft;
    }
    public static void main(String[] args) {

        System.out.println(zeroFuel(50,25,5));

    }
}

//100,50,1