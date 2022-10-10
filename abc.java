/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Gesa Rizky Nugraha
 */
public class abc {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println(" ********************************* ");
        System.out.println(" *Masukkan Nilai a* ");
        System.out.println(" ********************************* ");

        double a = sc.nextInt();

        System.out.println(" ******************************* ");
        System.out.println(" *Masukkan Nilai b* ");
        System.out.println(" ******************************* ");

        double b = sc.nextInt();

        System.out.println(" ************************* ");
        System.out.println(" *Masukkan Nilai c* ");
        System.out.println(" ************************* ");

        double c = sc.nextInt();

        double z = Math.sqrt((b * b) - (4 * a * c));
        double x1 = (-b + z) / (2 * a);
        double x2 = (-b - z) / (2 * a);

        System.out.println(" ******************************* ");
        System.out.println(" *Maka X1 = " + x1);
        System.out.println(" *Maka X2 = " + x2);
        System.out.println(" ******************************* ");
    }
}
