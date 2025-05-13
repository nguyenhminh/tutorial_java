

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.List;

@Service
public class StudentService {
  private final List<StudentModel> list = new ArrayList<>();
  private Long id = 1L;

  public List<StudentModel> getAll() {
    return list;
  }

  public StudentModel getById(Long id) {
    return null;
  }

  public StudentModel create(StudentModel student) {
    return null;
  }

  public void delete(Long id) {

  }
}