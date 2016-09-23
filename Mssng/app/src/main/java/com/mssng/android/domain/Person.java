package com.mssng.android.domain;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.google.firebase.database.IgnoreExtraProperties;

import java.util.Date;

/**
 * Created by kevintan on 22/09/2016.
 */
@IgnoreExtraProperties
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
    private String lastSeen;
    @Bindable
    private String sex;
    @Bindable
    private String created;
    @Bindable
    private String updated;
    @Bindable
    private String height;
    @Bindable
    private String weight;
    @Bindable
    private String imageUrls;

    @Bindable
    private String latitude;

    @Bindable
    private String longitude;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
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

    public String getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(String lastSeen) {
        this.lastSeen = lastSeen;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(String imageUrls) {
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
