import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Task1Anton {

	public List<List<Mokinys>> getReordered(Map<String, List<Mokinys>> mokiniai) {

		List<Mokinys> list = getArrayList(mokiniai);
		List<List<Mokinys>> listList = getListListNotCorrect(list);
		listList = getListListCorrected(listList);

		return listList;
	}

	List<Mokinys> getArrayList(Map<String, List<Mokinys>> mokiniai) {
		List<Mokinys> list = new ArrayList();

		// Perkeliam masyvus i patogu formata
		for (String key : mokiniai.keySet()) {
			list.addAll(mokiniai.get(key));
		}

		return list;
	}

	List<List<Mokinys>> getListListNotCorrect(List<Mokinys> getArrayList) {
		List<Mokinys> tempList = new ArrayList();
		List<List<Mokinys>> mokinys = new ArrayList<>();

		double pazymys;

		// Sugrupuojame pagal pazymius (10 iketli i atskira masyva)
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < getArrayList.size(); j++) {

				pazymys = getArrayList.get(j).getVidurkis();

				if (pazymys >= (0 + i) && pazymys < (1 + i)) {
					tempList.add(getArrayList.get(j));
				}
			}
			mokinys.add(tempList);
			tempList.clear();
		}
		return mokinys;
	}

	List<List<Mokinys>> getListListCorrected(List<List<Mokinys>> listList) {

		List<List<Mokinys>> newMokinys = new ArrayList<>();
		List<Mokinys> mergedMokinys = new ArrayList<>();

		// Sumetam du paskutinius masyvas (9 ir 10) i viena - tarpini
		mergedMokinys.addAll(listList.get(listList.size() - 2));
		mergedMokinys.addAll(listList.get(listList.size() - 1));

		// Sumetam visus masyva isskirus du paskutinius i tarpini List<List>
		for (int i = 0; i < (listList.size() - 1); i++) {
			newMokinys.add(listList.get(i));
		}

		// Pridedam dar viena (su 9-10) masyva i bendro masyvo gala
		newMokinys.add(mergedMokinys);

		return newMokinys;
	}
}
