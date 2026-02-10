package Basics;

public class DetectSpaces {
    public static void main(String[] args) {
        String text = "I am Learning Java   Programming";
        System.out.println(text.contains("   "));
        System.out.println(text.contains("  "));
        System.out.println(text.contains("     "));

    }
    
}
