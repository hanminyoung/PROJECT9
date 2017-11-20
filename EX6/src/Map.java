import java.util.HashMap;
import java.util.Scanner; 
class Location { 
    String country; 
    int lat, lon; 
    public Location(String country, int lat, int lon) { 
       this.country = country; 
       this.lat = lat; 
       this.lon = lon; 
       } 
} //this�� ���� �浵 ���� ����
 public class Map { 
    public static void main(String[] args) { 
       Scanner sc = new Scanner(System.in); 
       HashMap<String, Location> map = new HashMap<String, Location>(); 
       System.out.println("����,�浵,������ �Է��ϼ���."); 
       
       for(int i=0 ; i<4 ; i++) { 
          System.out.print(">> "); 
          String[] str = sc.nextLine().split(", "); //HashMap�÷����� ���ϴ� ���� �Է��ؼ� �ֱ�

          int d1 = Integer.parseInt( str[1] ); 
          int d2 = Integer.parseInt( str[2] ); 
          map.put(str[0], new Location(str[0], d1, d2)); 
       } 
       System.out.println("----------------"); 

       for(String key : map.keySet()) { 
          Location loc = map.get(key); 
          System.out.println(loc.country + "\t" + loc.lat + "\t" + loc.lon); 
       } 
       System.out.println("----------------"); 
       while( true ) { 
         System.out.print("�����̸� >> "); 
          String str = sc.nextLine(); //�����̸� �Է��ϰ� �˻��ϱ�

          if( str.equals("�׸�") ) { 
             break; 
          } 
          if( map.containsKey(str) ) { 
             Location loc = map.get(str); 
             System.out.println(loc.country + "\t" + loc.lat + "\t" + loc.lon); 
             } else { 
             System.out.println(str + "��(��) �����ϴ�."); //�˻��ϱ� ������ �浵 ���� ���, ������ �����ϴ� ���
         } 
      } 
    } 
    } 

