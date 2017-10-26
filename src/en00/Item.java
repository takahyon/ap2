/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en00;

/**
 *
 * @author takamasa
 */
public class Item {
    String name;
    int value;
    
    Item(String name, int value){
        this.name=name;
        this.value=value;
    }
    public void setValue(){
    this.value=300;
          
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
    
}
