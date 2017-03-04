
import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class VizeFinal {

    public static void main(String[] args) {

   
        try {

      
            Scanner s = new Scanner(new File("notlar.txt"));
            
            PrintWriter yaz = new PrintWriter("sonuclar.txt");

            String ad, soyad;
            int vize, Final;
            while (s.hasNext()) {
                ad = s.next();
                soyad = s.next();
                vize = Integer.parseInt(s.next());
                Final = Integer.parseInt(s.next());
                double notu = (vize * 0.4 + Final * 0.6);
                if (notu > 50) {
                    yaz.println(ad + " " + soyad + " ," + "Vize = "+vize + ", " +"Final = "+ Final + " ," + "ortalama = "+notu + " <Geçti>");
                } else {
                    yaz.println(ad + " " + soyad + " ," + "Vize = "+vize + ", " +"Final = "+ Final + " ," + "ortalama = "+notu + " <Kaldı>");
                }
            }
            s.close();

            yaz.close();
        } catch (IOException ex) {
            System.out.println("hata");
        }

    }
}