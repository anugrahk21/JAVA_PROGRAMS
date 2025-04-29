public class p25_char_count {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int l=str.length();
        String filteredStr = str.replaceAll("[^a-zA-Z]", " ");
        int kk=0;
        for(int i=0;i<l;++i){
            if(filteredStr.charAt(i) == ' '){
                continue;
            }
            else{
                kk=kk+1;
            }
        }
        int length = filteredStr.length();
        System.out.println("The number of characters in the string is: " + length);
        System.out.println(kk);
    }
}