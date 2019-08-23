package exercise2.entity;

import java.util.Scanner;

public class Q2 {
    private int n;
    private int[][] a = new int [30][30];
    
    
    public void Input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = scan.nextInt();
        
        for(int i = 0; i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.println("A["+i+"]["+j+"] = ");
                a[i][j] = scan.nextInt();
            }
        }
        
        for(int i = 0; i< n;i++){
            for(int j = 0; j<n;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
    
    public boolean checkPrime(int n){
        if( n<2)
            return false;
        int sq = (int) Math.sqrt(n);
        for(int i = 2; i <=sq; i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    
    public void Display(){
        for(int i = 0; i< n;i++){
            for(int j = 0; j< n;j++){
                if(checkPrime(a[i][j])==true)
                    System.out.println(a[i][j] + " ");
            }
        }
    }
    
    public int Sum(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter row: ");
        int r = scan.nextInt();
        int s = 0;
        for(int i = 0; i< n;i++){
            s+=a[r][i];
        }
        return s;
    }
    
    public void Tranposition(){
        int [][] b = new int [n][n];
        for(int i = 0; i< n;i++){
            for(int j = 0; j < n; j++){
                b[i][j] = a[j][i];
            }
        }
        
        for(int i = 0; i< n;i++){
            for(int j = 0; j < n; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}