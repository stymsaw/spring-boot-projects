package stymsaw.springboot.webapplication1.test;

public class ReverseString {


    public static void main(String[] args) {

        String str = "qwerty";

        StringBuilder revStr = new StringBuilder();

        while (!str.isEmpty()) {
            int len = str.length();
            char c = str.charAt(len - 1);
            revStr.append(c);
            str = str.substring(0,len - 1);
        }

        System.out.println(revStr);
    }

}
