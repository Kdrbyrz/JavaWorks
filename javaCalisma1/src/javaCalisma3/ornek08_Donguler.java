package javaCalisma3;
import java.io.IOException;
class Menu{
	char secenek;
	public void anaMenu() throws IOException{
		do{
			System.out.println("1- Havale i�lemleri");
			System.out.println("2- Gsm tl i�lemleri");
			System.out.println("3- �ifre i�lemleri");
			System.out.println("��lem Se�iniz");
			secenek=(char)System.in.read();
		}while(secenek <'1'||secenek>'3');
	}
}
public class ornek08_Donguler {

	public static void main(String[] args) throws IOException {
		Menu menu1=new Menu();
		menu1.anaMenu();
	}

}
