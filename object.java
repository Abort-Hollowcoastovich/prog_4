import java.util.Objects;

public abstract class object implements showName, showColor{
    private String name;
    private color value;

    public object(String name){
        this.name = name; 
    }
    public object(String name, color value){
        this.name = name;
        this.value = value;
    }

    protected void Join(String name){
        System.out.println(name + " в истории");
    }

    public String getName(){
        return this.name;
    }

    public color getColor(){
        return this.value;
    }

    public String toString(){
        return getName();
    }

    public int HashCode(){
        return this.name.hashCode();
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        object object = (object) o;
        return Objects.equals(name, object.name) && value == object.value;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, value);
    }
}
