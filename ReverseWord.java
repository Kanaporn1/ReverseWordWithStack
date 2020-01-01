/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StacksI;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class ReverseWord {

    public static void main(String[] args) {
    {
           /* InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader console = new BufferedReader(reader);
*/
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
            while(true)  {
                System.out.println("Enter the word : ");
               // String input = console.readLine();
                if(input.equals("")) 
                    break; //ถ้าเกิดไม่พิมพ์
                int nChars = input.length();
                Stack theStack = new Stack(nChars);
                //สร้าง stack เพื่อเก็บข้อมูลที่ดึงมาจากstring
                //สิ่งที่เก็ยในstackต้องเก็บในรูป object
                
                for (int i = 0 ;i < nChars ; i++) {
                    //wrapper class
                    //เนื่องจากการเก็บข้อมูลใน stack ต้องเก็บเป็น object
                    //Character newChar = new Character(input.charAt(i));
                    //theStack.push(newChars);
                       theStack.push(new Character(input.charAt(i)));
                    String output="";
                    while (!theStack.isEmpty()){
                        char c = ((Character)theStack.pop()).charValue();
                        //casting เพราะว่าตอนที่เราได้มาเราได้มาเป็น obj ก็เลยต้อง castกลับไปเป็น char
                        output = output+c;
                        //ต่อ string basic
                        
                }
                   System.out.print("The reverse word: "+output); 
                }
                
            }  
        }

    }
}
