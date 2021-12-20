import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("輸入課程");
        int Career = Scanner.nextInt();
        int level = Career ;


        switch(level) {
            case 1:
                System.out.println("數學");
                break;
            case 2:
                System.out.println("國文");
                break;
            case 3:
                System.out.println("英文");
                break;

        }
    }
}
