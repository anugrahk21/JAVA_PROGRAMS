enum Days{
    monday, tuesday, wednesday, thursday, friday, saturday, sunday
};

public class p11_enum { // We can give any name to the class if it is not public. If we make the class name the same as the file name, it should be public.
    public static void main(String[] args){
        Days d=Days.thursday;
        System.out.println(d);
    }
}