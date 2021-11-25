package Assignment;

import static java.lang.System.exit;

public class Emp {
    private int empId;
    private String empName;
    private String designation;
    private double basic;
    private double hra;

    public int getEmpId() {
        return empId;
    }

//    public void setEmpId(int empId) {
//        this.empId = empId;
//    }

    public String getEmpName() {
        return empName;
    }

//    public void setEmpName(String empName) {
//        this.empName = empName;
//    }

    public String getDesignation() {
        return designation;
    }

//    public void setDesignation(String designation) {
//        this.designation = designation;
//    }

    public double getBasic() {
        return basic;
    }

//    public void setBasic(double basic) {
//        this.basic = basic;
//    }

    public double getHra() {
        return hra;
    }

    public Emp(int empId, String empName, String designation, double basic) {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        if(basic < 500) {
            try {
                throw new LowSalaryException("Basic salary less than 500, exiting application!!!");
            } catch (LowSalaryException e) {
                System.out.println(e.getMessage());
                exit(1);
            }
        }
        else
        this.basic = basic;
    }
    void printDET()
    {
        System.out.println("---------------------");
        System.out.println("Employee details:");
        System.out.println("Employee Id: "+getEmpId());
        System.out.println("Employee Name: "+getEmpName());
        System.out.println("Employee Designation: "+getDesignation());
        System.out.println("Employee Basic Pay: "+getBasic());
        System.out.println("Employee HRA pay: "+getHra());
        System.out.println("---------------------");
    }
    void calculateHRA()
    {
        if(this.designation.equalsIgnoreCase("Manager"))
            hra = (this.basic * 10)/100;
        else if(this.designation.equalsIgnoreCase("Officer"))
            hra = (this.basic * 12)/100;
        else if(this.designation.equalsIgnoreCase("Clerk"))
            hra = (this.basic * 5)/100;

    }
}
