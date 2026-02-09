package Basics;

public class String_Methods {
    
    public static void main(String[] args) {
        String name = "Shiva  ";
        //returns the length of the string name
        System.out.println(name.length());
        //Returns a new string which has all the lowercase character from the string name
         System.out.println(name.toLowerCase());
        //returns a string into uppercase 
         System.out.println(name.toUpperCase());
         //returns a string with all removed spaces
         System.out.println(name.trim());
         //returns a substring from start to the end  (*it include spaces also considers *)
         System.out.println(name.substring(2));
         //returns a substring from start index to the end index start index is included and end index is excluded
         System.out.println(name.substring(1,7));
         //returns a  new string after replacing "a" with "s"
         System.out.println(name.replace('a','s'));
         System.out.println(name.replace("va","sb"));
         //returns "true" if a name start with  string "sh" else return false same as for endsWith
         System.out.println(name.startsWith("Sh"));
         //returns a character at a given index position "i" in the case
         System.out.println(name.charAt(2));
         //returns the index of the given string 
         System.out.println(name.indexOf("iv"));



    }
    
    
}
