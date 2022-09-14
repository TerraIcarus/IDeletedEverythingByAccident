public class Cat extends Animal
{
    public Cat(int Food,String Location,boolean IsSleep)
    {
        super(Food,Location,IsSleep);
    }

    public String meow() {
        return "*мяукает*";
    }

    @Override
    public String MakeNoise() {
        if (IsSleep) {
            return "*спит*";
        }
        return "*мяукает*";
    }
}
