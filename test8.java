/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.IOException;
/**
 *
 * @author issal
 */
public class test8 {

    public void methodA(){
        System.out.println("Method A");
    }
    public void methodB() throws IOException
    {
        System.out.println(20/0);
        System.out.println("Method B");
    }
}