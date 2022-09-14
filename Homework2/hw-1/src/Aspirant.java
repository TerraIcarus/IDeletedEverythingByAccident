public class Aspirant extends Student
{
    static boolean ScienceWork = true;

    public Aspirant(String FirstName,String LastName,String Group, double AverageMark)
    {
      super(FirstName, LastName, Group, AverageMark);
    }

    @Override
    public int getScholarship()
    {
        if (AverageMark == 5)
        {
            return 20000;
        }
        else if (AverageMark < 5) {
            return 18000;
        }
        return 0;
    }

 }
