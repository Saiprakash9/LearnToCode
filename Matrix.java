import java.util.ArrayList;
import java.util.List;

public class Matrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> a0 = new ArrayList<>();
		ArrayList<Integer> a1 = new ArrayList<>();
		ArrayList<Integer> a2 = new ArrayList<>();
		a0.add(1);
		a0.add(2);
		a0.add(3);
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a2.add(1);
		a2.add(2);
		a2.add(3);
		A.add(a0);
		A.add(a1);
		A.add(a2);
		for (ArrayList<Integer> a : A) {
			for (int i = 0; i < a.size(); i++)
				System.out.println(a.get(i));
		}

	}

}
