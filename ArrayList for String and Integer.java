//WAP to display six country name along with its STD code using genric class ? 

import java.util.ArrayList;
// import java.util.*;

class Main{
    public static void main(String args[]){

        ArrayList <String > name =new ArrayList<>();
        ArrayList <Integer> c_code =new ArrayList<>();
        
        name.add("TOKYO");
        c_code.add(81);
        
        name.add("OSLO");
        c_code.add(47);
        
        name.add("NAIROBI");
        c_code.add(254);
        
        name.add("HELSENKI");
        c_code.add(358);
        
        name.add("DENVER");
        c_code.add(1);
        
        name.add("RIO");
        c_code.add(55);
        
        System.out.println("Printing string with integer using ArrayList");
        for(int i=0;i<name.size();i++){
            System.out.println(name.get(i) + " -> +" + c_code.get(i));
        }
        
    }
}
