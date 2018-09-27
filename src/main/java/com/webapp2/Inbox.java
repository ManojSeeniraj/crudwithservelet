package com.webapp2;

/**
 * InnerInbox
 */


/**
 * Inbox
 */
public class Inbox {

    private String emailid;
    private String date;
    private String from;
    private String to;
    private String subject;
    private String message;

    Inbox() {
    }

    Inbox(String emailid, String date, String from, String to, String subject, String message) {
        this.emailid = emailid;
        this.date = date;
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.message = message;
    }


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
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the from
     */
    public String getFrom() {
        return from;
    }

    /**
     * @param from the from to set
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * @return the to
     */
    public String getTo() {
        return to;
    }

    /**
     * @param to the to to set
     */
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "EmailId"+emailid + ", date"+date + ", from"+from + ", to"+to + ",subject"+subject + ", message"+message;
    }
}