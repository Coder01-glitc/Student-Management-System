 import java.util.*;

    class Student {
        int id;
        String name;
        int age;

        Student(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }
    }

 public class StudentSystem {

        static ArrayList<Student> list = new ArrayList<>();

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            while(true) {
                System.out.println("\n1. Add Student");
                System.out.println("2. View Students");
                System.out.println("3. Search Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");

                System.out.print("Enter choice: ");
                int ch = sc.nextInt();

                switch(ch) {
                    case 1: addStudent(sc); break;
                    case 2: viewStudents(); break;
                    case 3: searchStudent(sc); break;
                    case 4: deleteStudent(sc); break;
                    case 5: System.exit(0);
                    default: System.out.println("Invalid choice");
                }
            }
        }

        static void addStudent(Scanner sc) {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            list.add(new Student(id, name, age));
            System.out.println("Student Added!");
        }

        static void viewStudents() {
            for(Student s : list) {
                System.out.println(s.id + " " + s.name + " " + s.age);
            }
        }

        static void searchStudent(Scanner sc) {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            for(Student s : list) {
                if(s.id == id) {
                    System.out.println("Found: " + s.name);
                    return;
                }
            }
            System.out.println("Not Found");
        }

        static void deleteStudent(Scanner sc) {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            list.removeIf(s -> s.id == id);
            System.out.println("Deleted!");
        }
    }

