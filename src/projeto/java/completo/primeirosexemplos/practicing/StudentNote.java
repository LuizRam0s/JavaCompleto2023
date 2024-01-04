package projeto.java.completo.primeirosexemplos.practicing;

public class StudentNote {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalGrade(){
        return grade1 + grade2 + grade3;
    }

    public double missingNote() {
        return 60 - finalGrade();
    }
}


