package javaCalisma2;
class PrimitiveVeriTipleri{
	byte sayi;
	public void setSayi(byte sayi){
		this.sayi=sayi;
	}
	public byte getSayi(){
		return sayi;
	}
	}
public class ornek03_VeriTipleri {

	public static void main(String[] args) {
		PrimitiveVeriTipleri tip1=new PrimitiveVeriTipleri();
		tip1.setSayi((byte)50);
		System.out.println(tip1.getSayi());
	}

}
