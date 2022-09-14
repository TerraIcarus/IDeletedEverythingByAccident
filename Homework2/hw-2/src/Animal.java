public class Animal
{
    int Food;
    String Location;
    boolean IsSleep;

    public Animal(int Food, String Location, boolean IsSleep) {
        this.Food = Food;
        this.Location = Location;
        this.IsSleep = IsSleep;
    }

    public String MakeNoise() {
        if (IsSleep) {
            return "*спит*";
        }
        return "*издает звук*";
    }

    public int getFood() {
        return Food;
    }

    public String getLocation() {
        return Location;
    }

    public boolean isSleep() {
        return IsSleep;
    }
}
