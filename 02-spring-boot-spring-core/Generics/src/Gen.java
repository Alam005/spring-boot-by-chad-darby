public class Gen<T>{
    T ob;
    Gen(T ob){
        this.ob=ob;
    }
    public void show()
    {
        System.out.println("The type of ob: "+ ob.getClass().getSimpleName());
    }
    public T getOb(){
        return ob;
    }
}

class GenDemo{
    public static void main(String[] args) {
        Gen<String> g1 = new Gen<String>("Alam");
        g1.show();
        String x= g1.getOb();
        System.out.println(x);

        Gen<Integer> g2 = new Gen<Integer>(10);
        g2.show();
        System.out.println(g2.getOb());

        Gen<Double> g3 = new Gen<Double>(10.5);
        g3.show();
        System.out.println(g3.getOb());
    }
}