import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class HWProgram12 {

    public static void main(String[] args){

        int [] arrayNum1 = new int[7];
        int [] arrayNum2 = new int[7];

        Random random = new Random();

        for (int i = 0; i < 7; i++) {
            arrayNum1[i] = random.nextInt(10);
            arrayNum2[i] = random.nextInt(10);
        }
        Arrays.sort(arrayNum1);
        Arrays.sort(arrayNum2);

        int matches = 0;
        for (int i = 0; i < 7; i++) {
            if ( arrayNum1[i] == arrayNum2[i] ){
                matches ++;
            }

        }
        System.out.println(Arrays.toString(arrayNum1));
        System.out.println(Arrays.toString(arrayNum2));
        System.out.println("Кількість збігів:" + matches);



    }
}
