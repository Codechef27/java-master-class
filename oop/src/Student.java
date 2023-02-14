public class Student {


    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "Bradley";
                case 4 -> "Harry";
                case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "01/10/1984",
                    "Java Masterclass");

            System.out.println(s);
        }

        Student pojoStudent = new Student("6923006", "Anne" , "05/2/2000", "Java masterclass");

        LPAStudent recordStudent = new LPAStudent("S923007", "Billy", "05/11/2001", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP exam 829");
//        recordStudent.setClassList();
        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());

        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());



    }

    private String id;
    private String name;
    private String dateOfBirth;
    private String classList;

    public Student(String id, String name, String dateOfBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }
}
