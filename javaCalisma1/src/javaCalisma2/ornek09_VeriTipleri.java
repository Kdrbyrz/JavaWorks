package javaCalisma2;
class PrimitiveVeriTipleri4{
	long sayi=1453L;

	public long getSayi() {
		return sayi;
	}

	public void setSayi(long sayi) {
		this.sayi = sayi;
	}
}
public class ornek09_VeriTipleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimitiveVeriTipleri4 tip1=new PrimitiveVeriTipleri4();
		tip1.setSayi(1453L);
		System.out.println("Long tipindeki sayýnýn deðeri: "+tip1.getSayi());
	}

}
