public class Group extends Course {
    int students;
    String grupsName;



    public Group(int cadets, String nameoficer, int kubruk, int students, String grups) {
        super(cadets, nameoficer, kubruk);
        this.students = students;
        this.grupsName = grups;
    }

    @Override
    public void displayInfo() {
        System.out.println("Студенів:" + students);
        System.out.println("Начальнтк курсу:" + namecourse);
        System.out.println("Група:" + grupsName);
    }





}