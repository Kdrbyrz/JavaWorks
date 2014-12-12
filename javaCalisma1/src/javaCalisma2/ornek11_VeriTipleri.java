package javaCalisma2;
class PrimitiveVeriTipleri5{
	float sayi;

	public float getSayi() {
		return sayi;
	}

	public void setSayi(float sayi) {
		this.sayi = sayi;
	}
	
}
public class ornek11_VeriTipleri {

	public static void main(String[] args) {
		PrimitiveVeriTipleri5 tip1=new PrimitiveVeriTipleri5();
		tip1.setSayi(1453.1907F);
		System.out.println("Float tipindeki sayi deðeri: "+tip1.getSayi());
	}

}
