package JavaCalisma4;

public class ornek05_SicramaIfadeleri {

	public static void main(String[] args) {
		boolean t = true;
		bir: {
			System.out.println("Birinci Blok");
			iki: {
				System.out.println("�kinci Blok");
				uc: {
					if (t)
						break iki;
					System.out.println("���nc� Blok");
				}
				System.out.println("2.Blok ��k���");
			}
			System.out.println("1.Blok ��k���");
		}
	}

}
