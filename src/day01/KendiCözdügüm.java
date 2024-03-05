package day01;

import java.util.Scanner;

public class KendiCözdügüm {

    public static void main(String[] args) {

        // kullanıcıdan ismini , soyismini, ve yaşını alıp
        //  aşagıdaki formatta yazdırın
        // girilen bilgiler : j doe , 44

        Scanner scanner = new Scanner(System.in);
        System.out.println(  "lütfen ismiizi giriniz " );

        char isminİlkHarf= scanner.nextLine().charAt(0);

        System.out.println( "lütfen soy isminizi giriniz " );

        String soyİsim= scanner.nextLine();

        System.out.println( "lütfen yaşınızı giriniz " );

        int yaş= scanner.nextInt();

        System.out.println( "girilen bilgiler: " +isminİlkHarf+" \n" +
                " \n" +
                ""+soyİsim+"\n" +
                " , "+yaş);




    }
}
