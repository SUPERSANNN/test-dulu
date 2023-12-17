/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B9;
 import java.util.Scanner;
 import javax.swing.JOptionPane;

/**
 *
 * @author AMD KOMPUTER
 */
public class Exception {
    public static void main(String[]args){
        try{
            int a,b,hasil;
            Scanner keyboard = new Scanner(System.in);
            System.out.println("=====PROGRAM PEMBAGIAN======");
            System.out.println("Masukan angka 1 =");
            a = Integer.parseInt(keyboard.next());
            System.out.println("Masukan angka 2=");
            b= Integer.parseInt(keyboard.next());
            hasil = a/b;
            System.out.println(Integer.toString(hasil));
        }catch(ArithmeticException c){
            JOptionPane.showMessageDialog(null, "nilai pembagi tidak boleh 0", "warning", 2);
        }catch(NumberFormatException d){
            JOptionPane.showMessageDialog(null, "Bukan hruf angka", "warning", 2);
        }finally{
            System.out.println("Terimaksi");
        }
    }
}
