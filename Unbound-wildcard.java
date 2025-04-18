/ 6. WAP for unbounded wildcard generic class to print the list of fruits and number? 

import java.util.List;
import java.util.Arrays;
import java.util.*;


class Main{
    public static void printList(List <?> list ){
        for(Object element : list){
            System.out.println(element);
        }
    }
    public static void main(String[] args){
        
        // For string handling 
        
        List<String>stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Mango");
        stringList.add("Banana");
        
        //For Integer Handling
        
        List<Integer>intList = new ArrayList();
        intList.add(10);
        intList.add(50);
        intList.add(100);
        
        System.out.println("String list: ");
        printList(stringList);
        
        
        
        System.out.println("Integer List: ");
        printList(intList);
    }
}
