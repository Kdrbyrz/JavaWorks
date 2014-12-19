package javaCalisma3;

class Meyveler {
	public void doYazdir() {
		String[] meyveler = { "Elma", "Kiraz", "Armut", "Karpuz", "Muz" };
		for (String meyve : meyveler) {
			System.out.println(meyve);
		}
		int[] sayilar = { 2, 11, 4, 16, 20, 14, 58, 34 };
		for (int sayi : sayilar) {
			System.out.print(sayi + " ");
		}
	}

}

public class ornek12_Donguler {

	public static void main(String[] args) {
		Meyveler meyve1 = new Meyveler();
		meyve1.doYazdir();
	}

}
