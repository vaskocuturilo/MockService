package info.testengineer.dataset;

import javax.persistence.*;


/**
 * The class Workers.
 */
@Entity
@NamedQueries(value = {
        @NamedQuery(name = "Workers.getAll", query = "SELECT w FROM Workers w")
})
public class Workers {


    /**
     * The private value id.
     */
    @Id
    @GeneratedValue
    private int id;

    /**
     * The private value firstName.
     */
    private String firstName;

    /**
     * The private value lastName.
     */
    private String lastName;

    /**
     * The private value department.
     */
    private String department;

    /**
     * The private value location.
     */
    private String location;

    /**
     * The default constructor.
     */
    public Workers() {
    }

    /**
     * The constructor.
     *
     * @param id         the id
     * @param firstName  the first name
     * @param lastName   the last name
     * @param department the department
     * @param location   the location
     */
    public Workers(int id, String firstName, String lastName, String department, String location) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.location = location;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets department.
     *
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets department.
     *
     * @param department the department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Gets location.
     *
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets location.
     *
     * @param location the location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Workers{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
