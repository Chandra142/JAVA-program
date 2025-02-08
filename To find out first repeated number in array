import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the number of terms in your array: ");
        int n = ob.nextInt();
        int count = 0;
        int arr[] = new int[n];
        System.out.println("Enter the terms of your array:");
        for(int i=0;i<n;i++){
            arr[i] = ob.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]+" is the frst repeated number");
                    return;
                }
            }
        }
        System.out.print("No repeated numbers are found");
    }
}
