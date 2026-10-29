package lt.vcd2;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        System.out.println("Ivesk skaicius, pabaiga skaicius 0");

        Scanner in =new Scanner(System.in);

        int i =0;
        int sk;
        int lyginiai=-1;
        int nelyginiai=0;

        do{
            i++;
            System.out.print(i+ ": ");
            sk=in.nextInt();

            if (sk % 2 == 0) lyginiai++;
            if (sk % 2 != 0) nelyginiai++;

        } while(sk!=0);

        System.out.println("Lyginiu skaicius: " +lyginiai);
        System.out.println("Nelyginiu skaicius: " +nelyginiai);

    }
}
