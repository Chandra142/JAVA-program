 // 9. Create a HashMap collection which will contain  6 names and  their STD code;

import java.util.HashMap;
// import java.util.*;

class Main{
    public static void main(String args[]){
        HashMap <String,Integer> name =new HashMap<>();

        
        name.put("TOKYO",81);
        
        
        name.put("OSLO",47);
        
        
        name.put("NAIROBI",254);
       
        
        name.put("HELSENKI",358);
        
        
        name.put("DENVER",1);
        
        
        name.put("RIO",55);

        
        System.out.println("Printing string with integer using HashMap");
        for(var value : name.entrySet()){
            
            System.out.println("Name: " +value.getKey() + " , C_Code: " +value.getValue());
        }
        
    }
}
