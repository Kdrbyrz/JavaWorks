package javaCalisma2;

import java.util.Scanner;

//kullanýcýdan 2 sayý al
//sayýlarýn get set metorlarýný oluþtur
//sayýlarýn 4  iþlem metotlarýný oluþtur
//yazdýr metodu ile ekrana yazdýr
class dortIslem{
	public int s1,s2;
	public int sonuc;
	public int topla(int s1, int s2)
	{
		sonuc=s1+s2;
		return sonuc;
	}
	public int cikar(int s1 ,int s2){
		
		sonuc=s1-s2;
		return sonuc;
	}
	public int bol(int s1 ,int s2){
		
		sonuc=s1/s2;
		return sonuc;
	}
	public int carp(int s1 ,int s2){
		
		sonuc=s1*s2;
		return sonuc;
	}
	public void getSonuc(){
		System.out.println("Ýþleminizin sonucu : "+sonuc);
	}
	
	
}
public class ornek01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);		
		dortIslem islem=new dortIslem();
		
		System.out.println("Sayý 1 i gir");
		int s1=input.nextInt();
		System.out.println("Sayý 2 yi gir");
		int s2=input.nextInt();
		System.out.println("islem giriniz\ntoplama için:1\nçýkarma için :2\nbölme için:3\njçarpma için:4");
		int girdi=input.nextInt();
		if (girdi==1){islem.topla(s1, s2); islem.getSonuc();}
		else if(girdi==2){islem.cikar(s1, s2); islem.getSonuc();}
		else if(girdi==3){islem.bol(s1, s2); islem.getSonuc();}
		else if(girdi==4){islem.carp(s1, s2); islem.getSonuc();}
		else {System.out.println("geçerli iþlem girilmedi");}
	}

}
