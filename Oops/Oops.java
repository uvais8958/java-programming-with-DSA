package Oops;

/**
 * Oops
 */
public class Oops {
public static void main(String args[]){
        Student s1= new Student();
    // s1.setName("Uvais");
    // System.out.println("Student name"+" "+s1.name);
    // s1.setRollno(101);
    // System.out.println("Student name "+s1.name +" " +"and rollno"  +" " + s1.rollNo);

    // s1.setCourse("BCA");
    // System.out.println("Student name"+" "+s1.name+" "+ "rollno "+"  "+ s1.rollNo+" "+"course"+ " "+ s1.course);

    // s1.setAddress("Mohalla sotha Ghanta-Ghar Budaun UP");
    // System.out.println("Address"+" "+s1.address);

    // s1.setFess(10000);
    // System.out.println("Fess:"+" "+ s1.fess);


    s1.studentDetails("Uvais", 101, "BCA" , "Mohalla sotha Budaun UP", 20000);
    System.out.println(s1.name+ " "+ s1.rollNo+" "+s1.course+" "+ s1.address+" "+s1.fess);//Uvais 101 BCA Mohalla sotha Budaun UP 20000.0
}

    
}

class Student{
    String name;
    int rollNo;
    String course;
    String address;
    float fess;

    // void setName(String newName){
    //     name=newName;
    // }
    // void setRollno(int newRollno){
    //     rollNo=newRollno;
    // }
    // void setCourse(String newCourse){
    //     course=newCourse;
    // }
    // void setAddress(String newAddress){
    //     address=newAddress;
    // }
    // void setFess(float newFees){
    //     fess=newFees;
    // }
  void studentDetails(String newName,int newRollno, String newCourse,String newAddres,float newFees){
    name=newName;
    rollNo=newRollno;
    course=newCourse;
    address=newAddres;
    fess=newFees;

  }
}
