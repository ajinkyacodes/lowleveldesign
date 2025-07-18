package LLD2_AccessModifiers_New;

import LLD2_AccessModifiers.StudentSst;

public class StudentSstDSML extends StudentSst {

    public void displayDetails() {
        StudentSstDSML s = new StudentSstDSML();
        s.rollNo = 1;
        s.batchId = 4;
        super.batchId = 3;

    }


}
