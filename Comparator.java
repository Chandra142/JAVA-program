//13. WAP for treeset using custom comparator interface which will have name 
// and marks and the ordering will be done according to the names;


import java.util.Comparator;
import java.util.TreeSet;

public class Main{
    public static void main(String args[]){
        TreeSet <Integer > set =  new TreeSet<>(Comparator.reverseOrder());
        set.add(10);
        set.add(5);
        set.add(20);
        System.out.println(set);
    }
}
