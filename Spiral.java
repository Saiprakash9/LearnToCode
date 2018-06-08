import java.util.ArrayList;
import java.util.List;

public class Spiral {

    public static void main(String[] args) {

        List<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> B = new ArrayList<Integer>();
        int rf = 0, rl = 0, cf = 0, cl = 0;
        rl = A.size();
        cl = A.get(0).size();

        while (rf < rl && cf < cl) {
            for (int i = 0; i < cl; i++) {
                B.add(A.get(rf).get(i));
            }
            rf++;
            for (int j = 0; j < rl; j++) {
                B.add(A.get(j).get(rl));
            }
            rl--;
            for (int k = cl; k >= 0; k--) {
                B.add(A.get(cl).get(k));
            }
            cl--;
            for (int l = cf; l >= rf; l--) {
                B.add(A.get(l).get(cf));
            }
            cf++;
        }

        System.out.print("}");
    }

}
