package JavaCalisma4;

public class ornek05_SicramaIfadeleri {

	public static void main(String[] args) {
		boolean t = true;
		bir: {
			System.out.println("Birinci Blok");
			iki: {
				System.out.println("Ýkinci Blok");
				uc: {
					if (t)
						break iki;
					System.out.println("Üçüncü Blok");
				}
				System.out.println("2.Blok Çýkýþý");
			}
			System.out.println("1.Blok Çýkýþý");
		}
	}

}
