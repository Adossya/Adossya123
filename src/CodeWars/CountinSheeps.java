package CodeWars;

public class CountinSheeps {

        public static int countSheeps(Boolean[] arrayOfSheeps) {
            int countSheeps=0;
            for (int i=0;i<arrayOfSheeps.length;i++){
                if (arrayOfSheeps[i]==null){continue;}
                if (arrayOfSheeps[i]==true){countSheeps+=1;}
            }
            return countSheeps;
        }


    public static void main(String[] args) {
        Boolean [] array={true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true};
        System.out.println(countSheeps(array));
    }
}
