package javaCalisma1;
class DortIslem4{
	int sayi1;
	int sayi2;
	public void setSayi(int sayi1,int sayi2){
		this.sayi1=sayi1;
		this.sayi2=sayi2;
	}
	public void doYazdir(){
		System.out.println("1. sayý"+sayi1);
		System.out.println("2.sayý"+sayi2);
		
	}
	
	
}
public class ornek06_siniflar {

	public static void main(String[] args) {
		DortIslem4 dortIslem1=new DortIslem4();
		dortIslem1.setSayi(40, 58);
		dortIslem1.doYazdir();

	}

}
