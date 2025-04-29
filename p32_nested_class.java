class A{
    static void f1(){
        System.out.println("In class A");
    }
    static class B{
         void f2(){
            System.out.println("In class B");
        }
        class C{
            void f3(){
                System.out.println("In class C");
            }
        }
    }
}
public class p32_nested_class{
    public static void main(String[] args){
        A a=new A();
        A.B b=a.new B();
        A.B.C c=b.new C();
    }
}