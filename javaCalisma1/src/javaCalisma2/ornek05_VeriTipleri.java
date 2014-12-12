package javaCalisma2;
class PrimitiveVeriTipleri2{
	short sayi;

	public short getSayi() {
		return sayi;
	}

	public void setSayi(short sayi) {
		this.sayi = sayi;
	}
}
public class ornek05_VeriTipleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimitiveVeriTipleri2 tip1=new PrimitiveVeriTipleri2();
		tip1.setSayi((short)50);
		System.out.println("short tipindeki sayi: "+tip1.getSayi());
	}

}
