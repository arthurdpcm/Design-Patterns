public class PersonBuilder {
  
  private Person person = new Person();
 
  void newPerson(){
    person = new Person();
  }

  void setName(String name){
    person.name = name;
  }
  void setAge(int age){
    person.age = age;
  }
  Person getPerson(){
    return person;
  }

}
