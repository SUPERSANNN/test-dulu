/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B9;

/**
 *
 * @author AMD KOMPUTER
 */
import java.util.Scanner;
public class impTHrow {
public static void main (String[] args){    
    Scanner input = new Scanner(System.in);
            int jmlKaki;
            System.out.println("BRP JML KK KRB?");
         try{  
                System.out.println("BRP JML KK");
                jmlKaki = input.nextInt();
                if(jmlKaki !=4){
                    throw new NullPointerException("Terjafi KSLAHAN");
        }else{
                    System.out.println("BEant");
                }
         }catch(NullPointerException e){
             e.printStackTrace();
         }
}
}
