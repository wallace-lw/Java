public class Student extends Person{
  public Student(String name, String cpf, String address, int registration) {
    super(name, cpf, address, registration);
  }

  private String course, grade;

  public String getCourse() {
    return course;
  }
  public String getGrade() {
    return grade;
  }
  
  @Override
  public String getName() {
    return super.getName();
  }



  public String toString(){
    return " Dados: Curso = "+course +"Turma= "+grade;
  }
}
