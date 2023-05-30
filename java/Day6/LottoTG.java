import java.util.ArrayList;
import java.util.List;
public class LottoTG {
    public static void main(String[] args) {
        System.out.println(addLottoNumber(new ArrayList<>()));
    }
    static List<Integer> addLottoNumber(List<Integer> lotto){
        if(lotto.size()==6){
            return lotto;
        }
        while(true){
            int number = (int)(Math.random() * 45)+1;
            if(!lotto.contains(number)){
                lotto.add(number);
                break;
            }
        }
        return addLottoNumber(lotto);
    }
}
