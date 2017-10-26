package en03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author takamasa
 */
public class Kadai02_2 {

  public static void main(String[] args) {
      
      
        List<Cat> clist = new ArrayList<>();
        int totalAge=0;
        double totalWeight=0;
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader(new File("data2.csv")));
            String line = "";

            while ((line = br.readLine()) != null) {
                Cat cat = new Cat();
                String[] word = line.split(",");
                cat.setNo(Integer.parseInt(word[0]));
                
                cat.setAge(Integer.parseInt(word[6]));
                totalAge+=cat.getAge();
                
                cat.setWeight(Double.valueOf(word[7]));
                totalWeight+=cat.getWeight();
                
                clist.add(cat);
                
            }
            br.close();
            
        } catch (Exception e) {
        }
        System.out.println("Weight AVE="+totalWeight/(double)clist.size());
        System.out.println("Ave AGE="+totalAge/(double)clist.size());
        
    }
}

