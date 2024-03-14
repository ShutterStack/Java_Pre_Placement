import java.util.*;

class student {
    String name;
    int id;

    public student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Student Name : " + getName() + "\nStudent ID :" + getId();
    }

}

public class crud {
    private static ArrayList<student> students = new ArrayList<>();
    private static int nextId = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            printMainMenu();
            int choice = getUserChoice(sc);
            switch (choice) {
                case 1:
                    createStudent(sc);
                    break;
                case 2:
                    readStudent();
                    break;
                case 3:
                    updateStudent(sc);
                    break;
                case 4:
                    deleteStudent(sc);
                    break;
                case 5:
                    exitProgram(sc);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    public static void printMainMenu() {
        System.out.println();
        System.out.println("\t\tCRUD Operations on Student Records");
        System.out.println("1. Create a new student record");
        System.out.println("2. Read an existing student record");
        System.out.println("3. Update an existing student record");
        System.out.println("4. Delete an existing student record");
        System.out.println("5. Exit Program");
    }

    
    public static int getUserChoice(Scanner sc) {
        System.out.println("Enter choice from 1 to 5");
        return sc.nextInt();
    }

    public static void createStudent(Scanner sc) {
        System.out.println("Enter Name : ");
        String name = sc.nextLine();
        student stu = new student(name, nextId++);
        students.add(stu);
        System.out.println("Created Successfully!");
    }

    public static void readStudent() {
        if (students.isEmpty()) {
            System.out.println("No records in database.");
        } else {
            System.out.println(" List of Students");
            for (student student : students) {
                System.out.println(student);

            }
        }
    }

    private static void updateStudent(Scanner sc){
            System.out.println("Enter id to update: ");
            int id = sc.nextInt();
            for(student student : students)
            {
                if(student.getId() ==id )
                {
                    System.out.println("Name before updating is " + student.getName());
                    System.out.println("Enter new Name : ");
                    String newname = sc.nextLine();
                    student = new student(newname, id);
                    System.out.println("Updated Successfully!" + student);
                    return;
                    }
                    }
                    System.out.println(" Student with " + id + " not found");
                    }
                   
                    private static void deleteStudent(Scanner sc)
                    {
                        System.out.println("Enter student id to delete: ");
                        int id = sc.nextInt();
                        for(student student:students)
                        {
                            if(student.getId()==id)
                            {
                                students.remove(student);
                                System.out.println("Student with id "+ id + " is deleted ");
                                return;
                            }
                        }
                        System.out.println(" Student with " + id + " not found");
                    }
                    private static void exitProgram(Scanner sc)
                    {
                        System.out.println("Exiting Program");
                        System.exit(0);
                    }
                }




