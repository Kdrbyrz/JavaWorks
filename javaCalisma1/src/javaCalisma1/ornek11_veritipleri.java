package javaCalisma1;

import java.util.Scanner;



class Cinsiyet{
	String cinsiyet;
	public void setCinsiyet(String cinsiyet){
		this.cinsiyet=cinsiyet;
	}
	public String getCinsiyet(){
		return cinsiyet;
	}
	public void doYazdir(){
		System.out.println("Cinsiyet "+cinsiyet);
	}
}
public class ornek11_veritipleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cinsiyet cinsiyet1=new Cinsiyet();
		cinsiyet1.setCinsiyet("Diðer");
		cinsiyet1.doYazdir();
		System.out.println("Cinsiyet Giriniz");
		Cinsiyet cinsiyet2= new Cinsiyet();
		Scanner input=new Scanner(System.in);
		String cinsiyet=input.next();
		cinsiyet2.setCinsiyet(cinsiyet);
		cinsiyet2.doYazdir();
		
	}

}
