
import java.sql.Date;

public class Post {
    
    private int userId;
    private String username;
    private String Password;
    private String email;
    private Boolean levelUser;
    private String idBarang;
    private String name;
    private int price;
    private int Stock;
    private Boolean info;
    private int published;
    private long publishedAt;
    private long createdAt;
    private long updatedAt;

    
    public int getUserId() {
        return this.userId;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public String getPassword() {
        return this.Password;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public Boolean getLevelUser() {
        return this.levelUser;
    }
    
    public String getIdBarang() {
        return this.idBarang;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getPrice() {
        return this.price;
    }
    
    public int getStock() {
        return this.Stock;
    }
    
    public Boolean getInfo() {
        return this.info;
    }
    
    public int getPublished() {
        return this.published;
    }

    public long getPublishedAt() {
        return this.publishedAt;
    }

    public long getCreatedAt() {
        return this.createdAt;
    }

    public long getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setLevelUser(Boolean levelUser) {
        this.levelUser = levelUser;
    }
    
    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    
    public void setStock(int Stock) {
        this.Stock = Stock;
    }
    
    public void setInfo(Boolean info) {
        this.info = info;
    }
    
    public void setPublished(int published) {
        this.published = published;
    }

    public void setPublishedAt(long publishedAt) {
        this.publishedAt = publishedAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }
}
