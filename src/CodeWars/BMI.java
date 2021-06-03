package CodeWars;

public class BMI {

        public static String bmi(double weight, double height) {
            double bmi1=weight/Math.pow(height,2);
            String bmi2="";
                if (bmi1<=18.5){bmi2="Underweight";};
                    if (bmi1<=25.0 && bmi1>18.5){bmi2="Normal";};
                        if (bmi1<=30.0 && bmi1>25.0){bmi2="Overweight";};
                             if (bmi1>30.0){bmi2="Obese";};
            return bmi2;
        }

    public static void main(String[] args) {
        System.out.println(bmi(103,194));

    }
}

   /* double bmi = weight/(height*height);
        return bmi <= 18.5 ? "Underweight": bmi <=25.0 ? "Normal" : bmi<=30.0 ? "Overweight" : "Obese";*/
