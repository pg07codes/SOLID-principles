// all classes are written in same file to enhance readability

class StudentRepository {
    private MySqlConnection connection;
    public StudentRepository(MySqlConnection connection){
        this.connection = connection;
    }
    public void save(Student student) {
        connection.insert(student);
    }
    public void delete(String id) {
        connection.delete(id);
    }
}


class TeacherRepository {
    private MySqlConnection connection;
    public TeacherRepository(MySqlConnection connection){
        this.connection = connection;
    }
    public void save(Teacher teacher) {
        connection.insert(teacher);
    }
    public void update(String id, Teacher teacher) {
        connection.update(id,teacher);
    }
}


public class Repository {
    public static void main(String[] args) {

        MySqlConnection connection = new MySqlConnection();

        // now just think if you had to just change the DB from MySql to say PSql,
        // it would involve multiple changes in many places, jsut because you 
        // concretely using type 'MySqlConnection' everywhere.
        
        StudentRepository studentRepository = new StudentRepository(connection);
        studentRepository.save();
        studentRepository.delete();

        TeacherRepository teacherRepository = new TeacherRepository(connection);
        teacherRepository.save();
        teacherRepository.update();

    }
}


