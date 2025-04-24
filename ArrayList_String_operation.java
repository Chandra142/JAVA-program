//11. String Operation in using ArrayList;

import java.util.ArrayList;
import java.util.*;

class Main{
    public static void main(String args[]){
        ArrayList <String> nums  =new ArrayList<>();
        
        nums.add("Maroon"); //1st index
        nums.add("Voilet"); //2nd ''
        nums.add("Black");  //3rd ''
        nums.add("Green");  //4th ''
        nums.add("Black");  //5th ''
        nums.add("Purple"); //6th ''
        

        
        System.out.println("Printing String Operation using ArrayList");
        System.out.println(nums.get(0)); //1st index 
      
        System.out.println(nums.get(0)+ nums.get(1)); //addtion with string

        
    }
}
