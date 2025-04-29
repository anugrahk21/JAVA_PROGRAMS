import java.util.Scanner;

class Grand_Parent{
    int A;
    public Grand_Parent(int a){
        this.A=a;
    }

}
class Parent extends Grand_Parent{
    int B;
    public Parent(int b){
        super(30);
        this.B=b;
    }

}
class Child extends Parent{
    int C;
    public Child(int k) {
        super(20);
        this.C =k;
    }

}
class p30_inheritance_3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        Child c=new Child(k);
        System.out.println(c.C);
        System.out.println(c.B);
        System.out.println(c.A);
        sc.close();


    }

}