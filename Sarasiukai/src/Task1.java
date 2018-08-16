import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Task1 {

	/**
	 * 
	 * 
	 * @param mokiniai
	 *            - isrikiuoti pagal vardus
	 * @return turetu grazinti isrikiuotus pagal pazymiu vidurki reziais [0..1)
	 *         [1..2) ... [9..10]
	 */
	public List<List<Mokinys>> getReordered(Map<String, List<Mokinys>> mokiniai) {
		return orderByAvg(fetchData(mokiniai));
	}

	private List<List<Mokinys>> orderByAvg(List<Mokinys> prData) {
		Map<String, List<Mokinys>> byAvg = initMapByAvg();

		for (int i = 0; i < 10; i++) {
			groupByRange(i, prData, byAvg);
		}

		// paskutinis rezis [9..10] yra su 10 iskaitytinai. Po kiekvieno rezio salinam
		// is pradiniu duomenu mokinius, tad liks tik su 10 vidurkiais
		byAvg.get("9").addAll(prData);

		return constructReturn(byAvg);
	}

	private List<List<Mokinys>> constructReturn(Map<String, List<Mokinys>> byAvg) {
		List<List<Mokinys>> result = new ArrayList<>();
		Set<String> keys = byAvg.keySet();

		for (String key : keys) {
			if (!byAvg.get(key).isEmpty()) {
				result.add(byAvg.get(key));
			}
		}

		return result;
	}

	// range 0..9
	private void groupByRange(int range, List<Mokinys> prData, Map<String, List<Mokinys>> byAvg) {
		List<Mokinys> listForRemove = new ArrayList<>();

		List<Mokinys> list = null;

		for (Mokinys mokinys : prData) {
			if (mokinys.getVidurkis() < (range + 1)) {
				// Isisitraukiam Value (List<>)
				list = byAvg.get(Integer.toString(range));
				//list = byAvg.get("" + range);
				
				// Prie Map value pridedam Mokinys tipo objekta
				list.add(mokinys);
				// "Isimenam" ka reiks pasalinti is pradiniu duomenu
				listForRemove.add(mokinys);
			}
		}
		// Jau atrinkuom juos - ismetam, nebenus reikalingi
		prData.removeAll(listForRemove);
	}

	private Map<String, List<Mokinys>> initMapByAvg() {
		Map<String, List<Mokinys>> result = new HashMap<>();

		for (int i = 0; i < 10; i++) {
			result.put("" + i, new LinkedList<>());
		}

		return result;
	}

	private List<Mokinys> fetchData(Map<String, List<Mokinys>> mokiniai) {

		Collection<List<Mokinys>> list = mokiniai.values();
		List<Mokinys> result = new ArrayList<>();

		for (List<Mokinys> elementList : list) {
			for (Mokinys mokinys : elementList) {
				result.add(mokinys);
			}
		}

		return result;
	}

}
