interface a_interface{
    public void f1();
}
abstract class A_class implements a_interface{
    void f2(){
        System.out.println("In class A");
    }
    public abstract void f5();
}
class B_class extends A_class{
    public void f1(){
        System.out.println("In class B");
    }
    public void f5(){
        System.out.println("In class B");
    }
    void f3(){
        System.out.println("In class B");
    }
}
class C_class implements a_interface{
    public void f1(){
        System.out.println("In class C");
    }
    public void f4(){
        System.out.println("In class C");
    }
}

class p31_inhereitance_4{
    public static void main(String[] args){
        System.out.println("In main class");
            B_class b=new B_class();
            b.f1();
            b.f2();
            b.f3();
            b.f5();  
            C_class c=new C_class();
            c.f1();
            c.f4();
            
    }
}