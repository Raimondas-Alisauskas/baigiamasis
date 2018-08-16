import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		System.out.println("Starting...");
		
		// Init data
		Random rnd = new Random();

		int count = 2500000; //+ rnd.nextInt(50000);
		List<Mokinys> data = new ArrayList<>();

		for (int i = 0; i < count; i++) {
			data.add(new Mokinys("" + i, getVidurkis(rnd, i)));
		}
		data.add(new Mokinys("sad", 10.0));

		Map<String, List<Mokinys>> mokiniai = new HashMap<>();
		mokiniai.put("sd", data);

		Task1Bogdan task = new Task1Bogdan();

		
		
		// Call
		
		long timeAmount = System.currentTimeMillis();
		List<List<Mokinys>> result = task.getReordered(mokiniai);
		timeAmount = System.currentTimeMillis() - timeAmount;

		// Output

		System.out.println("Counter : " + count);

		for (List<Mokinys> list : result) {
			System.out.println("- " + list.size());
			printFirst(5, list);
		}
		System.out.println("Done in " + timeAmount + " ms / " + (timeAmount / 1000) + " s");

	}

	private static void printFirst(int i, List<Mokinys> list) {
		int max = (list.size() > i ? i : list.size());
		System.out.print("       ");
		for (int j = 0; j < max; j++) {
			System.out.print("" + list.get(j).getVidurkis() + "; ");
		}
		System.out.print(" ...");
		System.out.println();

	}

	private static double getVidurkis(Random rnd, int i) {
		rnd.setSeed(Integer.MAX_VALUE - i);
		return ((double) rnd.nextInt(101)) / 10;
	}

}
