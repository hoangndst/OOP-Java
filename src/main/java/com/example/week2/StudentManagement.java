package com.example.week2;

public class StudentManagement {
    private Student[] students = new Student[100];
    private int studentCount = 0;

    public StudentManagement() {
    }

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    public void addStudent(Student s) {
        students[studentCount] = new Student(s);
        studentCount++;
    }

    /**
     * Remove student from the list.
     * @param id Student id
     */

    public void removeStudent(String id) {
        int index = -1;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId().equals(id)) {
                index = i;
                break;
            }
        }
        
        if (index == -1) {
            System.err.println("Student not found");
            return;
        } 

        for (int i = index; i < studentCount - 1; i++) {
            students[i] = students[i + 1];
        }
        studentCount--;
    }

    /**
     * Sort the students by their id.
     * @return the students group
     */

    public String studentsByGroup() {
        if (students[0] == null) {
            return "";
        }
        
        int n = studentCount;
        boolean[] used = new boolean[100];
        String ans = "";

        for (int i = 0; i < n; i++) {
            if (used[i] == true) {
                continue;
            }
            String tmpGroup = students[i].getGroup();
            ans = ans + tmpGroup + "\n";
            for (int j = i; j < n; j++) {
                if (students[j].getGroup().equals(tmpGroup)) {
                    used[j] = true;
                    ans = ans + students[j].getInfo() + "\n";
                }
            }
        }
        return ans;
    }

    /**
     * Main function.
     */

    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();
        Student std1 = new Student("Nguyen Van An", "17020001", "K62CC", "17020001@vnu.edu.vn");
        Student std2 = new Student("Nguyen Van B", "17020002", "K62CC", "17020002@vnu.edu.vn");
        Student std3 = new Student("Nguyen Van C", "17020003", "K62CB", "17020003@vnu.edu.vn");
        Student std4 = new Student("Nguyen Van D", "17020004", "K62CB", "17020004@vnu.edu.vn");
        sm.addStudent(std1);
        sm.addStudent(std2);
        sm.addStudent(std3);
        sm.addStudent(std4);
        System.out.println(sm.studentsByGroup());
    }
}
