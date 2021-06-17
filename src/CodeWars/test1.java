package CodeWars;

public class test1 {
    public static void main(String[] args) {
        long [] abc={1,3,5,7};
        long [] abc2={2,3,5,7};
        long a=0L;
        for (int i=0;i<abc.length;i++){
            for (int j=0;j<abc2.length;j++){
                if (abc[i]==abc[j]){
                    a=abc[i];

                }

            }

        }
        System.out.println(a);
    }
}
