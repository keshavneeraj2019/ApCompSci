public class Main {

    public static void main(String[] args) {
        finaltest("Palindrome");
        finaltest("Civic");
        finaltest("Radar");
        finaltest("Level");
        finaltest("Eva, can I stab bats in a cave?");
        finaltest("A man, a plan, a canal, Panama");
        finaltest("Mr. Owl ate my metal worm");
        finaltest("Never odd or even");
        finaltest("Doc, Note: I Dissent. A fast never prevents a fatness. I diet on cod.");
    }

    public static void finaltest (String x) {
        String y = remove(x);
        String z = reverse(y);
        boolean d = equal(z,y);
        if (d) {
            System.out.println("\"" + x + "\" is a palindrome. \n"); }
        else {System.out.println("\"" + x + "\" is not a palindrome. \n");}
    }

    public static String remove(String x) {
        String y = "";
        String z = "";
        char w = 1;
        x = x.toLowerCase();
        int length = x.length();
        for (int i = 0; i < length; i++) {
            if (x.charAt(i) >= 97 && x.charAt(i) <= 122) {
                w = (x.charAt(i));
                z = Character.toString(w);
                y += z;
            }
        }
        return y;
    }

    public static String reverse(String y) {
        String z = "";
        char w= 1;
        int length = y.length();
        for (int i = 0; i < length; i++) {
            w = y.charAt((length-1) - i);
            z += Character.toString(w);
        }
        return z;
    }

    public static boolean equal(String z, String y) {
        boolean equality = false;
        if (z.equals(y)) {
            equality = true;
        }
        return equality;
    }
}
