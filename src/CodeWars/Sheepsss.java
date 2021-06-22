package CodeWars;

public class Sheepsss {
    public class Counter {
        public int countSheeps(Boolean[] arrayOfSheeps) {
            int countSheeps=0;
            for (int i=0;i<arrayOfSheeps.length;i++){
                if (arrayOfSheeps[i]==null){continue;}
                if (arrayOfSheeps[i]==true){countSheeps+=1;}
            }
            return countSheeps;
        }
    }
}
