package LabWeek5;
class Author{

  private String name;
  private String email;
  private char gender;

  public Author(String name, String email, char gender) {
    this.name = name;
    this.email = email;
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public char getGender() {
    return gender;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {

    return String.format("%s[name=%s,email=%s,gender=%s]", 
    this.getClass().getName(), name, email, gender);
  }

}

public class AuthorTest {
public static void main (String [] args) {
      Author a = new Author("Chanakarn Kingkaew","oakabc@gmail.com",'M'); //สร้าง object a สำหรับผู้แต่งชื่อ CK
      System.out.println(a); // แสดงข้อมูลของ a ออกมา
}
} 

