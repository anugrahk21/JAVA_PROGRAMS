// Cloning an object using clone() method
class p18_cloning_object implements Cloneable{
    int a;
    int b;

    void display(){
        System.out.println("a = " + a + " b = " + b);
    }

    public static void main(String[] args) {
        try{
            Class c=Class.forName("p18_cloning_object"); // Getting the class object
            p18_cloning_object obj=(p18_cloning_object)c.newInstance(); // Creating an object of the class
            obj.a=10;
            obj.b=20;
            obj.display();
            p18_cloning_object bb=(p18_cloning_object)obj.clone(); // Cloning the object -> creating a new object with the same values
            bb.display();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}