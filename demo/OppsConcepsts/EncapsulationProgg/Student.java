package demo.OppsConcepsts.EncapsulationProgg;

import java.util.ArrayList;

public class Student {
    private int stuId;
    private String stuName;
    ArrayList < Double > marks;
    public int getStuId() {
        return stuId;
    }
    public void setStuId(int stuId) {
        this.stuId = stuId;
    }
    public String getStuName() {
        return stuName;
    }
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
    public ArrayList<Double> getMarks() {
        return marks;
    }
    public void setMarks(double mark) {
        if(marks == null){
            marks  = new ArrayList<>();
        }
        marks.add(mark);
    }
    
}
