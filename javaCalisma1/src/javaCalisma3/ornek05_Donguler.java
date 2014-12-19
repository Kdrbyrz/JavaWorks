package javaCalisma3;
class Ogrenci{
	public void doSay(int sayi){	
		while (sayi>0){
			System.out.println(sayi--);
		}
	}
}
public class ornek05_Donguler {
	public static void main(String[] args) {
	Ogrenci ogrenci1=new Ogrenci();
	ogrenci1.doSay(5);
	}
}
