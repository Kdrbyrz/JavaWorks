package javaCalisma3;

class DonguVeKontrol {
	public void ciftSayilar() {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0 && i > 5)
				System.out.println(i);

		}
	}
}

public class ornek14_KontrolIfadeleri {

	public static void main(String[] args) {
		DonguVeKontrol dongu1 = new DonguVeKontrol();
		dongu1.ciftSayilar();
	}

}
