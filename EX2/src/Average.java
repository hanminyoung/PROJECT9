import java.util.ArrayList;
import java.util.Scanner; 
public class Average {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //스캐너 객체와 레퍼런스 변수 생성
        ArrayList<Character> grade= new ArrayList<Character>(); //ArrayList 객체와 레퍼런스 변수 생성, 스레드 동기화 지원 안함
        double sum=0; 
        int count=0; 
        double score[]=new double[5]; //실수형 배열 크기 5 score
        System.out.print("5개의 학점을 빈 칸으로 분리 입력 (A/B/C/D/F)>>");
        while(count!=5) //count가 5가 아닐때까지 반복, for를 쓰지 않은 이유는 A,B,C,D,F 이외의 것을 걸러내야해서 continue써야하는데
            //for 에서 continue 쓰면 증감식은 그대로 실행되어버리니까
        {
            String st = s.next(); //String에 문자열 입력
            char c = st.charAt(0); //지정된 index에 있는 문자 리턴해서 c에 대입
            if((c>='A'&&c<='D')||c=='F') //c가 A~D 혹은 F이면
            {grade.add(c); count++;} //grade에 c를 추가하고 count 증가
            else continue; //아니면 continue;
        }
        for(int i=0;i<grade.size();i++) //i=0부터 grade.size보다 작을때까지 반복, size는 5
        {
            if(grade.get(i)=='A')   //grade의 index에 해당하는 값이 A일때
            {score[i]=4.0;} //score[i]에 4.0 대입
            else if(grade.get(i)=='B') //grade의 index에 해당하는 값이 B일때
            {score[i]=3.0;} //score[i]에 3.0 대입
            else if(grade.get(i)=='C') //grade의 index에 해당하는 값이 C일때
            {score[i]=2.0;} //score[i]에 2.0 대입
            else if(grade.get(i)=='D') //grade의 index에 해당하는 값이 D일때
            {score[i]=1.0;} //score[i]에 1.0 대입
            else if(grade.get(i)=='F') //grade의 index에 해당하는 값이 F일때
            {score[i]=0.0;} //score[i]에 0.0 대입
            sum+=score[i]; //sum에 sum과 score[i] 더한 값 대입
        }
        System.out.print("평균 : "+sum/grade.size() ); //평균 출력
}
}