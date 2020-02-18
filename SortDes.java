import java.util.Comparator;
public class SortDes implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getFinalMark() > s2.getFinalMark()){
            return 1;
        }else{
            return -1;
        }
    }
}
