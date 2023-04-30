import java.util.Scanner;
public class Main {
    static void top(){
       Scanner inp=new Scanner(System.in);
       int n, toplam=0;
       int i=1;
        System.out.println("Sayı giriniz:");
       while(true){
           System.out.print(i+".ci sayı: ");
           n=inp.nextInt();
           toplam+=n;
           if (n==0) break;

       }
        System.out.println(toplam);
    }

    static void fark(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int adet = inp.nextInt();
        int n , sonuc = 0;
        int i=1;
        while (i<=adet){
            System.out.print(i+". sayı:");
            n=inp.nextInt();
            if(i==1) {
                sonuc+=n;
                i++;
                continue;
            }
            sonuc-=n;
            i++;
        }
        System.out.println("Çıkarma sonucu: "+sonuc);



    }
    static void carp(){

        Scanner inp=new Scanner(System.in);
        int i=1;
        int sonuc=1,sayi;
        while(true){
            System.out.print(i++ +". sayı:");
            sayi=inp.nextInt();
            if(sayi==1) {
                break;
            }
            if(sayi==0) {
                sonuc=0;
                break;
            }
            sonuc*=sayi;
    }
        System.out.println("Sayıların Çarpımı:"+sonuc);
        }
        static void bolme(){
            Scanner inp = new Scanner(System.in);
            System.out.print("Kaç adet sayı gireceksiniz :");
            int adet = inp.nextInt();
            double sayi, sonuc = 0.0;
            for(int i=1;i<=adet;i++){
                System.out.print(i+". sayıyı giriniz: ");
                sayi=inp.nextDouble();
                if(sayi==0 && i!=1){
                    System.out.println("Bölen 0 olamaz.");
                    continue;
                }
                if(i==1){
                    sonuc=sayi;
                    continue;
                }
                sonuc/=sayi;

            }
            System.out.println("Bölme Sonucu: "+sonuc);

        }
        static void usAlma(){
            int sonuc=1;
            Scanner inp= new Scanner(System.in);
            System.out.println("Tabanı giriniz: ");
            int taban=inp.nextInt();
            System.out.println("Üssü  giriniz: ");
            int us=inp.nextInt();
            for (int i=1; i<=us;i++){
                sonuc*=taban;
            }
            System.out.println("Sonuç: "+sonuc);
        }
        static void fak(){
            int sonuc=1;
            Scanner inp= new Scanner(System.in);
            System.out.println("Sayıyı giriniz: ");
            int sayi= inp.nextInt();
            for(int i=1;i<=sayi;i++){
                sonuc*=i;
            }
            System.out.println("Sonuç: "+sonuc);
        }
        static void mod(){
            int s1,s2,sonuc;
            Scanner inp= new Scanner(System.in);
            System.out.println("Modu alınacak sayıyı giriniz: ");
            s1= inp.nextInt();
            System.out.println("Diğer sayıyı giriniz: ");
            s2= inp.nextInt();
            sonuc=s1%s2;
            System.out.println(s1+"%"+s2+"="+sonuc);



        }
        static void dAlanCevre(){
        int cevre,alan;
            Scanner inp=new Scanner(System.in);
            System.out.println("Kısa kenarı giriniz: ");
            int k= inp.nextInt();
            System.out.println("Uzun kenarı giriniz: ");
            int u= inp.nextInt();
            cevre=2*(k+u);
            alan=k*u;
            System.out.println("Çevresi: "+cevre+" Alanı: "+alan);


        }




    public static void main(String[] args) {
        int select;

        String menu= "1. Toplama işlemi\n2. Çıkarma İşlemi\n3. Çarpma İşlemi\n4. Bölme İşlemi\n5. Üslü Sayı Hesaplama\n6. Faktoriyel Hesaplama\n7. Mod Alma\n8. Dikdörtgen Alan ve Çevre Hesabı\n0. Çıkış Yap ";
        System.out.println(menu);
        do{
           Scanner inp= new Scanner(System.in);
           System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
           select=inp.nextInt();

           switch (select){
               case 1:
                  top(); break;
               case 2:
                   fark(); break;
               case 3:
                   carp(); break;
               case 4:
                   bolme(); break;
               case 5:
                   usAlma(); break;
               case 6:
                   fak(); break;
               case 7:
                   mod(); break;
               case 8:
                   dAlanCevre(); break;
               default:
                   System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
           }

       }while(select!=0);
    }
}