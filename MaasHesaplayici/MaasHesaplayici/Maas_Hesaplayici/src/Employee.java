public class Employee {

    public static void main(String[] args){
        Employee employee = new Employee("Muhammet Ali Karaguzel",5500,40,2009);

        employee.name(employee.name);
        employee.tax(employee.salary);
        employee.bonus(employee.workHours, employee.salary);
        employee.raiseSalary(employee.hireYear, employee.salary);
        employee.toString();

        // Eğer kişi bilgilerini değiştirmek istersek bu şekilde yapabiliriz.
        //employee1.setName("Mehmet");
        //employee1.setSalary(7000);
        //employee1.setWorkHours(60);
        //employee1.setHireYear(2011);
    }
    private String name;
    private int salary;
    private int workHours;
    private int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }

    public void name(String name){
        System.out.println("Ad:" + name);
    }

    public void tax(int salary) {
        int tax;
        int totalSalary;
        if(salary<1000){
            System.out.printf("Maasiniza vergi uygulanmayacaktir.");
        }if(salary>1000){
            tax = (salary*3)/100;
            totalSalary = salary - tax;
            System.out.println("Maasiniza uygulanacak vergi: " +tax);
            System.out.println("Vergi uygulandiktan sonra maasiniz:" + totalSalary);
        }
        return;
    }



    public static void bonus(int workHours, int totalSalary) {
        int totalBonus;
        if(workHours<40){
            System.out.println("Malesef bonus kazanacak kadar calismadiniz");
        }if(workHours>40){
            totalBonus = (workHours-40)*30;
            totalSalary = totalBonus+totalSalary;
            System.out.println(totalBonus+ " tl bonus kazandınız.");
            System.out.println("Toplam maaşınız:" + totalSalary);
        }
        return;
    }

    public static void raiseSalary(int hireYear,int totalSalary) {
        if (2021 - hireYear < 10) {
            totalSalary = totalSalary+ (totalSalary*5)/100;
            System.out.println("Zam uygulanmış son maasiniz: " + totalSalary);
        }else if(2021 - hireYear > 9 && 2021-hireYear <20){
            totalSalary = totalSalary + (totalSalary*10)/100;
            System.out.println("Zam uygulanmis son maasiniz: " + totalSalary);
        }else if( 2021 - hireYear > 19){
            totalSalary= totalSalary + (totalSalary*15)/100;
            System.out.println("Zam uygulanmış son maasiniz: " + totalSalary);
        }
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
}
