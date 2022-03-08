public interface ExamAble {
    void writeExam();
}

public interface ThesisAble {
    void writeResearchThesis();
}

// all classes/interfaces are kept in one file here for readability

public class Student implements ExamAble {
    public void writeExam() {
        // write a exam
    }
}

public class UnderGraduateStudent extends Student implements ThesisAble {
    public void writeResearchThesis() {
        // write a thesis
    }
}