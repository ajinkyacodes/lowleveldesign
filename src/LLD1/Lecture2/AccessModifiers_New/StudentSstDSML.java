package LLD1.Lecture2.AccessModifiers_New;

import LLD1.Lecture2.AccessModifiers.StudentSst;

public class StudentSstDSML extends StudentSst {

    public void displayDetails() {
        StudentSstDSML s = new StudentSstDSML();
        s.rollNo = 1;
        s.batchId = 4;
        super.batchId = 3;

    }


}
