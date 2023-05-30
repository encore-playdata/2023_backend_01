import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class LottoGH{
    public static List<Integer> LottoNumbers = new ArrayList<>();
    public static void main(String[] args) {
        while (LottoNumbers.size() < 6) {
            LottoNumbers.add(getLottoNumber());
        }
        System.out.println(LottoNumbers);
    }
    public static int getLottoNumber() {
        int number = (int) (Math.random() * 45 + 1);
        if (!checknumber(number))
            number = getLottoNumber();
        return number;
    }
    public static boolean checknumber(int number) {
        for (int i = 0; i < LottoNumbers.size(); ++i) {
            if (LottoNumbers.get(i) == number)
                return false;
        }
        return true;
    }
}