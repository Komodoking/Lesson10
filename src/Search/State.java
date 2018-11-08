/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Search;

/**
 *
 * @author ajdy5510
 */
public class State implements Comparable {
    private String name;
    public State(String n){
        name =n;
    }
    public String getName(){
        return name;
    }

    @Override
    public int compareTo(Object t) {
      return name.compareTo((State)otherState.)
    }
}
