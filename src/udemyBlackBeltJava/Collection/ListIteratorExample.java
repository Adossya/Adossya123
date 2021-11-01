package udemyBlackBeltJava.Collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        String s="madam";
        List<Character>list=new LinkedList<>();
        for (char ch:s.toCharArray()){
            list.add(ch);
        }
        ListIterator<Character>iterator=list.listIterator();
        ListIterator<Character>reverseiterator=list.listIterator(list.size());
        boolean isPalindrom=true;
        while (iterator.hasNext() && reverseiterator.hasPrevious()){
            if (iterator.next() != reverseiterator.previous()){
                isPalindrom=false;
            }
        }

        if (isPalindrom){
            System.out.println("Slovo, PAlindrom");
        }   else {
            System.out.println("Slovo, ne PAlindrom");
        }
    }
}
