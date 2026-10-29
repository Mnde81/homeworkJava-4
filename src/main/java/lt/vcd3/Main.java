package lt.vcd3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws FileNotFoundException {
        Scanner in= new Scanner(System.in);
        System.out.print("Iveskite failo pavadinima: ");
        String failas=in.next();


        Scanner fIn= new Scanner(new File(failas));

        boolean neraNeigimau=true;
        int neigiamosTemp = 0;
        while (fIn.hasNextInt()) {
            int temp=fIn.nextInt();
            if (temp<0) {
                neraNeigimau=false;
                neigiamosTemp++;

            }

        }

        if (neraNeigimau) {
            System.out.print("No negative temperatures recorded");
        }else{
            System.out.print("There were " + neigiamosTemp + " days with negative temperatures recorded");
        }



    }
}
