public interface Study {
    
    void writeExam();
    void writeResearchThesis();
}

// below classes are kept here for readability

public class Student implements Study {
    public void writeExam() {
        // write your exam
    }
    public void writeResearchThesis() {
        throw new IllegalStateException("not all students can write a grad research thesis");
    }
}


public class UnderGraduateStudent extends Student {
    @Override
    public void writeResearchThesis() {
        // write a thesis
    }
}

// as you can see that anyone implementing the Study interface is forced to 
// implement the "writeResearchThesis" method which might not even be required
// that is why it violates ISP