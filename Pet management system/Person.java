package OOP.oop_lab_2.problem5;

import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    private Animal pet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.pet = null;
    }

    public void assignPet(Animal pet) {
        this.pet = pet;
        //System.out.println(name + " now owns " + pet.getName());
    }

    public void removePet() {
        //System.out.println(name + " no longer owns " + pet.getName());
        this.pet = null;
    }

    public boolean hasPet() {
        return this.pet != null;
    }

    public Animal getPet() {
        return pet;
    }

    public abstract String getOccupation();

    public void leavePetWith( Person caretaker) {
        if (this.hasPet() && !(caretaker instanceof PhDStudent && this.getPet() instanceof Dog)) {
            Animal pet = this.getPet();
            pet.setOwner(this);
            this.removePet();
            caretaker.assignPet(pet);
            System.out.println(this + " has left their pet " + pet.getName() + " with " + caretaker + ".");
        } else {
            System.out.println(this + " cannot leave their pet with " + caretaker + ".");
        }
    }

    public void retrievePet( Person caretaker) {
        if (caretaker.hasPet()) {
            Animal pet = caretaker.getPet();
            if (pet.getOwner().equals(this)) {
                caretaker.removePet();
                this.assignPet(pet);
                System.out.println(this + " has retrieved their pet " + pet.getName() + " from " + caretaker + ".");
            } else {
                System.out.println(this + " cannot retrieve a pet that does not belong to them.");
            }
        } else {
            System.out.println(caretaker + " doesn't have any pet to return.");
        }
    }

    @Override
    public String toString() {
        return name + ", " + age + " years old, Occupation: " + this.getOccupation() + (this.hasPet() ? ", owns a pet: " + pet.getName() : ", no pet");
    }

    @Override
    public boolean equals(Object o) {
        if(this == null && !o.equals(null)){
            return false;
        }
        Person p = (Person) o;
        return   p.age == this.age && p.name == this.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}






class Employee extends Person {
    private String jobTitle;

    public Employee(String name, int age, String jobTitle) {
        super(name, age);
        this.jobTitle = jobTitle;
    }

    @Override
    public String getOccupation() {
        return "Employee (" + jobTitle + ")";
    }
}


class Student extends Person {
    private String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public String getOccupation() {
        return "Student, Major: " + major;
    }
}


class PhDStudent extends Person {
    private String major;
    private String researchTopic;

    public PhDStudent(String name, int age, String major, String researchTopic) {
        super(name, age);
        this.major = major;
        this.researchTopic = researchTopic;
    }

    @Override
    public String getOccupation() {
        return "PhD Student, Major: " + major + ", Research: " + researchTopic;
    }

    @Override
    public void assignPet(Animal pet) {
        if (pet instanceof Dog) {
            System.out.println("PhD students cannot take care of dogs.");
        } else {
            super.assignPet(pet);
        }
    }
}

