import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Human vasya = new Human("Вася", 20);
        Human petya = new Human("Петя", 30);
        Set<Human> strings = new TreeSet<>();
        strings.add(vasya);
        strings.add(petya);
//        strings.remove("Третье");

        for(Human s : strings){
            System.out.println(s);
        }
    }

}
