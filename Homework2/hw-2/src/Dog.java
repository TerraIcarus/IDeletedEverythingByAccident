public class Dog extends Animal
{
    public Dog (int Food,String Location,boolean IsSleep)
    {
        super(Food,Location,IsSleep);
    }

    public String bark() {
        return "*Гавкает*";
    }

    @Override
    public String MakeNoise() {
        if (IsSleep) {
            return "*спит*";
        }
        return "*гавкает*";
    }
}
