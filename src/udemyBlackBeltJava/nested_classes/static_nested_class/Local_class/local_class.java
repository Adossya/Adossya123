package udemyBlackBeltJava.nested_classes.static_nested_class.Local_class;

public class local_class {
    public static void main(String[] args) {
        Math math=new Math();
        math.getResult();
    }
}

class Math {
    public void getResult (){
         class Delenie {
            private int delimoe;
            private int delitel;

            public int getDelimoe() {
                return delimoe;
            }

            public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }

            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }
            public int getChastnoe (){
                return  delimoe/delitel;
            }
            public int getOstatok (){
                return  delimoe%delitel;
            }
        }
        Delenie d1=new Delenie();
        d1.setDelimoe(21);
        d1.setDelitel(4);
        System.out.println("Delimoe ="+d1.getDelimoe());
        System.out.println("Delitel' ="+d1.getDelitel());
        System.out.println("Chastnoe ="+d1.getChastnoe());
        System.out.println("Ostatok ="+d1.getOstatok());
    }


}