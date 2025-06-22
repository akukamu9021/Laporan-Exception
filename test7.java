/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author issal
 */
public class test7 {
    public static void main(String[] args) {
        try
        {
            throw new Exception("Here's my Excaption");
        }
        catch(Exception e)
        {
            System.out.println("Caught Excaption");
            System.out.println("e.getMessage():"+e.getMessage());
            System.out.println("e.toString():"+e.toString());
            System.out.println("e.printStackTrace():");
            e.printStackTrace();
        }
    }
}