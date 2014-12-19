package javaCalisma3;
class lojikOperatorler{
	int sayi1;
	boolean sonuc;
	public int getSayi1() {
		return sayi1;
	}
	public void setSayi1(int sayi1) {
		this.sayi1 = sayi1;
	}
	public void veOperatoru(){
		sonuc=sayi1>0 && sayi1<10;
	}
	public void veyaOperatoru(){
		sonuc=sayi1>0 || sayi1==-5;
	}
	public void degilOperatoru(){
		sonuc=!(sayi1>0 && sayi1<10);
	}
	public void doYazdir(){
		System.out.println("sonuç: "+sonuc);
	}
}
public class ornek02_opreratorler {

	public static void main(String[] args) {
		lojikOperatorler lojik1=new lojikOperatorler();
		lojik1.setSayi1(7);
		lojik1.veOperatoru();
		lojik1.doYazdir();
		
		lojik1.setSayi1(-5);
		lojik1.veyaOperatoru();
		lojik1.doYazdir();
		
		lojik1.setSayi1(5);
		lojik1.degilOperatoru();
		lojik1.doYazdir();
		
		
	}

}
