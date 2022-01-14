public class Cheeks extends object{
    public Cheeks(){
        super("Щечки", color.румяные);
        Join(getName());
    }
    public void were(){
        System.out.print("У нее были пухлые " + getColor() + " "+ getName() + ".");
    }
}
