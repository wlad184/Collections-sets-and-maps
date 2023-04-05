import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 10, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 12, 86, 47, 56, 42, 0, 101,8 , 50, 50, 50, 77, 77, -10));
        String text = "Гарри Поттер Гермиона Гарри Грейнджер и Рон Уизли Гарри Поттер, Гермиона Грейнджер и Рон Уизли Гарри";
        System.out.println(Method.printOdd(numberList) + " - нечётные числа списка");
        System.out.println(Method.printEven(numberList) + " - чётные числа списка в порядке возрастания");
        System.out.println(Method.printLists(text) + " - уникальные слова из списка слов, в котором могут встречаться дубли.");
        System.out.println(Method.printList(text) + " - все количество дублей из списка слов.");
    }
}