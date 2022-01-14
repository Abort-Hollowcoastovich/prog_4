public class Main {
    public static void main(String [] arg){
        Girls member = new Girls();
        Girls.BlueEye sineglazka = member.new BlueEye();
        Cheeks shechki = new Cheeks();
        Eyes glazki = new Eyes();
        Girls.Medunica malishka = member.new Medunica();
        Blanket odeialo = new Blanket();
        Steps shagi = new Steps(){
            private String name = "Шаги";
            public void underDoor(){
                System.out.print("Тут за дверью послышались " + name + ".");
            }
        };
        Khalat halat = new Khalat();
        Hat shapka = new Hat();
        Case chemodan = new Case();
        Neznaika neznaika = new Neznaika();
        try {neznaika.gender();
        }
        catch (MaleException e){
            System.out.println(e.getMessage());
        }
        System.out.println();
        shagi.underDoor();
        neznaika.goToBed(odeialo.getName());
        neznaika.PutOnBlanket("накрылся одеялом.");
        sineglazka.enter(halat, shapka, chemodan);
        shechki.were();
        glazki.watch();
        neznaika.understood(malishka.getName());
        sineglazka.talk();
    }
}
