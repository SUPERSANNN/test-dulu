/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B9;

/**
 *
 * @author AMD KOMPUTER
 */
public class ThrowsException {
static void Error() throws ClassNotFoundException{
        System.out.println("eror");
        throw new ClassNotFoundException("eror lsh");
    }

    public static void main(String[]args) throws ClassNotFoundException{
      try{
          ThrowsException.Error();
      }catch(RuntimeException e){
          e.getStackTrace();
      }
    }
}
