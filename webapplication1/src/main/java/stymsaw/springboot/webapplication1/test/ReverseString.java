package stymsaw.springboot.webapplication1.test;

public class ReverseString {


    public static void main(String[] args) {

        String demo = "stym";

        StringBuilder revStr = new StringBuilder();

        while (!demo.isEmpty()) {
            int len = demo.length();
            char c = demo.charAt(len - 1);
            revStr.append(c);
            demo = demo.substring(0,len - 1);
        }

        System.out.println(revStr);
    }

}
