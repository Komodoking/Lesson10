/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsertRemoveArrayList;

/**
 *
 * @author ajdy5510
 */
public class Person implements Comparable<Person> {
    private String name;
    private int age;
    public Person(String nm,int ag){
    name=nm;
    age=ag;
    
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
        age=a;
    }

    public int getAge() {
        return age;
    }
    

    @Override
    public int compareTo(Person t) {
        return name.compareTo(t.getName());
    }
    
}
