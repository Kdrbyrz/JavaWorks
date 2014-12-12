package javaCalisma2;
class InstanceDegiskenler{
	boolean karar;
	int sayi;
	String metin;
	public void doYazdir(){
		System.out.println("Karar: "+karar);
		System.out.println("Sayý: "+sayi);
		System.out.println("Metin: "+metin);
	}
	
}
public class ornek19_DegiskenTipleri {

	public static void main(String[] args) {
		InstanceDegiskenler instance1=new InstanceDegiskenler();
		instance1.doYazdir();
	}

}
