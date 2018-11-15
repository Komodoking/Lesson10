
package InsertRemoveArrayList;

import java.util.ArrayList;


public class ArrayListdemo {


    public static void main(String[] args) {
      ArrayList<String> x= new ArrayList();
      ArrayList<Person> y= new ArrayList();
      
      x.add("Apple");
      x.add("Pear");
      x.add("Starfruit");
      y.add(new Person("Smith, Hoe", 45));
      y.add(new Person("Undertale,sans",3));
      y.add(new Person("STOP,Ur Annoying",17));
      
            
              System.out.println("Remove pear fom x ");
              x.remove(1);
              System.out.println("Inserting new person between 1 and 2");
              y.add(2,new Person("Gumball,UrMum ",222));
               for (int i = 0; i < x.size(); i++) {
                  System.out.println(x.get(i));
            
        }
              for (Person p:y) {
                  System.out.println(p.getName());
        }
        System.out.println("Edit Smith Hoe age");
        Person temp= y.get(0);
        temp.setAge(0);
    }
     
}
