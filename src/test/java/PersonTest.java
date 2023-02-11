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
    Person person;


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
    void getEverageFromEmptyPersonList() {

    }

    @Test
    void getEverageFromPersonListWithOnePerson() {
        List<Person> personList = new ArrayList<>();
        double[] expectedValue = {0, 0};
        double[] obtainedValue = Person.everageAgePerGender(personList);
        assertArrayEquals(expectedValue, obtainedValue);
    }

    @Test
    void getEverageFromPersonListWithTwoPerson() {
    }


}