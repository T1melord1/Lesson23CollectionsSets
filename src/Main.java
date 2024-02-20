import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    private static Set<String> words = new TreeSet<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите слово ");
            String word = new Scanner(System.in).nextLine();
            if (word.matches("[А-я]+")) {
                if (words.contains(word)) {
                    System.out.println("Слово " + word + " уже добавлено ранее");
                    continue;
                }
                words.add(word);
                System.out.println(word + " успешно добавлено");
                continue;
            } else if (word.equals("print"))
                for (String s : words) {
                    System.out.println(s);
                }
            System.out.println(word + " не русское слово!!");
        }
        }
    }





