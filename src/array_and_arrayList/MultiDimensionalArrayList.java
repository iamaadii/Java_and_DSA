package array_and_arrayList;
import java.util.*;

public class MultiDimensionalArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Create a 2D ArrayList
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        // Add rows to the 2D ArrayList
        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                row.add(i + j);  // Example value
            }
            matrix.add(row);  // Add row to the matrix
        }

        // Print the 2D ArrayList
        for (ArrayList<Integer> row : matrix) {
            System.out.println(row);
        }
	}
}

