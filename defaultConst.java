public class Student {
  String firstName;
  String lastName;
  int age;

  //Student constructor
  public Student(){
      firstName = "Ihechikara";
      lastName = "Abba";
      age = 100;
  }
  
  public static void main(String args[]) {
      Student myStudent = new Student();
      System.out.println(myStudent.age);
      // 100
  }
}
