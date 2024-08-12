import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] strArr = s.split("\\.");
        boolean chk = true;
        
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].length() % 2 != 0) {
                System.out.println(-1);
                chk = false;
                break;
            }
        }

        if (chk) {
            s = s.replaceAll("XXXX", "AAAA");
            s = s.replaceAll("XX", "BB");
    
            System.out.println(s);
        }
    }
}