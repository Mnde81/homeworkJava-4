package lt.vcd1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner in =new Scanner(System.in);

        System.out.print("Iveskite kiek euru kainuoja kompiuteris: ");
        int p = in.nextInt();

        System.out.print("Iveskite kiek studentas turi susitaupes pinigu kompiuteriui: ");
        int s = in.nextInt();

        System.out.print("Iveskite kiek euru studentas sutaupys papildomai kas savaite: ");
        int m = in.nextInt();



        int santaupos =s;
        int k=0;

        while ( santaupos <= p){
            santaupos=santaupos+m;
            k++;
        }

        System.out.println("Studentas tures pakankamai pinigu kompiuteriui po: " + k);





    }
}
