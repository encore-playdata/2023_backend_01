import java.util.HashSet;
import java.util.*;
public class LottoDG {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Map<Integer, Integer> dict = new HashMap<>();
            getnum(dict);
            System.out.println(dict.keySet());
        }
    }
    public static Map<Integer, Integer> getnum(Map<Integer, Integer> dict) {
        if (dict.size() == 6) return dict;
        int num = (int) (Math.random() * 45 + 1);
        if (!dict.containsKey(num)) {
            dict.put(num, 0);
        }
        return getnum(dict);
    }
}
