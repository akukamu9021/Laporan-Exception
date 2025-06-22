/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author issal
 */
public class test6 {
    static void demo()
    {
        NullPointerException t;
        t=new NullPointerException("coba Throw");
        throw t;
        // Baris ini tidak lagi dikerjakan
    }

    public static void main(String[] args) {
        try
        {
            demo();System.out.println("selesai");
        }
        catch(NullPointerException e)
        {
            System.out.println("Ada pesan error: " +e);
        }
    }
}