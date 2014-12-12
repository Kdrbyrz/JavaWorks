package javaCalisma2;
class Alfabe{
	char karakter;

	public char getKarakter() {
		return karakter;
	}

	public void setKarakter(char karakter) {
		this.karakter = karakter;
	}
}
public class ornek17_VeriTipleri {

	public static void main(String[] args) {
		Alfabe harf1=new Alfabe();
		harf1.setKarakter('F');
		System.out.println("Harfimiz: "+harf1.getKarakter());
		Alfabe harf2=new Alfabe();
		harf2.setKarakter((char)71);
		System.out.println("2. Harfimiz: "+harf2.getKarakter());
	}

}
