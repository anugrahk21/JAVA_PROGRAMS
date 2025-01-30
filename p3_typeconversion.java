public class p3_typeconversion {
    public static void main(String args[]){
        int x=98;
        float y=x; //or float y=(float)x;
        long z=(long)y;
        System.out.println("Original type, Integer: "+x);
        System.out.println("After conversion type, Float: "+y);
        System.out.println("After conversion type, Long: "+z);

    }
}
