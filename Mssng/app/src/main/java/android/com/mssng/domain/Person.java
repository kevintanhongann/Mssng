package android.com.mssng.domain;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import java.util.Date;
import java.util.List;

/**
 * Created by kevintan on 22/09/2016.
 */

public class Person  extends BaseObservable{
    @Bindable
    private String status;
    @Bindable
    private String firstname;
    @Bindable
    private String lastname;
    @Bindable
    private String nickname;
    @Bindable
    private Date lastSeen;
    @Bindable
    private String sex;
    @Bindable
    private Date created;
    @Bindable
    private Date updated;
    @Bindable
    private float height;
    @Bindable
    private float weight;
    @Bindable
    private List<String> imageUrls;

    private Double latitude;

    private Double longitude;

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

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
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
