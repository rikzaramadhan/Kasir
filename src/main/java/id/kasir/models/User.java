package model;

public class User {
    private int id;
    private String nama;
    private String alamat;
    private long telfon;

    public User() {

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
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the telfon
     */
    public long getTelfon() {
        return telfon;
    }

    /**
     * @param telfon the telfon to set
     */
    public void setTelfon(long telfon) {
        this.telfon = telfon;
    }



}
