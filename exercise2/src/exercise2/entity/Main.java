package exercise2.entity;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Q1 pac1 = new Q1();
        Q2 pac2 = new Q2();
        Q3 pac3 = new Q3();
        double a = 0, b = 0, c =0;
        while(true){
            
            System.out.println("\n1.Input a,b,c");
            System.out.println("2.Solve a quadratic equation");
            System.out.println("3.Calculate an area of triangle");
            System.out.println("4.Input a matrix");
            System.out.println("5.Display a list of prime number in matrix");
            System.out.println("6.Sum the value of a row");
            System.out.println("7.Calculate a transportation matrix");
            System.out.println("8.Input a String");
            System.out.println("9.Display the number of characters and the number of words");
            System.out.println("10.If a String is a full name, display the last name");
            System.out.println("0.Exit");
            
            System.out.println("Your choosen: ");
            int choice = scan.nextInt();
            
            switch(choice){
                case 0:{
                    System.exit(0);
                }
                
                case 1:{
                    pac1.Input();
                    break;
                }
                
                case 2:{
                    pac1.solveQE();
                    break;
                }
                
                case 3:{
                    System.out.println("S3 = " + pac1.calculateArea());
                    break;
                }
                case 4:{
                    pac2.Input();
                    break;
                }
                case 5:{
                    pac2.Display();
                    break;
                }
                case 6:{
                    System.out.println(pac2.Sum());
                    break;
                }
                case 7:{
                    pac2.Tranposition();
                    break;
                }
                case 8:{
                    pac3.Input();
                    break;
                }
                case 9:{
                    pac3.Count();
                    break;
                }
                case 10:{
                    pac3.Display2();
                    break;
                }
                default:
                    System.out.println("Input again from 1 - 10");
            }
        }
        
    }
    
}
