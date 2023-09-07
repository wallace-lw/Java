public class Person {
  private String name;
  public String address, cpf;
  public static int registrationCode;
  public static int registration;

  public Person(String name, String cpf, String address, int registration){
    this.name = name;
    this.cpf = cpf;
    this.address = address;
    registrationCode++;
    Person.registration=registrationCode;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName() {
    return name;
  }

}
