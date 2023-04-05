import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Method {
    public static List<Integer> printOdd(List<Integer> numberList) {
        List<Integer> copy = new ArrayList<>(numberList);
        for (int i = 0; i < copy.size(); i++) {
            if (copy.get(i) % 2 == 0) {
                copy.remove(i);
                i--;
            }
        }
        return copy;

    }

    public static List<Integer> printEven(List<Integer> numberList) {
        List<Integer> copy = new ArrayList<>(numberList);
        Collections.sort(copy);
        for (int i = 0; i < copy.size(); i++) {
            if (copy.get(i) % 2 != 0 || i == copy.size() - 1 || copy.get(i).equals(copy.get(i + 1))) {
                copy.remove(i);
                i--;
            }
        }
        return copy;
    }

    public static List<String> printLists(String text) {
        String[] tokens = text.split(" ");
        List<String> copy = new ArrayList<>();

        Collections.addAll(copy, tokens);
        Collections.sort(copy);
        for (int i = 0; i < copy.size(); i++) {
            if (i == copy.size() - 1 || copy.get(i).equals(copy.get(i + 1))) {
                copy.remove(i);
                i--;
            }
        }
        return copy;
    }

    public static List<Integer> printList(String text) {
        String[] tokens = text.split(" ");
        List<String> copy = new ArrayList<>();
        Collections.addAll(copy, tokens);
        Collections.sort(copy);
        System.out.println(copy);
        int j = 1;
        List<Integer> num = new ArrayList<>();
        for (int i = 1; i < copy.size(); i++) {
            if (copy.get(i).equals(copy.get(i - 1))) {
                j = j + 1;

            }else if (j == 1) {
            }else {
                num.add(j);
                j = 1;
            }
        }
        return num;
    }
}


