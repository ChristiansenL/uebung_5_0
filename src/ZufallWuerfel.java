
public class ZufallWuerfel {

	public static String ZahlenInText(int a) {
		String s = "";

		if (a == 1) {
			s = "Eins";
		} else if (a == 2) {
			s = "Zwei";
		} else if (a == 3) {
			s = "Drei";
		} else if (a == 4) {
			s = "Vier";
		} else if (a == 5) {
			s = "Fünf";
		} else if (a == 6) {
			s = "Sechs";
		}

		return s;
	}

	public static void main(String[] args) {

		// ohne array

		int eins = 0;
		int zwei = 0;
		int drei = 0;
		int vier = 0;
		int fuenf = 0;
		int sechs = 0;

		for (int zaehler = 0; zaehler < 50; zaehler++) {
			int a = Zufall.getZufallInt(1, 6);

			if (a == 1) {
				eins++;
			} else if (a == 2) {
				zwei++;
			} else if (a == 3) {
				drei++;
			} else if (a == 4) {
				vier++;
			} else if (a == 5) {
				fuenf++;
			} else if (a == 6) {
				sechs++;
			}
		}

		int summe = eins + zwei + drei + vier + fuenf + sechs;

		System.out.println("Einsen: " + eins);
		System.out.println("Zweien: " + zwei);
		System.out.println("Dreien: " + drei);
		System.out.println("Vieren: " + vier);
		System.out.println("Fünfen: " + fuenf);
		System.out.println("Sechsen: " + sechs);
		System.out.println("");
		System.out.println("Summe: " + summe);
		System.out.println("");

		// mit array

		int[] array = new int[6];

		for (int zaehler = 0; zaehler < 50; zaehler++) {
			int x = Zufall.getZufallInt(1, 6);
			array[x - 1]++;
		}

		for (int y = 0; y < 6; y++) {
			System.out.println(ZahlenInText(y + 1) + "en: " + array[y]);
		}
	}

}
