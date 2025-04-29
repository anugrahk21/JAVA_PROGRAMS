import java.util.Scanner;
//

public class p26_reverse_word_sentence{
    public String string_reverse_using_function(String S){
        String rev="";
        int l=S.length();
        while(l!=0){
            rev=rev+S.charAt(l-1);
            l--;
        }
        return rev;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        p26_reverse_word_sentence obj=new p26_reverse_word_sentence();
        int len=str.length();
        String word="";
        String revsentence="";
        for(int i=0;i<len;++i){
            if(str.charAt(i)==' '){
                revsentence+=obj.string_reverse_using_function(word);
                revsentence+=" ";
                word="";
            } else {
                word=word+str.charAt(i);
            }
        }
        revsentence += obj.string_reverse_using_function(word);
        System.out.println("Altered sentence: " + revsentence);
        sc.close();
    }
}