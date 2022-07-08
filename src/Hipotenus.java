import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Üçgenin kenar uzunluklarını giriniz.");

        System.out.println("Yükseklik: ");
        int h= input.nextInt();

        System.out.println("Taban: ");
        int taban= input.nextInt();
        int hipo2= (h*h)+(taban*taban);
        double hipo=Math.sqrt(hipo2);

        System.out.println("Hipotenüs: " +Math.sqrt(hipo2));

        double cevre= h+taban+hipo;
        System.out.println("Üçgenin çevre uzunluğu:"+cevre);
        double alan=(h*taban)/2;
        System.out.println("Alan: 3"+alan);





    }
}
