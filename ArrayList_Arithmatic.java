// 10.Create an ArrayList with 5 integer values and display all the values and add the value which is present at the index number 3 and 5;
import java.util.ArrayList;
import java.util.*;

class Main{
    public static void main(String args[]){
        ArrayList <Integer> nums  =new ArrayList<>();
        
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40); //3th
        nums.add(50);
        nums.add(60); //5th 
        nums.add(70);
        nums.add(80);
        
        
        int sum  = nums.get(3) + nums.get(5);
        int diff  = nums.get(3) - nums.get(5);
        int mul  = nums.get(3) * nums.get(5);
        int div  = nums.get(3) / nums.get(5);

      
        System.out.println("Printing Arithmatic Operation using ArrayList");
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mul);
        System.out.println(div);
        
    }
}
