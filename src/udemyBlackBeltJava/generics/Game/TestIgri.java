package udemyBlackBeltJava.generics.Game;

public class TestIgri {
    public static void main(String[] args) {
    Schoolar schoolar1=new Schoolar("Leha",12);
    Schoolar schoolar2=new Schoolar("Andrey",15);

    Studentss studentss1=new Studentss("Kolya",24);
    Studentss studentss2=new Studentss("Olya",22);

    Employeeee employeeee1=new Employeeee("Roma",44);
    Employeeee employeeee2=new Employeeee("Igor",37);

    Teams <Schoolar>schoolarTeam=new Teams<>("Drakoni");
    schoolarTeam.addNewParticipant(schoolar1);
    schoolarTeam.addNewParticipant(schoolar2);

    Teams<Studentss> studentTeams=new Teams<>("Vpered");
    studentTeams.addNewParticipant(studentss1);
    studentTeams.addNewParticipant(studentss2);

    Teams<Employeeee> employeeTeam=new Teams<>("Rabotniki");
    employeeTeam.addNewParticipant(employeeee1);
    employeeTeam.addNewParticipant(employeeee2);

    Teams <Schoolar>schoolarTeam2=new Teams<>("Mudreci");
    Schoolar schoolar3=new Schoolar("Sergey",15);
    Schoolar schoolar4=new Schoolar("Masha",12);

    schoolarTeam.addNewParticipant(schoolar3);
    schoolarTeam.addNewParticipant(schoolar4);

    schoolarTeam.playwith(schoolarTeam2);


    }
}
