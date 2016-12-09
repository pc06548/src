
interface a{
    int i = 5;
    public void add(int x)throws RuntimeException;
}
interface b extends a{
    public void add(int x) throws NullPointerException;
}


public class TestJava{
    public static void main(String[] args){

    }

    public static void add(int a, int b){
        System.out.println("ggg");
    }

    public static void add(int... a){
        System.out.println("hhg");
    }

}