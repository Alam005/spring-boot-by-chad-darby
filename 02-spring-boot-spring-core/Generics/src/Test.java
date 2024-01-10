import java.util.ArrayList;

public class Test{
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        l.add("Durga");
        l.add("Shiva");
        l.add("Ravi");
        Test.m1(l);
        System.out.println(l);

    }

    public static void m1(ArrayList l){
        l.add(10);
        l.add(10.5);
        l.add(true);
    }

}
