package ArtikYil;

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int year, yearUp;

        System.out.print("Hesaplanacak yılı giriniz : ");
        year = sc.nextInt();

        if (year > 0) {
            if (year % 100 == 0) {

                yearUp = year % 400;

                if (yearUp == 0) {

                    System.out.println(year + " Bir artık yıldır !!!");

                } else {

                    System.out.println(year + " Bir artık yıl değildir !!!");

                }

            } else {

                yearUp = year % 4;

                if (yearUp == 0) {

                    System.out.println(year + " Bir artık yıldır !!!");

                } else {

                    System.out.println(year + " Bir artık yıl değildir !!!");

                }

            }
        } else {

            System.out.println("Hatalı giriş yaptınız lütfen Ctrl F5 basarak tekrar deneyiniz.");

        }
    }
}
