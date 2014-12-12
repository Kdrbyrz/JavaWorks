package javaCalisma2;
class PrimitiveVeriTipleri3{
	int sayi;

	public int getSayi() {
		return sayi;
	}

	public void setSayi(int sayi) {
		this.sayi = sayi;
	}
}
public class ornek07_VeriTipleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimitiveVeriTipleri3 tip1=new PrimitiveVeriTipleri3();
		tip1.setSayi(1453);
		System.out.println("Integer tipindeki sayi: "+tip1.getSayi());
	}

}
