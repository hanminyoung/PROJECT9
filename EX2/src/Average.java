import java.util.ArrayList;
import java.util.Scanner; 
public class Average {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //��ĳ�� ��ü�� ���۷��� ���� ����
        ArrayList<Character> grade= new ArrayList<Character>(); //ArrayList ��ü�� ���۷��� ���� ����, ������ ����ȭ ���� ����
        double sum=0; 
        int count=0; 
        double score[]=new double[5]; //�Ǽ��� �迭 ũ�� 5 score
        System.out.print("5���� ������ �� ĭ���� �и� �Է� (A/B/C/D/F)>>");
        while(count!=5) //count�� 5�� �ƴҶ����� �ݺ�, for�� ���� ���� ������ A,B,C,D,F �̿��� ���� �ɷ������ؼ� continue����ϴµ�
            //for ���� continue ���� �������� �״�� ����Ǿ�����ϱ�
        {
            String st = s.next(); //String�� ���ڿ� �Է�
            char c = st.charAt(0); //������ index�� �ִ� ���� �����ؼ� c�� ����
            if((c>='A'&&c<='D')||c=='F') //c�� A~D Ȥ�� F�̸�
            {grade.add(c); count++;} //grade�� c�� �߰��ϰ� count ����
            else continue; //�ƴϸ� continue;
        }
        for(int i=0;i<grade.size();i++) //i=0���� grade.size���� ���������� �ݺ�, size�� 5
        {
            if(grade.get(i)=='A')   //grade�� index�� �ش��ϴ� ���� A�϶�
            {score[i]=4.0;} //score[i]�� 4.0 ����
            else if(grade.get(i)=='B') //grade�� index�� �ش��ϴ� ���� B�϶�
            {score[i]=3.0;} //score[i]�� 3.0 ����
            else if(grade.get(i)=='C') //grade�� index�� �ش��ϴ� ���� C�϶�
            {score[i]=2.0;} //score[i]�� 2.0 ����
            else if(grade.get(i)=='D') //grade�� index�� �ش��ϴ� ���� D�϶�
            {score[i]=1.0;} //score[i]�� 1.0 ����
            else if(grade.get(i)=='F') //grade�� index�� �ش��ϴ� ���� F�϶�
            {score[i]=0.0;} //score[i]�� 0.0 ����
            sum+=score[i]; //sum�� sum�� score[i] ���� �� ����
        }
        System.out.print("��� : "+sum/grade.size() ); //��� ���
}
}