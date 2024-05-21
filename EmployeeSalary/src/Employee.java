public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;
    int yearNow = 2021;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        double taxFee=0;
        if(this.salary < 1000){
            return taxFee;
        }
        else{
            taxFee = this.salary * 0.03;
            return taxFee;
        }
    }

    public double bonus(){
        double bonus=0;
        int bonusTime=0;
        if (this.workHours > 40){
            bonusTime = this.workHours - 40;
            bonus = 30 * bonusTime;
        }
        return bonus;
    }

    public double raiseSalary(){
        int workingYear = this.yearNow - this.hireYear;
        double raisedSalary = 0;
        if (workingYear < 10 ){
            raisedSalary = this.salary * 0.05;
        } else if (workingYear > 9 && workingYear < 20) {
            raisedSalary = this.salary * 0.10;
        }else {
            raisedSalary = this.salary * 0.15;
        }
        return raisedSalary;
    }

    public double totalPrice(){
        salary = salary - tax() + bonus() + raiseSalary();
        return salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "Name=" + name +
                ", Working Hours='" + workHours + '\'' +
                ", Hire Year=" + hireYear +
                ", Tax Fee=" + tax() +
                ", Bonus =" + bonus() +
                ", Raise Salary=" + raiseSalary() +
                ", Total Price=" + totalPrice() +
                '}';
    }
}
