import com.mypackage.MyClass;

public class Programme {

    public static void inc(int x) {
        x++;
    }

    public static void inc1(Integer x) {
        x++;
    }

    public static void main(String[] args) {

        Integer x = 7;
        int y = 7;
        inc(x);
        inc1(y);

        System.out.println(x);
        System.out.println(y);

        MyClass obj = new MyClass(1, 2);
        obj.name = "Ada";
        obj.czyTuli = true;        
        System.out.println(obj.sum());

    }
}

