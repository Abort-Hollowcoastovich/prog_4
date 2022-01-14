public class Eyes extends object{
    public Eyes(){
        super("Глазки", color.Серые);
        Join(getName());
    }
    public void watch(){
        System.out.print(" " + getColor() + " " + getName() + " строго смотрели из-за круглых роговых очков.");
    }
}
