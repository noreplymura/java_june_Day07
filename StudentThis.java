
class Student {
    int rollno;
    String name, cours;
    float fee;

    Student(int rollno, String name, String cours) {
        this.rollno = rollno;
        this.name = name;
        this.cours = cours;
    }

    Student(int rollno, String name, String course, float fee) {
        this(rollno, name, coues);
    }this.fee=fee;

    }

    void display() {
        System.out.println(rollno + " " + name + " " + course);
    }

    class StudentThis {
        public static void main(String[] args) {
            Student s1 = new Student(111, "ankit", 5000f);
            Student s2 = new Student(112, "Ajay", 6000f);
            s1.display();
            s2.display();
        }
    }
}