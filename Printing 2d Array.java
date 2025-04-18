import java.util.*;
class ram{
    public static void main(String args[]){
        Scanner ob  = new Scanner(System.in);
        int row = ob.nextInt(); 
        int col = ob.nextInt(); 
        int [][] arr = new int[row][col];
        
        for(int i=0;i<row;i++){
            for(int j= 0;j<col;j++){
                arr[i][j] = ob.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j= 0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        
    }
}
