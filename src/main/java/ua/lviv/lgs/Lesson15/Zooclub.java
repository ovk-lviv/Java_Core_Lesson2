package ua.lviv.lgs.Lesson15;

import java.util.*;

public class Zooclub {
    Map<Person, List<Pet>> map;

    public Zooclub() {
        this.map = new HashMap<>();
    }


    @Override
    public String toString() {
        return "Zooclub[" +
                this.map +
                ']';
    }

    public void showZooclub() {
        System.out.println(toString());
    }

    public Map<Person, List<Pet>> getMap() {
        return map;
    }

    public void addMember(Person person) {
        getMap().put(person, new ArrayList<>());
    }

    public void addPetToMember(String name, Pet pet) {

        for (Map.Entry<Person, List<Pet>> next : getMap().entrySet()) {
            String personName = next.getKey().getName();

            if (personName.equalsIgnoreCase(name)) {
                List<Pet> value = next.getValue();
                value.add(pet);
                next.setValue(value);
            }
        }
    }

    public void removePetFomMember(String memberName, String petType, String petName) {
        Iterator<Map.Entry<Person, List<Pet>>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Person, List<Pet>> next = iterator.next();
            String personName = next.getKey().getName();
            if (personName.equalsIgnoreCase(memberName)) {
                List<Pet> value = next.getValue();
                Iterator<Pet> it = value.iterator();
                while (it.hasNext()) {
                    Pet p = it.next();
                    if (p.getPetName().equalsIgnoreCase(petName) && p.getType().equalsIgnoreCase(petType)) {
                        it.remove();
                    }
                }
            }
        }
    }

    public void removeMember(String name) {
        Iterator<Map.Entry<Person, List<Pet>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Person, List<Pet>> next = iterator.next();
            String personName = next.getKey().getName();
            if (personName.equalsIgnoreCase(name)) {
                iterator.remove();
            }
        }
    }

    public void removePetFromMembers(String type) {
        Iterator<Map.Entry<Person, List<Pet>>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            List<Pet> pets = iterator.next().getValue();
            Iterator<Pet> p1 = pets.iterator();
            while (p1.hasNext()) {
                Pet pet = p1.next();
                if (pet.getType().equalsIgnoreCase(type)) {
                    p1.remove();
                }
            }
        }
    }
}

