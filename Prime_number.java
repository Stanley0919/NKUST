import java.util.*;

public class Prime_number {
    public static void main(String[] args) {
        List<Integer> primeArray = new ArrayList<>();
        int  i , j ;
        for (i = 2; i <= 100; i++){
            for( j = 2; j < i ;j++ ){
                if ( i % j == 0 )
                    break;
            }
            if ( i == j ){
                primeArray.add(i);
                       System.out.println(j);


            }

        }
    }

}
