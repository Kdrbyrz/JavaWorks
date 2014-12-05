package javaCalisma1;
class KareAl{
	int sayi;
	public void setSayi(int sayi){
		this.sayi=sayi;
	}
	public int getSayi(){
		return sayi;
	}
	public int doHesapla(){
		return sayi*sayi;
	}
	public void doyazdir(){
		System.out.println("girdiðiniz sayi: "+getSayi());
		System.out.println("Alan "+doHesapla());
	}
}

public class ornek08_siniflar {

	public static void main(String[] args) {
		KareAl kare1=new KareAl();
		kare1.setSayi(4);
		kare1.doyazdir();

	}

}
