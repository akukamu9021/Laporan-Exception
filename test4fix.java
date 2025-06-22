/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author issal
 */
public class test4fix {
    public static void main(String[] args) {
        int bil=10;
        String b[]={"a","b","c"};
        try
        {
            System.out.println(bil/0);
            System.out.println(b[3]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Terjadi aritmatika error");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Melibihi jumlah array");
        }
        catch(Exception e)
        {
            System.out.println("ini menghandle error yang terjadi");
        }
    }
}