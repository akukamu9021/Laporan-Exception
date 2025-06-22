/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author issal
 */
public class test8fix {
    public static void main(String[] args) {
        test8 o=new test8();
        o.methodA();
        try
        {
            o.methodB();
        }
        catch(Exception e)
        {
            System.out.println("Error di Method B");
        }
        finally
        {
            System.out.println("ini selalu di cetak");
        }
    }
}