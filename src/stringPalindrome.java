public class stringPalindrome {

    public static void main(String[] args) {
        String a= "izi";
        String b="";

        for (int i = a.length()-1; i >= 0;i--)
        {
            b = b+a.charAt(i); //adds each character in front of the existing string
        }

        System.out.println(b);

        if (a.equals(b)) { //verify the palindrome char or not
            System.out.println(a + " is a palindrome");
        } else {
            System.out.println(a + " is not a palindrome");
        }
    }

}
