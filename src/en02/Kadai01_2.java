/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.String;
/**
 *
 * @author takamasa
 */
public class Kadai01_2 {
    public static void main(String[] args) {
        int n=0;
        double sum=0;
        int num=0;
        try {
        BufferedReader br = new BufferedReader(new FileReader(new File("out11.txt")));
            PrintWriter pw
                    = new PrintWriter(new BufferedWriter(new FileWriter(new File("out12.txt"))));
            String line;
            pw.print("名前リスト: ");
            while((line=br.readLine())!=null){
                if(n%2==0){
                    
                    pw.print(line+"/");
               
                num++;
                }else{
                   sum += Double.valueOf(line);
                   
                }
                 n++;
            }
            pw.println();
            pw.print("平均点: "+sum/num);
            br.close();
            pw.close();
            System.out.println("Done!");
        } catch (IOException e) {
            System.out.println("Cant Process....");
        }
    }
}
