package javaCalisma3;
class Sifre{
	public void doGiris(){
		int denemeSayisi=1;
		do{System.out.println(denemeSayisi+". deneme"); denemeSayisi++;
		}while(denemeSayisi<=4);
	}
}
public class ornek07_Donguler {

	public static void main(String[] args) {
		Sifre sifre1=new Sifre();
		sifre1.doGiris();
	}

}
