public class Course {
     int cadets;
     String namecourse;
     int kubruk;

    public Course(int cadets, String inventory, int kubruk){
        this.cadets = cadets;
        this.namecourse = inventory;
        this.kubruk = kubruk;
    }
    public  void displayInfo(){
        System.out.println("Курсантів:" + cadets);
        System.out.println("Начальники курсу:" + namecourse);
        System.out.println("Кубрики:" + kubruk);
    }
    public int[] calculatecadetsinkubruk () {
        int[] cadetsinkubruk = new int[kubruk];
        int maincadetsinkubruk = cadets / kubruk;
        int restcadetsinkubruk = cadets % kubruk;

        for (int i = 0; i < kubruk; i++) {
            if (i < restcadetsinkubruk) {
                cadetsinkubruk[i] = maincadetsinkubruk + 1;
            } else {
                cadetsinkubruk[i] = maincadetsinkubruk;
            }
        }
        return cadetsinkubruk;
    }
    public void displayCadetsInEachKubruk() {
        int[] result = calculatecadetsinkubruk();


        for (int i = 0; i < result.length; i++) {
            System.out.println("У кубрику " + (i + 1) + " живе " + result[i] + " курсантів.");
        }
    }


}
