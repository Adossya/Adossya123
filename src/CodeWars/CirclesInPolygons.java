package CodeWars;

public class CirclesInPolygons {
    int sides;
    int sideLength;

    public CirclesInPolygons(int sides, int sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }

    public double circleDiameter(){

        double r=sideLength*Math.cos(180/sides);
        return r;

    }

    public static void main(String[] args) {
        CirclesInPolygons c1=new CirclesInPolygons(4,5);
        System.out.println(c1.circleDiameter());
    }
}
