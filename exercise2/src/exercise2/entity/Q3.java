/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2.entity;

import java.util.Scanner;

public class Q3 {
    private String a;
    
    public void Input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a string: ");
        a = scan.nextLine();
    }
    
    public void Count(){
        int word = 0, character = 0;
        for(int i = 0 ; i < a.length(); i++){
            if(a.charAt(i) >= 'a' && a.charAt(i) <= 'z' || a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
                word++;
            else character++;
        }
        System.out.println("Number of word: " + word + " Number of characters: " + character);
    }
    
    public void Display2(){
        int h = 0;
        for(int i = a.length() -1 ; i >= 0; i--){
            if(a.charAt(i)==' '){
                h = i;
                break;
            }
        }
        
        for(int i = h + 1; i < a.length(); i++)
            System.out.print(a.charAt(i));
    }
}
