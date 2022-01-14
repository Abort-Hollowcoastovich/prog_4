public class Girls {
    public class BlueEye extends object{
        private boolean female = true;

        public BlueEye(){
            super("Синеглазка");
            Join(getName());
        }
        public void enter(object var1,object var2,object var3){
            System.out.println("В комнату вошли " + getName() + " и другая малышка, в " + var1.getColor() + "ом " + var1.getName()
                    + "е и " + var2.getColor() + "ой " + var2.getName() + "е," +
                    " с небольшим " + var3.getColor() + "ым " + var3.getName() + "ом в руках.");
        }
        public void talk(){
            System.out.print("о которой ему говорила "+ getName() + ".");
        }
        public void gender2() throws Throwable{
            if (female == true){
                System.out.println(getName() + " является женщиной");
            }
            else {
                throw new RuntimeException();
            }
        }

    }
    public class Medunica extends object{
        public Medunica(){
            super("Медуница");
            Join(getName());
        }
    }


}
