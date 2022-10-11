package com.kainos.ea.model;

public class Employee {
    public Employee(short number, String forename, String surname, int salary, int bankAccountNumber,
                    String sortcode, String NIN, String employeeTelNo, String employeeEmail) {
        this.EmployeeID = number;
        this.forename = forename;
        this.surname = surname;
        this.salary = salary;
        this.bankAccountNumber = bankAccountNumber;
        this.sortCode = sortcode;
        this.NIN = NIN;
        this.employeeTelNo = employeeTelNo;
        this.employeeEmail = employeeEmail;
    }

public Employee(short number,String forename, String surname){
        this.EmployeeID = number;
        this.forename = forename;
        this.surname = surname;
}

    private short EmployeeID; //aka. number
    private String forename;
    private String surname;
    private int salary;
    private int bankAccountNumber;
    private String sortCode;
    private String NIN;
    private String employeeTelNo;
    private String employeeEmail;
    private static int MIN_SALARY = 7_000_00;

    public static int getMinSalary() {
        return MIN_SALARY;
    }

    public static void setMinSalary(int minSalary) {
        MIN_SALARY = minSalary;
    }

    public short getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(short EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public String getNIN() {
        return NIN;
    }

    public void setNIN(String NIN) {
        this.NIN = NIN;
    }

    public String getEmployeeTelNo() {
        return employeeTelNo;
    }

    public void setEmployeeTelNo(String employeeTelNo) {
        this.employeeTelNo = employeeTelNo;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    //CONSTRUCTORS
//    public Employee(String name) {
//      this.name = name;
//    }
//    public Employee (short thisNumber) {
//        setNumber(String.valueOf(thisNumber));
//    }
//
//    public Employee (short thisNumber, int newSalary) {
//        this(thisNumber);     //good
//        setSalary(newSalary);
//    }
//
//    public Employee(short thisNumber,int newSalary, String thisName ) {
//       this(thisNumber);
//       setSalary(newSalary);
//       setName(thisName);
//   }
//
//    public Employee() {
//
//    }
//
//    //number
//    public short getNumber() {
//        return number;
//    }
//
//    public boolean setNumber(String thisNumber) {
//        try{
//            short s = Short.parseShort(thisNumber);
//            return setNumber(s);
//        } catch(NumberFormatException e){
//            throw new BadNumber(e.getMessage());
//        }
//    }
//
//    private boolean setNumber(short s) {
//        return true;
//    }
//
//    //salary
//
//    public int getSalary(){
//       return salary;
//    }
//
//    public int calcPay() {
//        return getSalary() /12;
//    }
//
//    public void setSalary(int salary) {
//        if(salary >= MIN_SALARY) {
//            this.salary = salary;
//        } else {
//            throw new SalaryTooLowException(
//                    String.format("Salary £%,.2f is below the minimum salary £%,.2f.",
//                            salary/100.0, MIN_SALARY/100.0));
//        }
//    }
//
//
//
//
//
//
//
//    //name
//    public String getName(){
//       return name;
//    }
//
//    public boolean setName(String thisName)
//    {
//       if (!thisName.isEmpty()) {
//           name = thisName;
//           return true;
//       }
//       else {
//           return false;
//       }
//
//    }
//
//    @Override
//    public boolean equals(Object o){
//       Employee employee = (Employee) o;
//       return number == employee.number && getSalary() == employee.getSalary() && Objects.equals(name, employee.name);
//    }
//
//    @Override
//    public String toString(){
//       return "my employee is called "  + name;
//    }
//
//
//    @Override
//    public int compareTo(Employee o) {
//        return Float.compare(this.getSalary(), o.getSalary());
//
//    }



}
