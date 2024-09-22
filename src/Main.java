public class Main {
    public static void main(String[] args) {
        Course course = new Course(185, "Гусак С.С.,Андрусейко О.Б.", 4);

        course.displayInfo();
        course.displayCadetsInEachKubruk();

        Platoon platoon = new Platoon(36, "Гусак C.C.", 2,2,"Цз-21");
        platoon.displayInfo();
        platoon.displayCadetsInEachKubruk();
        platoon.yearnabir();

        Group group = new Group(124,"Андрусейко О.Б.",5,145,"Кн-31.");
        group.displayInfo();

    }
}



