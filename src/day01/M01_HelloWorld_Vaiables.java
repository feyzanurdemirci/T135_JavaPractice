package day01;

public class M01_HelloWorld_Vaiables {
    public static void main(String[] args) {


        System.out.println( "Hello World"); // Hello World
        System.out.println( "Merhaba Java" ); // Merhaba Java
        System.out.print( "Merhaba Aynı Satır " );// print komutu ise bir sornaki kodu aynı satırdan devam ettirerel çalışır
        System.out.println( "Merhaba!" );// println yazılırsa bir sonraki satırdaki kodu bir alt satıra gecerek yazdırır
        System.out.println( "Tekrar Merhaba " );
       // System.err.println( "Ben Dünyalı" );
        System.out.println( "-------------------------------------------------------------------------------------------------------" );
        String isim= "Murat ";
        System.out.println( isim ); //Murat
        System.out.println("isiminiz: " + isim); // isminiz: Murat
        System.out.println( "-------------------------------------------------------------------------------------------------------" );


        int sayı=3;
      //  sayı =128;

        System.out.println( "sayı" );// sayı
        System.out.println(3);// 3 sonucunu verir fakat dinamik olarak çalımaz. degişken degişirse bile 3 yazdırır
        System.out.println(sayı);// 3 sonucunu verir degişken degişirse yeni atanan degeri verir

        /*
        java kodu çalıştırırken yukarıdan aşşağı doğru okur ve çalıştırır
        aynı satırda ise soldan sağa dogru calıştırır
        bu nedenle en son atanmış deger en son yazdırılır
        
         */

        int sayı2= 30;

        System.out.println(sayı2+sayı2);//60
        System.out.println( 40+40 );// 80
        System.out.println("40"+"30");//4030
        System.out.println(sayı2+""+sayı2);//3030


        /*
        Konsolda tek satırda kod yazarak

        Hello World
        "Hello World"


         */

        System.out.println("Hello world");
        System.out.println("\"Hello World \"");// bir metnin başına çift tırnak koymak için başına \" yazılır.

        /*
         Konsolda Hello World     "Hello World" yazdırın (arada 2 tab tuşu mesafe olacak )

         */

        System.out.print("Hello World\t\t\"Hello World\"");// TAB tuşu kadar boşluk bırakmak için \t yazılmalııdır

        // konsolda \Hello World\ yazdırın

        System.out.println( "\\Hello World\\" );










    }
}
