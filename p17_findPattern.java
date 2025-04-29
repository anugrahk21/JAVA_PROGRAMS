import java.util.Scanner;

//Rabin-Karp Algorithm

class p17_findPattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String string=sc.nextLine();
        System.out.println("Enter the pattern : ");
        String pattern=sc.nextLine();
        int a=string.length();
        int b=pattern.length();
        int hash=0;
        boolean correct=true;

        // Calculating the hash value of the pattern
        for(int i=0;i<b;++i){
            int temp=(int) pattern.charAt(i); // typecasting char to int==>ASCII value
            hash+=temp;
        }
        for(int i=0;i<=a-b;++i){
            int temp=0;

            // Calculating the hash value of the substring of the string
            for(int j=i;j<i+b;++j){
                temp+=(int) string.charAt(j);
            }

            if(temp==hash){
                correct=true;
                //if the hash values are equal, then we compare the substring with the pattern
                for(int t=0;t<b;++t){
                    if(string.charAt(i+t)!=pattern.charAt(t)){
                        correct=false;
                        break;
                    }
                }
                if(correct){
                    System.out.println("Pattern found at index "+i);
                }
            }
        }
        if(correct){
            System.out.println("Pattern not found");
        }
        sc.close();
    }
}