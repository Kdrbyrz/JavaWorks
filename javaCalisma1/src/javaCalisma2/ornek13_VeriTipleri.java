package javaCalisma2;
class PrimitiveVeriTipleri6{
	double sayi;

	public double getSayi() {
		return sayi;
	}

	public void setSayi(double sayi) {
		this.sayi = sayi;
	}
}
public class ornek13_VeriTipleri {

	public static void main(String[] args) {
		PrimitiveVeriTipleri6 tip1=new PrimitiveVeriTipleri6();
		tip1.setSayi(1907.1453);
		System.out.println("Double tipindeki sayýnýn deðeri: "+tip1.getSayi());

	}

}
