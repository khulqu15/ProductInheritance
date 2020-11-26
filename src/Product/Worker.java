/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

/**
 *
 * @author khusn
 */
public class Worker extends Employee {
    private int shift;
    private double hourlyPay;
    
    // Ini Constructor
    public Worker(String name, String number, String hireDate) {
        super(name, number, hireDate);
    }
    
    // Ini Getters dan Setters
    public String getShift() {
        if(shift == 1) {
            return "Day";
        } else if(shift == 2) {
            return "Night";
        } else {
            return "Invalid Shift";
        }
    }
    public void setShift(int shift) {
        this.shift = shift;
    }
    public double getHourlyPay() {
        return hourlyPay;
    }
    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }
}
