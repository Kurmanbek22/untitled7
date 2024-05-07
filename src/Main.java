public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Asan";
        person.age = 30;
        person.work = "mugalim";
        person.salary = 30000;
        person.phone = 25000;
        Person person1 = new Person("Uson", 19, "bez rabotnyi", 0, 30000);
        Person person2 = new Person("Batma", 29, "Bankir", 60000, 90000);
        Person person3 = new Person("Zuura", 25, "povar", 35000, 50000);
        Person person4 = new Person("Aktan", 40, "programist", 120000, 70000);
        Person[] persons = new Person[]{person, person1, person2, person3, person4};
        for (int i = 0; i < persons.length; i++) {
            System.out.print(persons[i].name + "\n" + persons[i].age + "\n" + persons[i].work + "\n" + persons[i].salary + "\n" + persons[i].phone + "\n");
        }
        Person enChonZarplata = persons[0];
        for (int i = 1; i < persons.length; i++) {
            if (enChonZarplata.salary < persons[i].salary) {
                enChonZarplata = persons[i];
            }
        }
        System.out.println("en chon zarplata algan kishi " + enChonZarplata.name + " " + enChonZarplata.salary + "som " + enChonZarplata.work);
        Person enAzZarplata = persons[0];
        for (int i = 1; i < persons.length; i++) {
            if (enAzZarplata.salary > persons[i].salary) {
                enAzZarplata = persons[i];
            }
        }
        System.out.println("en az zarplata algan kishi " + enAzZarplata.name + " " + enAzZarplata.salary + "som " + enAzZarplata.work);
        Person enKymbatTel = persons[0];
        for (int i = 1; i < persons.length; i++) {
            if (enKymbatTel.phone < persons[i].phone) {
                enKymbatTel = persons[i];

            }
        }
        System.out.println("en kymbat telefondun eesi "+enKymbatTel.name+" "+enKymbatTel.phone+"som");
    }
}