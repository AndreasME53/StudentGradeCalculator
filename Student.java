public class Student {
    private int studentID;
    private String fName;
    private String sName;
    private int courseWork1;
    private int courseWork2;
    private int examMark;


    public Student(){

    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String SName) {
        this.sName = SName;
    }

    public int getCourseWork1() {
        return courseWork1;
    }

    public void setCourseWork1(int courseWork1) {
        this.courseWork1 = courseWork1;
    }

    public int getCourseWork2() {
        return courseWork2;
    }

    public void setCourseWork2(int courseWork2) {
        this.courseWork2 = courseWork2;
    }

    public int getExamMark() {
        return examMark;
    }

    public void setExamMark(int examMark) {
        this.examMark = examMark;
    }
    public double getFinalMark() {
       return (courseWork1 *0.1) + (courseWork2 *0.1) + (examMark * 0.8);
    }

    @Override
    public String toString() {
        return getStudentID()+", " +getsName()+" "+getfName()+": "+Math.round(getFinalMark()*100)/100.0+ "\n";
    }
}
