public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[4];

        students[0] = new Student("Иван", "Иванов","1", 5);
        students[1] = new Student("Иван", "Иванов","1", 3);
        students[2] = new Student("Иван", "Иванов","1", 4);
        students[3] = new Student("Иван", "Иванов","1", 5);

        for(int i = 0; i<4; i++) {
            System.out.println(students[i].getScholarship());
        }
    }
}