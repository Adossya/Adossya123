package CodeWars;


public class printedErrors {
        static int err=0;
        public static String printerError(String s) {
            int length=s.length();
            String len=String.valueOf(length);
            char []array=s.toCharArray();
            for (int i=0;i<array.length;i++)
            {
                if (array[i]=='n' || array[i]=='o' ||array[i]=='p' || array[i]=='q' || array[i]=='r' || array[i]=='s' ||array[i]=='t' ||array[i]=='u' ||
                        array[i]=='v'||array[i]=='w' || array[i]=='x'||array[i]=='y' ||array[i]=='z'){err+=1;}

            }

            String errors1=String.valueOf(err);
            return errors1+"/"+len;

        }

        public static void main(String[] args) {
            System.out.println(printerError("aaaxyz"));
        }
    }

