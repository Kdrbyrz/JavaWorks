package javaCalisma3;
class Sayilar{
	int[] sayilar={2,5,26,82,58};
	public void doYazdir(){
		for (int i = 0; i < sayilar.length; i++) {
			System.out.println(sayilar[i]);
		}
	}
}
public class ornek11_Donguler {

	public static void main(String[] args) {
		Sayilar sayilar1=new Sayilar();
		sayilar1.doYazdir();
	}

}
