//task 6
import java.util.Arrays;
import java.util.ArrayList;

public class Difference {

	static int[] arrayDiff(int[] a, int[] b){
        ArrayList<Integer> diff = new ArrayList<Integer>();
        
        for (int x:a){
            boolean test = false;
            for (int y : b) {
                if (x == y) {
                    test = true;
                    break;
                }
            }
            if(! test){
                diff.add(x);
            }
        }

        int[] result = new int[diff.size()];
        for (int i = 0; i < diff.size(); i++){
            result[i] = diff.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,3,4,5,5,6};
        int[] b = {2,3,4};
        int[] d = arrayDiff(a,b);
        System.out.println(Arrays.toString(d));

    }

}
