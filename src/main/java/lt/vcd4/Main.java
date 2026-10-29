package lt.vcd4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws FileNotFoundException {

        Scanner sc = new Scanner(new File("duomenys2.txt"));

        int n = sc.nextInt();
        int previous = sc.nextInt();
        int count = 0;

        for (int i = 1; i < n; i++) {
            int current = sc.nextInt();

            if (current < previous) {
                count++;
            }

            previous = current;
        }

        System.out.println(count);

        sc.close();
    }
}
