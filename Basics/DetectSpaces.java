package Basics;

public class DetectSpaces {
    public static void main(String[] args) {
        String text = "I  am   learning   java";
        System.out.println(text.contains("  "));
        System.out.println(text.contains("   "));
    }
    
}
