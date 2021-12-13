/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author fdadebo
 */
public class User {

    private String email;
    private String firstName;
    private String lastName;
    private String password;

    /**
     * Constructor for User
     *
     * @param email a String with the user's email
     * @param firstName a String with the user's first name
     * @param lastName a String with the user's last name
     * @param password a String with the user's account password
     */
    public User(String email, String firstName, String lastName, String password) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    /**
     * Empty Constructor User
     */
    public User() {
        this.email = "";
        this.firstName = "";
        this.lastName = "";
        this.password = "";
    }

    /**
     * getter for email
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * setter for email
     *
     * @param email sets the String variable with user's email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * getter for first name
     *
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * setter for first name
     *
     * @param firstName sets String with user's first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * getter for last name
     *
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * setter for last name
     *
     * @param lastName sets String with user's last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * getter for password
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * setter for password
     *
     * @param password set String with user's password
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
