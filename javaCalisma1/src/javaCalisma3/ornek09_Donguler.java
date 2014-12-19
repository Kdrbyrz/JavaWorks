package javaCalisma3;
class IlkOnSayi{
	public void doBaslat(){
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			
		}
		for(;;){
			System.out.println("mesaj");
		}
	}
}
public class ornek09_Donguler {

	public static void main(String[] args) {
		IlkOnSayi sayi1=new IlkOnSayi();
		sayi1.doBaslat();
	}

}
