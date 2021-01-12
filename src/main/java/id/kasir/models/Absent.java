package model;

import java.util.Date;

public class Absent {
    private int id;
    private User user;
    private int id_user;
    private long absenin;
    private long absenout;
    
    public Absent(User user) {
        this.user = user;
    }
    
    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the id_user
     */
    public int getId_user() {
        return id_user;
    }

    /**
     * @param id_user the id_user to set
     */
    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the absenin
     */
    public long getAbsenin() {
        return absenin;
    }

    /**
     * @param absenin the absenin to set
     */
    public void setAbsenin() {
        this.absenin = new Date().getTime();
    }

    /**
     * @return the absenout
     */
    public long getAbsenout() {
        return absenout;
    }

    /**
     * @param absenout the absenout to set
     */
    public void setAbsenout() {
        this.absenout = new Date().getTime();;
    }


}
