//non static nested class

class A{
    int aa=10;
    static int bb=100;
    public A(){ // constructor
        System.out.println("Constructor of A");
    }
    void f1(){
        System.out.println("In class A");
    }
    static void f2(){
        System.out.println("In class A");
    }
    class B{

    }
}

class p33_non_static_nested_class{
    public static void main(String[] args){
        A a=new A(); //constructor of A is called
        A.B b=a.new B();
        System.out.println(a.aa);
        System.out.println(A.bb); // static variable-no object needed(directly accessed by class name)
        System.out.println(b); // non static nested class object (garbage value is printed because no constructor is defined)
        a.f1();
        A.f2();
    }
}