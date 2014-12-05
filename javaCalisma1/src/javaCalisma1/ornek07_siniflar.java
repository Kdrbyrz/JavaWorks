package javaCalisma1;
class DortIslem5{
	int sayi;
	public void setSayi(int sayi){
		this.sayi=sayi;
	}
	public int getSayi(){
		return sayi;
	}
}
public class ornek07_siniflar {

	public static void main(String[] args) {
		DortIslem5 dortIslem1=new DortIslem5();
		dortIslem1.setSayi(58);
		System.out.println("girdiðiniz sayi"+dortIslem1.getSayi());
	}

}
