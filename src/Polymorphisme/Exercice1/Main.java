package Polymorphisme.Exercice1;

public class Main {
    public static void main(String[] args) {


    //5 Employees
        Employee Employee1 = new Employee("Employee1", "Employee1", "Casa", 1995, 6000);
        Employee Employee2 = new Employee("Employee2", "Employee2", "Casa", 1995, 6000);
        Employee Employee3 = new Employee("Employee3", "Employee3", "Casa", 1995, 6000);
        Employee Employee4 = new Employee("Employee4", "Employee4", "Casa", 1995, 6000);
        Employee Employee5 = new Employee("Employee5", "Employee5", "Casa", 1995, 6000);

    //2 Chefs
        Chef Chef1 = new Chef("Chef1","Chef1", "Casa", 1993, 8000, "Securite");
        Chef Chef2 = new Chef("Chef2","Chef2", "Casa", 1993, 8000, "Technique");

    //1 Directeur
        Directeur Directeur1 = new Directeur("Directeur1","Directeur1", "Casa", 1990, 10000, "Technique", "XML");


    //Output
        Directeur1.Afficher();
        System.out.println();



    }
}
