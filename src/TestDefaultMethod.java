interface inte{
    public void cube(int x);
    default void show(){
        System.out.println("Default method executed");
    }
}

public class TestDefaultMethod implements inte{

    @Override
    public void cube(int x) {
        System.out.println(x*x*x);
    }

//    @Override
//    public void show() {
//        System.out.println("Overrided method executed");
//    }

    public static void main(String[] args) {
        TestDefaultMethod t = new TestDefaultMethod();
        t.cube(2);
        t.show();
    }
}
