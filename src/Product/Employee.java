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
public class Employee {
    private String name;
    private String number;
    private String hireDate;
    
    // Ini Constructor
    public Employee(String name, String number, String hireDate) {
        this.name = name;
        this.number = number;
        this.hireDate = hireDate;
    }
    
    // Ini Gtters dan Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getHireDate() {
        return hireDate;
    }
    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}
