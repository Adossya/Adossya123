package udemy.lesson31ErrorsPart1;

public class Lesson27 {
    public static void main(String[] args) {
        Tiger t1 = new Tiger();

        t1.eat("myaso");

        try {
            t1.drink("voda");
            try {
                t1.drink("pivo");
            } catch (NeVodaException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Eto inner finally block");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


class Tiger {

    void eat(String eda) {
        if (eda.equals("myaso")) {
            System.out.println("Tigr est myaso");
        } else {
            throw new NeMyasoException("Tigr ne est " + eda);
        }
    }

    void drink(String voda) throws NeVodaException {
        if (voda.equals("voda")) {
            System.out.println("Tigr p'et vody");
        } else {
            throw new NeVodaException("Tigr ne p'et " + voda);
        }
    }

}


class NeMyasoException extends RuntimeException {
    NeMyasoException(String message) {
        super(message);
    }
}

class NeVodaException extends Exception {
    NeVodaException(String message) {
        super(message);
    }
}
