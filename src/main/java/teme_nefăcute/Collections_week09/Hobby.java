package teme_nefăcute.Collections_week09;

import java.util.*;

public class Hobby {
    String name;
    Integer frequency;
    List<Address> address;

    public Hobby(String name, Integer frequency, List<Address> address) {
        this.name = name;
        this.frequency = frequency;
        this.address = address;
    }

    public Hobby() {
    }

    public String getName() {
        return name;
    }

    public List<Address> getAddress() {
        return address;
    }

    public StringBuilder toStringList(List<Address> list) {
        StringBuilder sb = new StringBuilder();
        for (Address a : list) {
            sb.append(a.getAddressName());
            sb.append("; ");
        }
        return sb;
    }

    public static void main(String[] args) {
        Address address = new Address("Herastrau");
        Address address1 = new Address("Acasa");
        Address address2 = new Address("Oriunde");
        Address address3 = new Address("Ghana");

        List<Address> addressList1 = new ArrayList<>();
        addressList1.add(address);
        addressList1.add(address3);
        List<Address> addressList = new ArrayList<>();
        addressList.add(address);
        List<Address> addressList2 = new ArrayList<>();
        addressList2.add(address1);
        addressList2.add(address2);

        Hobby smoking = new Hobby("Smoking", 20, addressList);
        Hobby texting = new Hobby("Texting while driving", 1000, addressList1);
        Hobby snaking = new Hobby("Playing with snakes", 1, addressList2);

        List<Hobby> gigelHobbies = new ArrayList<>();
        gigelHobbies.add(smoking);
        gigelHobbies.add(texting);
        List<Hobby> francoisHobbies = new ArrayList<>();
        francoisHobbies.add(texting);
        francoisHobbies.add(smoking);
        List<Hobby> mihaioHobbies = new ArrayList<>();
        mihaioHobbies.add(smoking);
        mihaioHobbies.add(snaking);


        Person gigel = new Person("Gigel", 69, gigelHobbies);
        Person francois = new Person("Francois", 22, francoisHobbies);
        Person mihaio = new Person("Boubatran-Mihai", 1000, mihaioHobbies);

        Map<Person, List<Hobby>> map = new HashMap<>();
        map.put(gigel, gigelHobbies);
        map.put(francois, francoisHobbies);
        map.put(mihaio, mihaioHobbies);
        Set<Map.Entry<Person, List<Hobby>>> set = map.entrySet();

        for (Map.Entry me : set) {
            Person p = (Person) me.getKey();
            List<Hobby> list = p.getHobbies();
            for (Hobby hob : list) {
                List<Address> li = hob.getAddress();
                System.out.println("The name is: " + p.getName() + ", his hobby is: " + hob.getName() + ", and he " +
                        "can practice it here: " + hob.toStringList(li));
            }
        }

        map.values().stream()
                .flatMap(x -> x.stream())
                .map(x -> x.getAddress())
                .flatMap(x -> x.stream())
                .forEach(x -> System.out.println(x.getAddressName())); //doar atât am putut
    }
}

