package sesi4;

public class Main {
    public static void main(String[] args){
//        Car car1 = new Car();
//        car1.color = "Red";
//        System.out.println(car1.color);

          Employee employee1 = new Employee("Kelly", 5000000, "Fulltime", "QA Intern", true);
          employee1.setName("Kelly");
          employee1.setActive(true);
          employee1.setType("FullTime");
          employee1.setRole("QA Intern");
          employee1.setSalary(10000000);

          System.out.println(employee1.getName());
          System.out.println(employee1.isActive());
          System.out.println(employee1.getType());
          System.out.println(employee1.getRole());
          System.out.println(employee1.getSalary());

    }
}
