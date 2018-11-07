
package Search;


public class StringReview {

   
    public static void main(String[] args) {
 String x="The Quick Brown fox";
 //        01234567890123456789
 //indexOf-> returns an int,start location of Something
 int loc=x.indexOf("Q");
        System.out.println("Q is at location "+loc);
        loc=x.indexOf("o",13);//start looking at 13
        System.out.println("Starting at 13, the next o is at "+loc);
        loc=x.indexOf("Q", 5);
        System.out.println("Starting at 5, the next o is at "+loc);
 //charAt->returns a char
 char c= x.charAt(13);
        System.out.println("The Letter at pos 13 is "+c);
        //length
        int len =x.length();
        System.out.println(x+" is "+len+" letters long.");
        // substring -> return String, requires 1 or more ints
        String y= x.substring(10,13);//character 10 to 13
        System.out.println("Hey "+y);
        String t=x.substring(16);// characyer 16 to end
        System.out.println("Crazy like a "+y);
        //toLower and Uppercase
        System.out.println(x.toUpperCase());
        //compareTo
        y="Jumped over the lazy dog. ";
        int z=y.compareTo(x);
        System.out.println("y vs x= "+z);
        z=x.compareTo(y);
        System.out.println("x vs y = "+z);
        //compareTo does letter-math
        //calculate the alphabetical distance between 1st letter of each string
        //"t" ves "j"-> 10 leters apart in alphabet
        //positive means furthe down the list
        System.out.println("Bob vs Bob\t");
        System.out.println("Bob".compareTo("Bob"));
        System.out.println("Thats all folks");
    }
    
}
