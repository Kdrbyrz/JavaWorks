package javaCalisma2;
class Cinsiyet{
	boolean cinsiyet;

	public boolean isCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(boolean cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
}
public class ornek15_VeriTipleri {

	public static void main(String[] args) {
		Cinsiyet cinsiyet=new Cinsiyet();
		cinsiyet.setCinsiyet(true);
		System.out.println("Cinsiyet : "+cinsiyet.isCinsiyet());

	}

}
