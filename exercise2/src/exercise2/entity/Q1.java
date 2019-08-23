package exercise2.entity;

import java.util.Scanner;

public class Q1 {
    private double a,b,c;
    
    public void Input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a,b,c: ");
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        
        //this.a = a;
        //this.b = b;
        //this.c = c;
        
    }
    
    public void solveQE(){
        double delta = b*b - 4*a*c;
        if(b < 0){
            System.out.println("Pt vo nghiem");
        }
        else if(delta==0)
            System.out.println("x1 = x2 = " + (-b)/(2*a));
        else{
            System.out.println("x1 = " + (-b + Math.sqrt(delta)/(2*a)));
            System.out.println("x1 = " + (-b - Math.sqrt(delta)/(2*a)));
        }
    }
    
    public double calculateArea(){
        double S , p = (a+b+c)/2;
        S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return S;
    }
    
}
