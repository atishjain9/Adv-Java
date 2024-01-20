/**
This is an User Class
@author Atish Jain
@version 1.0
@param id id of the user
@param name name of the user
@return
*/
/**
 * The User class represents a user with an ID and a name.
 * This class provides methods to set and retrieve the user's ID and name.
 */
public class User {

    /**
     * The ID of the user.
     */
    private int id;

    /**
     * The name of the user.
     */
    private String name;

    /**
     * Default constructor for the User class.
     * Creates a new User with default values for ID (0) and name (null).
     */
    public User() {}

    /**
     * Parameterized constructor for the User class.
     * Creates a new User with the specified ID and name.
     *
     * @param id   The ID of the user.
     * @param name The name of the user.
     */
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Sets the ID of the user.
     *
     * @param id The new ID to set.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retrieves the ID of the user.
     *
     * @return The ID of the user.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the name of the user.
     *
     * @param name The new name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the name of the user.
     *
     * @return The name of the user.
     */
    public String getName() {
        return name;
    }
}
