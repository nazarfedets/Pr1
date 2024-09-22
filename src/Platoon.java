public class Platoon extends Course{
    int curse;
    String platoon;
    int year = 2024;
    int yearnabirs;

    public Platoon(int cadets, String nameoficer, int kubruk, int curse, String platoon) {
        super(cadets, nameoficer, kubruk);
        this.curse = curse;
        this.platoon = platoon;
        this.year = year;
        this.yearnabirs = yearnabirs;

    }

    @Override
    public void displayCadetsInEachKubruk() {
        super.displayCadetsInEachKubruk();
        System.out.println("Курс:" + curse + " ,Взвод:" + platoon);
    }

    @Override
    public int[] calculatecadetsinkubruk() {
        return super.calculatecadetsinkubruk();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }

    public void yearnabir(){
        yearnabirs= year - curse;
        System.out.println("Рік набору:" + yearnabirs + "рік.");
    }





}

