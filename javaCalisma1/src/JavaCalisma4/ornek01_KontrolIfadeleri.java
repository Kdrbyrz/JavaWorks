package JavaCalisma4;

import java.util.Scanner;

class HaftaninGunleri {
	byte gun;

	public void doKullaniciGirisi() {
		System.out.println("1. PAzartesi\n2. Salý\n3.Çarþamba");
		System.out.println("4.Perþembe\n5.Cuma");
		System.out.println("6.Cumartesi\n7.Pazar");
		System.out.println("Günü Giriniz=");
		Scanner input = new Scanner(System.in);
		gun = input.nextByte();
	}

	public void doYazdir() {
		switch (gun) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Salý");
			break;
		case 3:
			System.out.println("Çarþamba");
			break;
		case 4:
			System.out.println("Perþembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
		default:
			System.out.println("GEçersiz Gün Girildi");
			doKullaniciGirisi();
			doYazdir();
			break;
		}
	
	}
}

public class ornek01_KontrolIfadeleri {

	public static void main(String[] args) {
		HaftaninGunleri gunler1=new HaftaninGunleri();
		gunler1.doKullaniciGirisi();
		gunler1.doYazdir();
	}

}
