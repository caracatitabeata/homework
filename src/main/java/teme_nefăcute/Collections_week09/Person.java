package teme_nefăcute.Collections_week09;

import java.util.*;

public class Person {
    private String name;
    private Integer age;
    private List<Hobby> hobbies;

    public Person(String name, Integer age, List<Hobby> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public Integer getAge() { return age; }
    public List<Hobby> getHobbies() { return hobbies; }
    public void addHobbies(Hobby... hobby){
        Collections.addAll(this.hobbies, hobby);}

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person){
            Person toCompare = (Person) obj;
            return this.getName().equals(toCompare.getName()) && this.getAge().equals(toCompare.getAge());
        }
        return false;
    }

    public static void main(String[] args) {
        SortedSet<Person> sortedSet = new TreeSet<>(Comparator.comparing(Person::getAge));
        SortedSet<Person> sortedSet1 = new TreeSet<>(Comparator.comparing(Person::getName));

        HashSet<Person> hashSet = new HashSet<>();
        hashSet.add(new Person("Gigel",69));
        hashSet.add(new Person("Francois",22));
        hashSet.add(new Person("Bounegru-Mihai",1000));

        sortedSet.addAll(hashSet);
        sortedSet.forEach(p-> System.out.println(p.age +" " + p.name));

        sortedSet1.addAll(hashSet);
        sortedSet1.forEach(p-> System.out.println(p.name +" " + p.age));
    }
}
