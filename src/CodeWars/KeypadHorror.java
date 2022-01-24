package CodeWars;

public class KeypadHorror {
    public static void main(String[] args) {
        computerToPhone("123");
    }
    public static String computerToPhone(String number){
        char [] array1=number.toCharArray();
        char [] array2=new char[number.length()];

        for (int i=0;i<array1.length;i++){

            switch (array1[i]){
                case '1': array2[i]='7'; break;
                case '2': array2[i]='8'; break;
                case '3': array2[i]='9'; break;
                case '7': array2[i]='1'; break;
                case '8': array2[i]='2'; break;
                case '9': array2[i]='3'; break;
                case '0': array2[i]='0'; break;
                default:  array2[i]=' '; break;
            }

        }
        String s1=new String(array2);
        return s1;

    }
}
