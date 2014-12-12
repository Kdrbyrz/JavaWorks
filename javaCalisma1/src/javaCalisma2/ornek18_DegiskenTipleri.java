package javaCalisma2;
class YerelDegiskenler{
	public void topla(){
		int a=5;
		a+=10;
		System.out.println("a= "+a);
	}
	public void topla2(){
		int a=0;
		a+=10;
		System.out.println("a="+a);
	}
}
public class ornek18_DegiskenTipleri {

	public static void main(String[] args) {
		YerelDegiskenler degisken1=new YerelDegiskenler();
		degisken1.topla();
		degisken1.topla2();
	}

}
