// Generic class in Java
class Generic<T>{
    public T a;
    Generic(T a){
        this.a=a;
    }
}

//Generic class with multiple type parameters
class MultiGeneric<T, U>{
    public T a;
    public U b;
    MultiGeneric(T a, U b){
        this.a=a;
        this.b=b;
    }
}

public class p38_generic_class {
    public static void main(String[] args){
        // Creating objects of Generic class with different types
        Generic<Integer> a1=new Generic<Integer>(12);
        System.out.println(a1.a);
        Generic<String> a2=new Generic<String>("Hello");
        System.out.println(a2.a);
        Generic<int[]> a3=new Generic<int[]>(new int[]{24, 6, 99});
        System.out.println(a3.a[0] + " " + a3.a[1] + " " + a3.a[2]);
        String[] str={"Hello", "World", "I", "am", "a","programmer"};
        Generic<String[]> a4=new Generic<String[]>(str);
        for(String s : a4.a){
            System.out.print(s + " ");
        }
        System.out.println();

        MultiGeneric<Integer, String> a5=new MultiGeneric<Integer, String>(12, "Hello");
        System.out.println(a5.a + " " + a5.b);
    }
}
