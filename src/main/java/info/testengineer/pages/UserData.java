package info.testengineer.pages;

import lombok.Getter;

@Getter
/**
 * The class User data.
 */
public class UserData {

    /**
     * The private value and getter name.
     */
    private String name;

    /**
     * The private value and getter address.
     */
    private String address;

    /**
     * The private value and getter postcode.
     */
    private String postcode;

    /**
     * The private value and getter email.
     */
    private String email;

    /**
     * The default constructor.
     */
    public UserData() {
        super();
        //empty
        return;
    }
}
