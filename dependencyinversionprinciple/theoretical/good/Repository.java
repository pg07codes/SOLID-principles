// all classes placed in same file to enhance readability

public interface Connection {  
    void insert();
    void update();
    void delete();
}

public class MySqlConnection implements Connection {
    public void insert() { }
    public void update() { }
    public void delete() { }
}


public class StudentRepository {
    private Connection connection;
    // depending on abstraction(interface), not concretion (classes)
    public StudentRepository(Connection connection) {
        this.connection = connection;
    }
    public void save() {
        this.connection.insert();
    }
    public void delete() {
        this.connection.delete();
    }
}


public class Repository {
    public static void main(String[] args) {
//        Connection connection = new MySqlConnection();
        Connection connection = new PsqlConnection( );

        StudentRepository studentRepository = new StudentRepository(connection);
        studentRepository.save();
        studentRepository.delete();

        TeacherRepository teacherRepository = new TeacherRepository(connection);
        teacherRepository.save();
        teacherRepository.update();
    }
}