package exercises;

import java.util.ArrayList;

public class ArrayListAdder {

    public static void main(String[] args) {
        ArrayList<Integer> first =  new ArrayList<>();
        first.add(6);
        first.add(4);

        ArrayList<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(6);
        second.add(5);
        second.add(1);

        ArrayList<Integer> result = new ArrayList<>();

        int length = second.size();

        if (first.size() > second.size()) {
            length = first.size();
        }

        for (int i = 0; i < length; i++) {
            if (i < second.size() && i < first.size()) {
                int sum = first.get(i) + second.get(i);
                result.add(sum);
            } else if (i < first.size()) {
                result.add(first.get(i));
            } else if (i < second.size()) {
                result.add(second.get(i));
            }
        }

        System.out.println(result);
    }

}
