package javaCalisma2;

import java.util.Scanner;

//kullan�c�dan 2 say� al
//say�lar�n get set metorlar�n� olu�tur
//say�lar�n 4  i�lem metotlar�n� olu�tur
//yazd�r metodu ile ekrana yazd�r
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
		System.out.println("��leminizin sonucu : "+sonuc);
	}
	
	
}
public class ornek01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);		
		dortIslem islem=new dortIslem();
		
		System.out.println("Say� 1 i gir");
		int s1=input.nextInt();
		System.out.println("Say� 2 yi gir");
		int s2=input.nextInt();
		System.out.println("islem giriniz\ntoplama i�in:1\n��karma i�in :2\nb�lme i�in:3\nj�arpma i�in:4");
		int girdi=input.nextInt();
		if (girdi==1){islem.topla(s1, s2); islem.getSonuc();}
		else if(girdi==2){islem.cikar(s1, s2); islem.getSonuc();}
		else if(girdi==3){islem.bol(s1, s2); islem.getSonuc();}
		else if(girdi==4){islem.carp(s1, s2); islem.getSonuc();}
		else {System.out.println("ge�erli i�lem girilmedi");}
	}

}
