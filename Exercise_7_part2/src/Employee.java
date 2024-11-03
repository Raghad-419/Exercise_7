public class Employee {
private String id ;
private String name ;
private double salary;

public Employee(String id ,String name,double salary){
    this.id=id;
    this.name=name;
    this.salary=salary;

}

public String getId(){
    return id;
}
public String getName(){
    return name;
}
public double getSalary(){
    return salary;
}
public void setId(String id){
    this.id=id;
}
public void setName(String name){
    this.name=name;
}
public void setSalary(int salary){
    this.salary=salary;
}


public double getAnnualSalary(){
    return salary*12;
}

public double raisedSalary(double percent){
    salary=salary*(1+ (percent/100));
    System.out.println("Raised Salary completed successfully");
    return salary;
}

public String toString(){
    return "*******************\n"+"Employee name: "+this.name+"\nID: "+this.id+"\nEmployee salary: "+this.salary +"\n******************";
}

}
