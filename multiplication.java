import java.util.ArrayList;

public class multiplication {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        int sum = 0;
        for(int i = 1 ; i <= 50 ; i ++){
            if( i % 2 == 1 && i != 1 ){
                num.add(-(i * i));
            }
            else
                num.add((i*i));
            }
        for(int i = 1 ; i <= num.size() - 1; i++){
            sum = sum + num.get(i);;
        }
        System.out.println(num);
        System.out .println(sum);
    }
}


