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
    private String gender;
    public Person(String nm,int ag,String ge){
    name=nm;
    age=ag;
    gender=ge;
    }
  public String getGender(){
      return gender;
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
    


    public int compareTo(Person t) {
        return name.compareTo(t.getName());
    }
    
}
