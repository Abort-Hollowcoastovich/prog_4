public class Neznaika extends object{
    private boolean male = true;
    public Neznaika(){
        super("Незнайка");
        Join(getName());
    }
    public void goToBed(String var){
        System.out.print(" "+ getName() + " быстро юркнул в постель");
    }
    public void understood(String var){
        System.out.print(" " + getName() + " понял, что это и есть " + var + ", ");
    }
    public void gender() throws MaleException{
        if (male == true){
            System.out.println(getName() + " является мужчиной");
        }
        else {
            throw new MaleException(getName() + " не является мужчиной");
        }
    }
    public void PutOnBlanket(String b){
        class blanket{
            private String action = "накрылся одеялом.";
            public blanket(){
                this.action = b;
            }
        }
        System.out.println(" и " + b);
    }


}
