package com.firstapplication.rokto.model;

public class User {
    String name, bloodgroup, id, email, nid, phone,profilepictureurl,search,type,donationtime;

    public User(){

    }




    public User(String name, String bloodgroup, String id, String email, String nid, String phone, String profilepictureurl, String search, String type, String donationtime) {
        this.name = name;
        this.bloodgroup = bloodgroup;
        this.id = id;
        this.email = email;
        this.nid = nid;
        this.phone = phone;
        this.profilepictureurl = profilepictureurl;
        this.search = search;
        this.type = type;
        this.donationtime = donationtime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProfilepictureurl() {
        return profilepictureurl;
    }

    public void setProfilepictureurl(String profilepictureurl) {
        this.profilepictureurl = profilepictureurl;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDonationtime() {
        return donationtime;
    }

    public void setDonationtime(String donationtime) {
        this.donationtime = donationtime;
    }

}
