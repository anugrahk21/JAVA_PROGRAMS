public class p4_conditions {
    //to print in increasing order
    public static void main(String [] args){
        int a=10;
        int b=20;
        int c=50;
        if(a>b && a>c){//a is the largest
            if(b>c){//b is the second largest
                System.out.println(c+" "+b+" "+a);
            }
            else{//c is the second largest
                System.out.println(b+" "+c+" "+a);
            }
        }
        else if(b>a && b>c){//b is the largest
            if(a>c){//a is the second largest
                System.out.println(c+" "+a+" "+b);
            }
            else{//c is the second largest
                System.out.println(a+" "+c+" "+b);
            }
        }
        else{//c is the largest
            if(a>b){//a is the second largest
                System.out.println(b+" "+a+" "+c);
            }
            else{//b is the second largest
                System.out.println(a+" "+b+" "+c);
            }
        }


    }
}
