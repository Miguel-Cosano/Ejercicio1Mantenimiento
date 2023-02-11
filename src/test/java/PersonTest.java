import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Class used to test the Person class.
 *
 * @author Miguel Angel Cosano Ramirez
 */
class PersonTest {

    @Test
    void createPersonWithEmptyName() {
        assertThrows(IncorrectNameException.class, () -> new Person("", 20, "Male"));

    }

    @Test
    void createPersonWithNegativeAge() {
        assertThrows(IncorrectAgeException.class, () -> new Person("Prueba",-1,"Male"));
    }

    @Test
    void createPersonWithAgeGreaterThan120() {
        assertThrows(IncorrectAgeException.class, () -> new Person("Prueba",121,"Male"));
    }

    @Test
    void createPersonWithIncorrectGender() {
        assertThrows(IncorrectGenderException.class, () -> new Person("Prueba",1,"IncorrectGender"));

    }
    @Test
    void getEverageFromNullPersonList() {
        assertThrows(NullPersonListException.class, () -> Person.everageAgePerGender(null));
    }
    @Test
    void getEverageFromEmptyPersonList() {
        List<Person> personList = new ArrayList<>();
        double[] expectedValue = {0, 0};
        double[] obtainedValue = Person.everageAgePerGender(personList);
        assertArrayEquals(expectedValue, obtainedValue);
    }

    @Test
    void getEverageFromPersonListWithOneFemale() {
        List<Person> personList = new ArrayList<>();
        Person female = new Person("Test",24,"Female");
        personList.add(female);
        double[] expectedValue = {0, 24};
        double[] obtainedValue = Person.everageAgePerGender(personList);
        assertArrayEquals(expectedValue, obtainedValue);
    }

    @Test
    void getEverageFromPersonListWithOneMale() {
        List<Person> personList = new ArrayList<>();
        Person male = new Person("Test",24, "Male");
        personList.add(male);
        double[] expectedValue = {24, 0};
        double[] obtainedValue = Person.everageAgePerGender(personList);
        assertArrayEquals(expectedValue, obtainedValue);
    }

    @Test
    void getEverageFromPersonListWithTwoPeople() {
        List<Person> personList = new ArrayList<>();
        Person male = new Person("Test",24, "Male");
        Person female = new Person("Test",24, "Female");
        personList.add(female);
        personList.add(male);
        double[] expectedValue = {24, 24};
        double[] obtainedValue = Person.everageAgePerGender(personList);
        assertArrayEquals(expectedValue, obtainedValue);
    }

    @Test
    void getEverageFromPersonListWithThreePeople() {
        List<Person> personList = new ArrayList<>();
        Person male = new Person("Test",24, "Male");
        Person male2 = new Person("Test",26, "Male");
        Person female = new Person("Test",24, "Female");
        personList.add(female);
        personList.add(male);
        personList.add(male2);
        double[] expectedValue = {25, 24};
        double[] obtainedValue = Person.everageAgePerGender(personList);
        assertArrayEquals(expectedValue, obtainedValue);
    }

    @Test
    void getEverageFromPersonListWithFourPeople() {
        List<Person> personList = new ArrayList<>();
        Person male = new Person("Test",24, "Male");
        Person male2 = new Person("Test",26, "Male");
        Person female = new Person("Test",20, "Female");
        Person female2 = new Person("Test",10, "Female");
        personList.add(female);
        personList.add(male);
        personList.add(male2);
        personList.add(female2);
        double[] expectedValue = {25, 15};
        double[] obtainedValue = Person.everageAgePerGender(personList);
        assertArrayEquals(expectedValue, obtainedValue);
    }

    @Test
    void getEverageFromPersonListWithFivePeople() {
        List<Person> personList = new ArrayList<>();
        Person male = new Person("Test",24, "Male");
        Person male2 = new Person("Test",26, "Male");
        Person female = new Person("Test",20, "Female");
        Person female2 = new Person("Test",10, "Female");
        Person  female3 = new Person("Test", 90, "Female");
        personList.add(female);
        personList.add(male);
        personList.add(male2);
        personList.add(female2);
        personList.add(female3);
        double[] expectedValue = {25, 40};
        double[] obtainedValue = Person.everageAgePerGender(personList);
        assertArrayEquals(expectedValue, obtainedValue);
    }




}