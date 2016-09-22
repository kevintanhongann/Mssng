package android.com.mssng.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by kevintan on 22/09/2016.
 */

public class Person {
    private String status;
    private String firstname;
    private String lastname;
    private String nickname;
    private Date lastSeen;
    private String sex;
    private Date created;
    private Date updated;
    private float height;
    private float weight;
    private List<String> imageUrls;
//    private String race;
//    private String ethnicity;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public List<String> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

    @Override
    public String toString() {
        return "Person{" +
                "status='" + status + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", lastSeen=" + lastSeen +
                ", sex='" + sex + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                ", height=" + height +
                ", weight=" + weight +
                ", imageUrls=" + imageUrls +
                '}';
    }
}
