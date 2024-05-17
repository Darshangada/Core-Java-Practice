package Thinkitive;

public class LeftRotationalCheck {
    public boolean isLeftRotation(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) return false;
        
        // Concatenate s1 with itself
        String concatenated = s1 + s1;
        
        // Check if s2 is a substring of the+ concatenated string
        return concatenated.contains(s2);
    }

    public static void main(String[] args) {
        LeftRotationalCheck lrc = new LeftRotationalCheck();
        
        // Example 1
        String s1 = "geeksjobgeeks";
        String s2 = "jobgeeksgeeks";
        System.out.println("Is '" + s2 + "' a left rotation of '" + s1 + "': " + lrc.isLeftRotation(s1, s2));
        
        // Example 2
        s1 = "mightandmagic";
        s2 = "andmagicmight";
        System.out.println("Is '" + s2 + "' a left rotation of '" + s1 + "': " + lrc.isLeftRotation(s1, s2));
    }
}

