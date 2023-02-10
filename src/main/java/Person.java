import java.util.List;

/**
 * . Class representing a person with a name, age and gender.
 * .
 *
 * @author Miguel Angel Cosano Ramirez
 **/


public class Person {
    private final String name;

    private final int age;

    private final String gender; //male , female

    /**
     * Constructs a person with a name, age and gender.
     * .
     *
     * @param name   the nome of the person
     * @param age    the age of the person
     *               .
     * @param gender the gender of the person
     */

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    /**
     * Computes the average age of male and female persons in a List and returns the result in
     * on arroy of two elements (the first element is the male mean age and the second one is the
     * female mean age)
     * sum values contains the sum of the ages of males in case of sumMale
     * and the sum of ages of Females in case of sumFemale
     * num values contains the count of males in the case of numMale
     * and females in case of nunFemale
     *
     * @param persons return
     **/
    public double[] everageAgePerGender(List<Person> persons) {
        return null;
    }
}

