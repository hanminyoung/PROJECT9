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
} //this에 도시 경도 위도 저장
 public class Map { 
    public static void main(String[] args) { 
       Scanner sc = new Scanner(System.in); 
       HashMap<String, Location> map = new HashMap<String, Location>(); 
       System.out.println("도시,경도,위도를 입력하세요."); 
       
       for(int i=0 ; i<4 ; i++) { 
          System.out.print(">> "); 
          String[] str = sc.nextLine().split(", "); //HashMap컬렉션이 원하는 정보 입력해서 넣기

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
         System.out.print("도시이름 >> "); 
          String str = sc.nextLine(); //도시이름 입력하고 검색하기

          if( str.equals("그만") ) { 
             break; 
          } 
          if( map.containsKey(str) ) { 
             Location loc = map.get(str); 
             System.out.println(loc.country + "\t" + loc.lat + "\t" + loc.lon); 
             } else { 
             System.out.println(str + "은(는) 없습니다."); //검색하기 있으면 경도 위도 출력, 없으면 없습니다 출력
         } 
      } 
    } 
    } 

