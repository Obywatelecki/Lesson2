import com.mypackage.Coord;
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
        System.out.println(obj.sum());

        Coord c1 = new Coord(1, 2);
        System.out.println(c1.sum());

    }
}

