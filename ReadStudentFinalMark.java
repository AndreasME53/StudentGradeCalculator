
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


public class ReadStudentFinalMark {

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        String filename = "student_data.txt";

        try {
            studentList = readStudent(filename);
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            System.exit(1);
        }


        Collections.sort(studentList,new Sort());// OR Collections.sort(studentList,new SortDes()); for descending 
        //Collections.
        for (Student stuwe: studentList) {
            //System.out.print(stuwe);
            String s = String.format("%-10d %-15s %s: %.1f",stuwe.getStudentID(),stuwe.getsName(),stuwe.getfName(),stuwe.getFinalMark());
            System.out.println(s);
        }


    }
    public static ArrayList<Student> readStudent(String filename)throws FileNotFoundException{
        ArrayList<Student> studentList = new ArrayList<>();

        Scanner file = new Scanner(new File(filename));


        while(file.hasNextLine()){
            Scanner in = new Scanner(file.nextLine());
            Student s = new Student();
            s.setStudentID(in.nextInt());
            s.setfName(in.next());
            s.setsName(in.next());
            s.setCourseWork1(in.nextInt());
            s.setCourseWork2(in.nextInt());
            s.setExamMark(in.nextInt());
            studentList.add(s);
            in.close();// have a look at how to deal with closing
        }
        file.close();
        return studentList;
    }


}
