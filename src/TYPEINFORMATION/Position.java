package TYPEINFORMATION;

public class Position {
    private String title;
    private Person person;
    public Position(String jobTitle,Person employee){
        title=jobTitle;
        person=employee;
        if(person==null){
            person=Person.NULL;//
        }
    }
    public Position(String jobTitle){
        title=jobTitle;
        person=Person.NULL;//
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String newTitle){
        title=newTitle;
    }
}
