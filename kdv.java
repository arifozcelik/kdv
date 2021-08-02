import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.println("ücreti giriniz: ");
        tutar = input.nextDouble();
        double kdvTutar = tutar * kdvOran;
        double kdvTutarli = tutar + kdvTutar;

        System.out.println("KDV'siz tutar " + tutar);
        System.out.println("KDV oranı : " + kdvOran);
        System.out.println("KDV Tutar :" + kdvTutar);
        System.out.println("KDV'li tutar :" + kdvTutarli);

    }
}
