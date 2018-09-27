package com.webapp2;

/**
 * UserDetails
 */

import java.util.List;

/**
 * UserDetail
 */
public class UserDetails {

    private String emailid;
    private List<Inbox> inboxes;
    private List<Contacts> contacts;

    UserDetails() {
    }

    UserDetails(String emailid, List<Inbox> inboxes, List<Contacts> contacts) {
        this.emailid= emailid;
        this.setInboxes(inboxes);
        this.contacts = contacts;
    }

    /**
     * @return the userid
     */
    /**
     * @return the emailid
     */
    public String getEmailid() {
        return emailid;
    }

    /**
     * @param emailid the emailid to set
     */
    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
    /**
     * @return the inboxes
     */
    public List<Inbox> getInboxes() {
        return inboxes;
    }

    /**
     * @param inboxes the inboxes to set
     */
    public void setInboxes(List<Inbox> inboxes) {
        this.inboxes = inboxes;
    }

    /**
     * @return the contacts
     */
    public List<Contacts> getContacts() {
        return contacts;
    }

    /**
     * @param contacts the contacts to set
     */
    public void setContacts(List<Contacts> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return emailid + inboxes.toString() + contacts;
    }
}