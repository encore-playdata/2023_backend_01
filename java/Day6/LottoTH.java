import java.util.ArrayList;
import java.util.List;
public class LottoTH {
    static boolean[] visited = new boolean[46];
    static List<Integer> list = new ArrayList<>();
    //재귀함수를 사용해서
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println(i+"번째 로또 출력");
            getSixNumber();
            System.out.println(list.toString());
            list.clear();
        }
    }
    static void getSixNumber(){
        if(list.size()==6){
            return;
        }
        int idx =(int)(Math.random()*45)+1;
        if(!visited[idx]){
            visited[idx]=true;
            list.add(idx);
        }
        getSixNumber();
    }
}