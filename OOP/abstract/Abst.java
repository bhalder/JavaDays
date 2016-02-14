public abstract class Abst {

    public abstract void changeThis();
    public final void cannotChangeThis() {
        System.out.println(" Final Function ");
    }
    public void overrideFunc() {
        System.out.println("This is OverRide Func from Abst");
    }

}
