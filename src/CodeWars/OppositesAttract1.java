package CodeWars;

public class OppositesAttract1 {

    public static boolean isLove(final int flower1, final int flower2) {
        boolean a;

        if (flower1!=flower2){a=true;}
            else{a=false;}
            if ( (flower1%2==0 && flower2%2==1) || (flower1%2==1 && flower2%2==0) ){a=true;}
                if ((flower1%2==0 && flower2%2==0) || (flower1%2==1 && flower2%2==1)){a=false;}
        return a;
    }
//variant 2
    public static boolean isLove2(final int flower1, final int flower2){
        boolean b=(flower1%2==0 && flower2%2==0) || (flower1%2==1 && flower2%2==1)?false:true;
        boolean a=flower1!=flower2? true :(flower1%2==0 && flower2%2==1) || (flower1%2==1 && flower2%2==0)? true:false;
        return a && b;
    }
    //varinat 3 (podsmotrel uge v reshennih solutions
    public static boolean isLove3(final int flower1, final int flower2){
        return flower1%2 != flower2%2;  //flower1%2 == flower2%2 ?false:true;
    }

    public static void main(String[] args) {
        System.out.println(isLove(427,251));
        System.out.println(isLove2(427,251));
        System.out.println(isLove3(427,251));
    }
}
