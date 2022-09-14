public class Student
{
    String FirstName, LastName, Group;
    double AverageMark;

    public Student(String FirstName,String LastName,String Group, double AverageMark)
    {
     this.FirstName = FirstName;
     this.AverageMark =AverageMark;
     this.Group = Group;
     this.LastName = LastName;
    }

    public int getScholarship()
    {
        if (AverageMark == 5)
        {
            return 10000;
        }
        else if (AverageMark < 5) {
            return 8000;
        }
        return 0;
    }


}
