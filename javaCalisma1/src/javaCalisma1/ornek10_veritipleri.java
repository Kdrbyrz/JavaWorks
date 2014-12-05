package javaCalisma1;
class VeriTabaniSec{
	String veriTAbaniAdi;
	public void setVeriTabaniAdi(String veriTabaniAdi){
		this.veriTAbaniAdi=veriTabaniAdi;
	}
	public String getVeriTabaniAdi(){
		return veriTAbaniAdi;
	}
	public void doYazdir(){
		System.out.println("Veritabani: "+veriTAbaniAdi);
	}
}

public class ornek10_veritipleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VeriTabaniSec veriTabani1=new VeriTabaniSec();
		veriTabani1.setVeriTabaniAdi("Sql Server");
		veriTabani1.doYazdir();
		veriTabani1.setVeriTabaniAdi("Oracle");
		veriTabani1.doYazdir();
	}

}
