import java.util.Comparator;


public class ArrayListSorting implements Comparator<Student>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(Student a, Student b)
    {
        return a.rollno - b.rollno;
       // return a.getName().compareTo(b.getName()); to return name
    }
}