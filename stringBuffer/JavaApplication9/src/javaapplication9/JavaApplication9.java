/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Asus1
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for(;;){
        System.out.print("> ");
       String line = in.readLine();
        if((line == null) || line.equals("exit"))
                break;
        StringBuffer buf = new StringBuffer(line);
        for(int i = 0; i < buf.length();i++){
            buf.setCharAt(i, rot13(buf.charAt(i)));
        }
        }
    }

   public static char rot13(char c) {
       if((c>= 'A')&& (c<= 'Z')){
        c +=13;
        if(c >'Z') 
            c -=26;
                }
    if((c>='a')&&(c<='z')){
        
        c+=13;
        if(c>'z') c-=26;
    }
    return c ;
    }
    
}
