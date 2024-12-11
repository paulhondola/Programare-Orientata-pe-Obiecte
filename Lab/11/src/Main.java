import java.util.*;

public class Main {
    private List<String> list = new ArrayList<>();

    public Main() {
        list.add("Hello");
        list.add("World");
        list.add("Java");

        for (String str : list) {
            System.out.println(str);
        }

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}