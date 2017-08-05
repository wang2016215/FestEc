package com.example.latte.ec.datebase;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by wanbin on 2017/7/30.
 */

@Entity(nameInDb = "user_profile")
public class UserProfile {


    private Long userId;
    private String name = null;
    private String avatar = null;
    private String gender = null;
    private String address = null;

    @Generated(hash = 515805345)
    public UserProfile(Long userId, String name, String avatar, String gender,
                       String address) {
        this.userId = userId;
        this.name = name;
        this.avatar = avatar;
        this.gender = gender;
        this.address = address;
    }

    @Generated(hash = 968487393)
    public UserProfile() {
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
