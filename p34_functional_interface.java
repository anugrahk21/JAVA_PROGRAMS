interface FunctionalInterface {
    void display();
}
class p34_functional_interface{
    public static void main(String[] args){
        FunctionalInterface fi = new FunctionalInterface(){
            public void display(){
                System.out.println("Functional Interface");
            }
        };
        fi.display();

        // Lambda expression
        FunctionalInterface fi2 = () -> System.out.println("Functional Interface using Lambda");
        fi2.display();
    }
}