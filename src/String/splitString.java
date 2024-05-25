package String;

public class splitString {
        public static void main(String[] args) {
            String text = "Kamu bisa dapat 1.100 point";

            // Split by space and get the third element (index 2)
            String[] parts = text.split(" ");
            String number = parts[3]; // parts[3] is "1.100"

            System.out.println("Extracted number: " + number);
        }

}
