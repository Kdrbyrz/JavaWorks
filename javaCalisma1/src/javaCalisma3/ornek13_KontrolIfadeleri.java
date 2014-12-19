package javaCalisma3;
class HavaDurumu{
	int sicaklik;

	public int getSicaklik() {
		return sicaklik;
	}

	public void setSicaklik(int sicaklik) {
		this.sicaklik = sicaklik;
	}
	public void doMesaj(){
		if(getSicaklik()>35) System.out.println("Çok sýcak dikkak et");
		else if(getSicaklik()<0) System.out.println("Çok soðuk");
		else System.out.println("Hava normal");
	}
}
public class ornek13_KontrolIfadeleri {

	public static void main(String[] args) {
		HavaDurumu hava1=new HavaDurumu();
		hava1.setSicaklik(36);
		hava1.doMesaj();
		
		hava1.setSicaklik(-5);
		hava1.doMesaj();
		
		hava1.setSicaklik(4);
		hava1.doMesaj();
	}

}
