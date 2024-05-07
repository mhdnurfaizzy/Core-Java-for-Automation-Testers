public class stringReversed {

    public static void main(String[] args) {
        String a= "train", b="";
        char ch;

        System.out.print("Original word: ");
        System.out.println(a); //Example word

        for (int i=0; i<a.length(); i++)
        {
            ch= a.charAt(i); //extracts each character
            b = ch+b; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ b);
    }

}
