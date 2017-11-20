import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;
public class Rain {
 
    public static void print(Vector<Integer> v) {

        Iterator<Integer> it = v.iterator();//Vector<integar>활용
        int sum = 0;
        it = v.iterator();
        
        while (it.hasNext()) {
            int n = it.next();
            sum += n;
        }
        System.out.print("현재 평균 " + sum / v.size());
    }
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();

        while (true) {
            System.out.print("강수량 입력 (0 입력시 종료)>> ");
            int n = scanner.nextInt(); //강수량 입력
            if (0 == n)
                break;//0 입력 종료

            else
                v.add(n);
            
            for (int i = 0; i < v.size(); i++) {
                System.out.print(v.get(i) + " ");
            }//for문으로 강수량 입력한거 출력하기

            System.out.println(" ");
            print(v);
            System.out.println(" ");
        }
        scanner.close();
    }
}