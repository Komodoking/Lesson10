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
public class Personlist {

    static int logicalSize=3;
    public static void main(String[] args) {
Person p[]=new Person[10];
p[0]= new Person("A,A",46);
p[1]=new Person("E,E",56);
p[2]= new Person("Lmao,Lmao",24);
        System.out.println("adding new Person, Africa, Toto");
        Person x= new Person("Africa,Toto",21);
        int loc= findInsertPoint(p,x);
        insert(p,x,loc);
        for (int i = 0; i < logicalSize; i++) {
            System.out.println(p[i].getName());
            
            
        }
        System.out.println("Remove A,A");
        Person temp=new Person("A,A",46);
        //create temp object to match one in list
        loc=search(p,temp);
        
        delete(p,loc);

    }
    public static int search (Object[] a, Object searchValue){
	   int left = 0;
	   int right = logicalSize-1;
	   while (left <= right){
	      int midpoint = (left + right) / 2;
	      int result = ((Comparable)a[midpoint]).compareTo(searchValue); 
	      if (result == 0)
	         return midpoint;
	      else if (result < 0)
	         left = midpoint + 1;
	      else
	         right = midpoint-1;
	   }
	   return -1;	
		   
}

//////////////////////////////////////////////////////////////////////////////////

public static boolean insert(Object array[], Object newItem, int targetIndex)
{
	// Check for a full array and return false if full
	if (logicalSize == array.length)
	   return false;
	// Check for valid target index or return false 
	if (targetIndex < 0 || targetIndex > logicalSize)
	   return false;
	// Shift items down by one position
	for (int i = logicalSize; i > targetIndex; i--)      
	   array[i] = array[i - 1];
	// Add new item, increment logical size,return true                       
	array[targetIndex] = newItem; 
	logicalSize++;
	return true; 
}

//////////////////////////////////////////////////////////////////////////////////
	
public static boolean delete(Object array[], int targetIndex)
{
	if (targetIndex < 0 || targetIndex >= logicalSize)
		   return false;
		 
		// Shift items up by one position
		for (int i = targetIndex; i < logicalSize - 1; i++)       
		   array[i] = array[i + 1];
		 
		// Decrement logical size and return true 
		logicalSize--; 
		return true;                                   
}

/////////////////////////////////////////////////////////////////////////////////
	
public static int findInsertPoint (Object a[], Object searchValue){
	   int left = 0;
	   int right = logicalSize-1;
	   int midpoint=0;
	   
	   while (left <= right){
	      midpoint = (left + right) / 2;
	   
	      int result = ((Comparable)a[midpoint]).compareTo(searchValue); 
	   
	     if (result < 0)
	         left = midpoint + 1;
	      else
	         right = midpoint-1;
	   }
	   if(((Comparable)a[midpoint]).compareTo(searchValue) < 0)
	   midpoint++;
	   return midpoint;	   
}
    
}
