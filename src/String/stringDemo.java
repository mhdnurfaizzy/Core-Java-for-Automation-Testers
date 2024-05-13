package String;

public class stringDemo {


    public static void main(String[] args) {
        String a = "hello"; // String litteral -Mutable
        String b = "hello";
        String c = a.concat("world"); //cant concat because value a and b in memory only stored one same value
        System.out.println(a);

        String s = new String("hello"); //String classes
        String s1 = new String("hello"); //String clas creates new object every time in memory
        String s2 = s.concat("world"); // success concat string s + s2 output will be "helloworld"
        System.out.println(s2);

        //Different between == and equals in string
        System.out.println(a.equals(b)); // it will return true, because "equals" check for content
        System.out.println(a==b); // it will return true, because a==b is the same object
        System.out.println(a.equals(s));
        System.out.println(a==s);//it will return false, because a==s different object
        System.out.println(s==s1); //it will false, references are different as they are defined with string class


        //StringBuffer and StringBuilder
        StringBuffer sb = new StringBuffer("hello");
        sb.append("world"); //append value sb "hello" + character "world". output will be "helloworld"
        System.out.println(sb);
        sb.insert(2, "She"); //insert value by index of character value sb. output will be "heShelloworld"
        System.out.println(sb);
        sb.replace(5, 7, "aaa"); // raplace value by index of character value sb. output will be "heSheaaaoworld"
        System.out.println(sb);
        sb.deleteCharAt(0); // delete value by index of character value sb. output will be "eSheaaaoworld"
        System.out.println(sb);
        sb.reverse(); //reverse sting. output will be "dlrowoaaaehSe"
        System.out.println(sb);

        //StringBuilder
        StringBuilder Sbuild = new StringBuilder("hello");
        System.out.println(Sbuild);

        //Stringbuilde is not thread safe. it non synchronized. but it faster than StringBuffer






    }
}
