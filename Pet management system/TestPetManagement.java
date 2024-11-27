package OOP.oop_lab_2.problem5;

public class TestPetManagement {
    public static void main(String[] args) {
        Person john = new Employee("John", 30, "Engineer");
        Person john1 = new Employee("John", 30, "Engineer");
        Person artem = new Employee("Artem", 20, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Comp. Science", "AI");
        Animal murka = new Cat("Murka", 5);
        john.assignPet(murka);
        murka.setOwner(john);
        System.out.println(murka.getSound());

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(john1);
        registry.addPerson(alice);
        registry.addPerson(artem);

        //VacationLogic.leavePetWith(john, alice);
        john.leavePetWith(alice);

        registry.printDetails();

        //VacationLogic.retrievePet(artem, alice);
        artem.retrievePet(alice);
        //VacationLogic.retrievePet(john, alice);
        john.retrievePet(alice);

        registry.printDetails();

        registry.findPeopleWithoutPets();
        registry.findPeopleWithPets();
    }
}
