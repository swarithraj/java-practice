
import java.util.*;

public class FirstUniqueCharacter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = in.next();

        HashMap<Character, Integer> map = new HashMap<>();

    
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count=map.getOrDefault(ch, 0);
            map.put(ch, count+1);
            
        }

        char answer = '\0'; 

        
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int frequency=map.get(ch);
            if(frequency==1){
                answer=ch;
                break;
            }
           

        if (answer == '\0') {
            System.out.println(-1);
        } else {
            System.out.println(answer);
        }

        in.close();
    }
}
}
