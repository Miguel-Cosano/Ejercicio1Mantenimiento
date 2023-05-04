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
     *
     * Considers the following exceptions:
     * IncorrectNameException if the name is empty
     * IncorrectAgeException if the age is negative or greater than 120
     * IncorrectGenderException if the gender is not equal to female or male
     */

    public Person(String name, int age, String gender) {
        if (!gender.toLowerCase().equals("male") && !gender.toLowerCase().equals("female")) {
            throw new IncorrectGenderException("Incorrect gender");
        }

        if (age < 0 || age > 120) {
            throw new IncorrectAgeException("Incorrect age");
        }

        if (name.equals("")) {
            throw new IncorrectNameException("Name cannot be empty");
        }

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
    public static double[] everageAgePerGender(List<Person> persons) {
        //if (persons == null) {
        //    throw new NullPersonListException("List cannot be null");
        //}
        int sumFemale = 0;
        int numFemale = 0;

        int sumMale = 0;
        int numMale = 0;
        for (Person p : persons) {
            if (p.gender.equals("Male")) {
                sumMale += p.age;
                numMale += 1;
            } else {
                sumFemale += p.age;
                numFemale += 1;
            }
        }
        double[] res = new double[2];
        if (numMale == 0) {
            res[0] = 0;
        } else {
            res[0] = sumMale / numMale;
        }
        if (numFemale == 0) {
            res[1] = 0;
        } else {
            res[1] = sumFemale / numFemale;
        }

        return res;

    }
}

