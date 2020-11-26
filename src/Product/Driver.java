/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author khusn
 */
public class Driver {
    public static void main(String[] args) {
        String choosing;
        Scanner input = new Scanner(System.in);
        System.out.println("----------------PILIH EKSEKUSI DATA WORKER----------------");
        System.out.println("A. List Data");
        System.out.println("B. Tambah Data");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Tentukan Pilihanmu : ");
        choosing = input.next();
        if(choosing.equals("A")) {
            //Set Worker 1
            Worker worker1 = new Worker("Maskulin", "423-G", "10/10/20");
            worker1.setShift(1);
            worker1.setHourlyPay(25.63);

            //Set Worker 2
            Worker worker2 = new Worker("Mbakulin", "322-B", "2/11/20");
            worker2.setShift(2);
            worker2.setHourlyPay(26.12);

            //Display Worker 1
            System.out.println("Name :" + worker1.getName());
            System.out.println("Number :" + worker1.getNumber());
            System.out.println("Hired :" + worker1.getHireDate());
            System.out.println("Shift :" + worker1.getShift());
            System.out.printf("HourlyPay : $%.2f\n\n", worker1.getHourlyPay());

            //Display Worker 2
            System.out.println("Name :" + worker2.getName());
            System.out.println("Number :" + worker2.getNumber());
            System.out.println("Hired :" + worker2.getHireDate());
            System.out.println("Shift :" + worker2.getShift());
            System.out.printf("HourlyPay : $%.2f\n\n", worker1.getHourlyPay());   
        } else if(choosing.equals("B")) {
            String nama, number, hired;
            int shift;
            double hourlyPay;
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
            System.out.println("----------------- FORM TAMBAH WORKER -----------------");
            System.out.println("Masukkan nama : ");
            nama = input.next();
            System.out.println("Masukkan nomor : ");
            number = input.next();
            System.out.println("------- PILIH SHIFT -------");
            System.out.println("1. Pagi");
            System.out.println("2. Malam");
            System.out.println("Pilih salah satu : ");
            shift = input.nextInt();
            System.out.println("Masukkan upah perjam ($) : ");
            hourlyPay = input.nextDouble();
            
            Worker worker3 = new Worker(nama, number, formatter.format(date));
            worker3.setShift(shift);
            worker3.setHourlyPay(hourlyPay);
            
            //Display Worker 2
            System.out.println("Name :" + worker3.getName());
            System.out.println("Number :" + worker3.getNumber());
            System.out.println("Hired :" + worker3.getHireDate());
            System.out.println("Shift :" + worker3.getShift());
            System.out.printf("HourlyPay : $%.2f\n\n", worker3.getHourlyPay());
        }
    }
}
