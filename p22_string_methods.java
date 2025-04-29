import java.util.Scanner;

public class p22_string_methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Hi I am Anugrah";
        String ss="hi i am anugrah";
        String x= new String(" I am a 2nd year student ");

        System.out.println(s.length());

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        System.out.println(s.charAt(9));
        System.out.println(s.indexOf("a"));
        System.out.println(s.indexOf("a",6));

        System.out.println(s.replace("a","A"));
        System.out.println(s.replace("Anu","aNU"));
        System.out.println(x.trim());

        System.out.println(s.isEmpty());
        System.out.println(s.equals(x));
        System.out.println(s.equalsIgnoreCase(ss));

        System.out.println(s.substring(5,7));
        System.out.println(s.concat(x));

        StringBuilder sb=new StringBuilder(s);
        System.out.println(sb.reverse());

        sc.close();
    }
}