import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        strings.add("Первое");
        strings.add("Второе");
        strings.add("Третье");
        strings.add("Первое");

        for(String s : strings){
            System.out.println(s);
        }
    }

}
