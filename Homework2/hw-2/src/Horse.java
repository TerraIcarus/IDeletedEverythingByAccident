public class Horse extends Animal
{
    public Horse (int Food,String Location,boolean IsSleep)
    {
        super(Food,Location,IsSleep);
    }

    public String weirdNoise() {
        return "*издает звук*";
    }

    @Override
    public String MakeNoise() {
        if (IsSleep) {
            return "*спит*";
        }
        return "*издает звук*";
    }
}
