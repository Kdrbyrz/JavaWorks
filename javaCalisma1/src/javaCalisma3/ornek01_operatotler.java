package javaCalisma3;

class IliskiselOperatorler{
	
	boolean sonuc;
	public boolean isEsit(int sayi1,int sayi2){
		return sonuc=sayi1==sayi2;
	}
	public boolean isEsitDegil(int sayi1, int sayi2){
		return sonuc=sayi1!=sayi2;
		
	}
	public boolean isBuyuk(int sayi1,int sayi2){
		return sonuc=sayi1>sayi2;
	}
	public boolean isKucuk(int sayi1,int sayi2){
		return sonuc=sayi1<sayi2;
	}
	public boolean isBuyukVeyaEsit(int sayi1,int sayi2){
		return sonuc=sayi1>=sayi2;
	}
	public boolean isKucukVeyaEsit(int sayi1,int sayi2){
		return sonuc=sayi1<=sayi2;
	}
	public void doyazdir(){
		System.out.println("Sonuc: "+sonuc);
	}
}
public class ornek01_operatotler {

	public static void main(String[] args) {
		IliskiselOperatorler operator1=new IliskiselOperatorler();
		operator1.isEsit(5, 5);
		operator1.doyazdir();
		operator1.isEsit(5, 7);
		operator1.doyazdir();
		
		operator1.isEsitDegil(5, 7);
		operator1.doyazdir();
		operator1.isEsitDegil(5, 7);
		
		operator1.isBuyuk(1, 3);
		operator1.doyazdir();
		operator1.isBuyuk(3, 1);
		operator1.doyazdir();
		
		operator1.isKucuk(5, 7);
		operator1.doyazdir();
		operator1.isKucuk(7, 5);
		operator1.doyazdir();
	}
}
