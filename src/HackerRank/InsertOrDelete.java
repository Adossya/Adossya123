package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class InsertOrDelete {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        List<Integer> list = new ArrayList<>(N);

        for (int i = 0; i < N; i++) {
            int Peremennie = scan.nextInt();
            list.add(Peremennie);
        }
        int kol_oper = scan.nextInt();

        InsertOrDelete:
        for (int i = 0; i < kol_oper; i++) {

            String InsOrDel=scan.next();

            if (InsOrDel.equals("Insert")){
                list.add(scan.nextInt(), scan.nextInt()); continue InsertOrDelete;
            }
            if (InsOrDel.equals("Delete")){
                list.remove(scan.nextInt()); continue InsertOrDelete;
            }
        }
        for (int a : list) {
            System.out.print(a + " ");
        }
        scan.close();
    }
}