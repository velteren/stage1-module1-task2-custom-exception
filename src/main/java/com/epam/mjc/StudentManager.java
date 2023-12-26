package com.epam.mjc;


public class StudentManager {

  private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

  public Student find(long studentID) throws MyException {
    return Student.getValueOf(studentID);
  }

  public static void main(String[] args) {
    StudentManager manager = new StudentManager();

    for (int i = 0; i < IDs.length; i++) {
      try {
        Student student = manager.find(IDs[i]);
        System.out.println("Student name " + student.getName());
      } catch (MyException e) {
        System.out.println(e.toString());
      } catch (NullPointerException e) {
        System.out.println("Could not find student with ID Null");
      }
    }

  }
}