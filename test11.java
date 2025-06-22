/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author issal
 */
public class test11 extends Throwable {
    public test11 (String s)
    {
        super(s);
    }
    public static void main(String[] args) {
        int position = 1;
        try
        {
            if(position>0)
            throw new test11("position" + position);
        }
        catch(test11 e)
        {
            System.out.println("Range error " +e.getMessage());
        }
        System.out.println("this is last program.");
    }
}