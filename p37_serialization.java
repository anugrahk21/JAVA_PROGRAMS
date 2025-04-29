import java.io.*;

class A implements Serializable {
    int a;
    String b;
    A(int a, String b){
        this.a = a;
        this.b = b;
    }
};

// Serialization is the process of converting an object into a byte stream
// so that it can be saved to a file or sent over a network. The reverse process is called deserialization.

class p37_serialization{
    public static void main(String[] args){
        A a = new A(1, "Hello");
        // Serialization code here
        try (ObjectOutputStream obj1 = new ObjectOutputStream(new FileOutputStream("abc.txt"))) {
            obj1.writeObject(a);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Serialization done\n");
        }

        // Deserialization code here
        try (ObjectInputStream obj2 = new ObjectInputStream(new FileInputStream("abc.txt"))) {
            A a1 = (A) obj2.readObject();
            System.out.println("Integer: "+a1.a + ", " +"String: "+ a1.b);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Deserialization done");
        }
    }
}