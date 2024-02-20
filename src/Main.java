import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> strings = new TreeSet<>();
        strings.add(32);
        strings.add(10);
        strings.add(2);
//        strings.remove("Третье");

        for(Integer s : strings){
            System.out.println(s);
        }
    }

}
