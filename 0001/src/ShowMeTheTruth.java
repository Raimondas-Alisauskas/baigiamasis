
public class ShowMeTheTruth {

	@SuppressWarnings("unused")
	private static final int MONTH_PER_YEAR = 12;

	public static void main(String[] args) {

		int m = 11;
		int d = 16;

		DatosKonverteris aa = new DatosKonverteris();

		String konveretuotaData = aa.convert(m, d);
		System.out.println(konveretuotaData);

		konveretuotaData = aa.convert(m, 6);
		System.out.println(konveretuotaData);
		
		konveretuotaData = aa.convert(m + 1, d);
		System.out.println(konveretuotaData);
		
		konveretuotaData = aa.convert("6", "2");
		System.out.println(konveretuotaData);

//		if (Menesis.values().length != MONTH_PER_YEAR) {
//			// Gali isvesti pirmiau, nenustebkit
//			System.err.println("Pametem menesius :(");
//		}
	}

}
