package br.com.universidade.services;

import br.com.universidade.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.UnaryOperator;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();

    private List<Person> personList = initialPerson();

    public Person create(Person person) {
        personList.add(person);
        return person;
    }

    public Person update(Person person) {
       for(Person it: personList){
           if(it.getId().equals(person.getId())){
               it.setId(person.getId());
               it.setName(person.getName());
               it.setLastName(person.getLastName());
               it.setEmail(person.getEmail());
           }
       }
        return person;
    }

    public void delete(String id) {
        Person person = findById(id);
        if(person != null)
            personList.remove(person);
        }

        public List<Person> findAll() {
            return personList;
    }

    public Person findById(String id) {
        List<Person> person = personList;
        for(int i = 0; i <=  person.size(); i++) {
            if ((person.get(i).getId() == Long.parseLong(id)))
                return (Person) person.get(i);
        }
        return null;
    }

//    public List<Person> findAll() {
//        List<Person> persons = new ArrayList<Person>();
//        for (int i = 0; i < 8; i++) {
//            Person person = mockPerson(i);
//            persons.add(person);
//        }
//        return persons;
//    }

//    private Person mockPerson(int i) {
//        Person person = new Person();
//        person.setId(counter.incrementAndGet());
//        person.setName("Person" + i);
//        person.setLastName("LastName" + i);
//        person.setEmail("email" + i);
//        return person;
//    }

//    public Person findById(String id) {
//        Person person = new Person();
//        person.setId(counter.incrementAndGet());
//        person.setName("Rodrigo");
//        person.setLastName("Imai");
//        person.setEmail("rodrigo.imai@usp.br");
//        return person;
//    }

    //
//    public Person findById(String id) {
//        Person person = new Person();
//        person.setId(counter.incrementAndGet());
//        person.setName("Rodrigo");
//        person.setLastName("Imai");
//        person.setEmail("rodrigo.imai@usp.br");
//        return person;
//    }
    public List<Person> initialPerson() {

        List<Person> persons = new ArrayList<>();

        Person person1 = new Person();
        person1.setId(101L);
        person1.setName("Rodrigo");
        person1.setLastName("Imai");
        person1.setEmail("rodrigo.imai@usp.br");
        persons.add(person1);

        Person person2 = new Person();
        person2.setId(102L);
        person2.setName("Gabriel");
        person2.setLastName("Abarchely");
        person2.setEmail("gabriel@usp.br");
        persons.add(person2);

        Person person3 = new Person();
        person3.setId(103L);
        person3.setName("Marcelo");
        person3.setLastName("Scarton");
        person3.setEmail("marcelo@usp.br");
        persons.add(person3);

        Person person4 = new Person();
        person4.setId(104L);
        person4.setName("Yan");
        person4.setLastName("Kawakami");
        person4.setEmail("yan@usp.br");
        persons.add(person4);

        return persons;
    }
}
