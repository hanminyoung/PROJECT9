import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;
public class Rain {
 
    public static void print(Vector<Integer> v) {

        Iterator<Integer> it = v.iterator();//Vector<integar>Ȱ��
        int sum = 0;
        it = v.iterator();
        
        while (it.hasNext()) {
            int n = it.next();
            sum += n;
        }
        System.out.print("���� ��� " + sum / v.size());
    }
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();

        while (true) {
            System.out.print("������ �Է� (0 �Է½� ����)>> ");
            int n = scanner.nextInt(); //������ �Է�
            if (0 == n)
                break;//0 �Է� ����

            else
                v.add(n);
            
            for (int i = 0; i < v.size(); i++) {
                System.out.print(v.get(i) + " ");
            }//for������ ������ �Է��Ѱ� ����ϱ�

            System.out.println(" ");
            print(v);
            System.out.println(" ");
        }
        scanner.close();
    }
}