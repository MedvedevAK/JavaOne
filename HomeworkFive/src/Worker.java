import java.text.MessageFormat;

public class Worker {
   private String name;
   private String fullName;
   private String position;
   private String email;
   private String phone;
   private int salary;
   private int age;
   public Worker(String fullName, String position, String email, String phone, int salary, int age) {
      this.fullName = fullName;
      this.position = position;
      this.email = email;
      this.phone = phone;
      this.salary = salary;
      this.age = age;
   }
   public String workerInfo() {
      String pattern = "fullName: {0}, position: {1}, email: {2}, phone: {3}, salary: {4}, age: {5}";
      return MessageFormat.format(pattern, this.fullName, this.position, this.email, this.phone, this.salary, this.age);
   }

   public void setFullName(String fullName) {
      this.fullName = fullName;
   }

   public String getPosition() {
      return position;
   }

   public void setPosition(String position) {
      this.position = position;
   }
   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }
   public String getPhone() {
      return phone;
   }
   public void setPhone(String phone) {

      this.phone = phone;
   }

   public int getSalary() {
      return salary;
   }

   public void setSalary(int salary) {
      this.salary = salary;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }
}