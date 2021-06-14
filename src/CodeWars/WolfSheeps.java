package CodeWars;

public class WolfSheeps {
    public static String warnTheSheep(String[] array) {
        String wolf="";
        String s1="wolf";

        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){

                if (array[i].equals(array[j])){continue;
                        }else if(j==array.length-1 && array[j].equals(s1)) {
                        wolf="Pls go away and stop eating my sheep";
                         }
                             else  if (array[i]==s1)
                             {
                                array[j]=String.valueOf(array.length-j);
                                wolf="Oi! Sheep number "+array[j]+ "! You are about to be eaten by a wolf!";
                             }
                                    else    {
                                            array[j]=String.valueOf(array.length-j-1);
                                            wolf="Oi! Sheep number "+array[j]+ "! You are about to be eaten by a wolf!";
                                            }break;
            }break;
        }
        if (s1==array[0] && array.length==1){wolf="Pls go away and stop eating my sheep";}
        return wolf;
    }


    public static void main(String[] args) {
        String [] array={"wolf"};
        System.out.println(warnTheSheep(array));

    }
}