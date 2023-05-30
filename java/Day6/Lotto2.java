import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lotto2 {
//     재귀 함수를 사용해서
//     Set x
//     중복 x
//     로또 번호를 만들어 보기
//     (int) (Math.random() * 45) + 1
//     30

    static int[] arr = new int[6];
    public static void main(String[] args) {
        setNum(0);
        System.out.println(Arrays.toString(arr));
    }

    public static void setNum(int i){
        if(i>5) return;
        int num = (int) (Math.random() * 45 + 1);
        boolean isExist = false;
        for (int j = 0; j < 6; j++) {
            if(num == arr[i]) {
                isExist = true;
                break;
            }
        }
        if(!isExist){
            arr[i] = num;
        }
        setNum(isExist? i : i+1);
    }
}
