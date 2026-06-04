
class Person{
    String gender;
    int salary;
    int age;
}

class Loan{
    public boolean verify(Person p){
        if(p.gender=="Male"){
            if(p.age>=23 && p.age<=60 && p.salary>=30000){
                return true;
            }
        } else if(p.gender=="Female"){
            if(p.age>=21 && p.age<=62 && p.salary>=25000){
                return true;
            }
        } else{
            if(p.age>=22 && p.age<=60 && p.salary>=27000){
                return true;
            }
        }

        return false;
    }
}

public class LoanCriteriaTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.gender = "Female";
        p.age = 21;
        p.salary = 21000;

        Loan loanDepartment = new Loan();
        boolean isValid = loanDepartment.verify(p);

        System.out.println(isValid);
    }
}
