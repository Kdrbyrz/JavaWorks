package JavaCalisma4;

import java.util.Scanner;

class Mevsimler {
	byte ay;

	public void doKullaniciGirisi() {
		System.out.println("1.Ocak\n2.�ubat\n3.Mart\n4.Nisan\n5.May�s\n6.Haziran\n7.Temmuz");
		System.out.println("8.A�ustos\n9.Eyl�l\n10.Ekim\n11.Kas�m\n12.Aral�k");
		System.out.println("Ay Giriniz:");
		Scanner input = new Scanner(System.in);
		ay = input.nextByte();
	}

	public void doYazdir() {
		switch (ay) {
		case 1:
		case 12:
		case 2:
			System.out.println("K��");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("�lkbahar");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("Yaz");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("Sonbahar");
			break;
		default:
			System.out.println("Ge�ersiz Giri� Yap�ld�");
			break;
		}
	}
}

public class ornek02_KontrolIfadeleri {

	public static void main(String[] args) {
		Mevsimler mevsim1 = new Mevsimler();
		mevsim1.doKullaniciGirisi();
		mevsim1.doYazdir();
	}

}
