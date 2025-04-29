import java.util.Scanner;
class p24_reverse_string{
    Scanner sc=new Scanner(System.in);
    public String string_reverse_using_function(String str){
        return str.reverse();

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String aaa="abc";
        String rev="";
        int l=aaa.length();
        while(l!=0){
            rev=rev+aaa.charAt(l-1);
            l--;
        };
        System.out.println("Reversed string: "+rev);
        String str=sc.nextLine();
        Stringbuilder s=new p24_reverse_string();

        System.out.println("Reversed string using string builder: "+s.string_reverse_using_function(str));
    }
}