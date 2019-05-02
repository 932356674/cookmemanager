package com.qf.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class User {
    public User() {
    }

    public User(Integer usId, String usName, String usHead, Integer usFanscount, Integer usBookcount) {
        this.usId = usId;
        this.usName = usName;
        this.usHead = usHead;
        this.usFanscount = usFanscount;
        this.usBookcount = usBookcount;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.us_id
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */

    private Integer usId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.us_name
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    private String usName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.us_password
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    private String usPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.us_mobile
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    private Long usMobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.us_email
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    private String usEmail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.us_message
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    private String usMessage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.us_sex
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    private Integer usSex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.us_birthday
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date usBirthday;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.us_nowhome
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    private String usNowhome;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.us_job
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    private String usJob;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.us_head
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    private String usHead;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.us_fansCount
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    private Integer usFanscount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.us_bookCount
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    private Integer usBookcount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.us_createdate
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date usCreatedate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.us_id
     *
     * @return the value of user.us_id
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    public Integer getUsId() {
        return usId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.us_id
     *
     * @param usId the value for user.us_id
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    public void setUsId(Integer usId) {
        this.usId = usId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.us_name
     *
     * @return the value of user.us_name
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    public String getUsName() {
        return usName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.us_name
     *
     * @param usName the value for user.us_name
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    public void setUsName(String usName) {
        this.usName = usName == null ? null : usName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.us_password
     *
     * @return the value of user.us_password
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    public String getUsPassword() {
        return usPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.us_password
     *
     * @param usPassword the value for user.us_password
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    public void setUsPassword(String usPassword) {
        this.usPassword = usPassword == null ? null : usPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.us_mobile
     *
     * @return the value of user.us_mobile
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    public Long getUsMobile() {
        return usMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.us_mobile
     *
     * @param usMobile the value for user.us_mobile
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    public void setUsMobile(Long usMobile) {
        this.usMobile = usMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.us_email
     *
     * @return the value of user.us_email
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    public String getUsEmail() {
        return usEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.us_email
     *
     * @param usEmail the value for user.us_email
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    public void setUsEmail(String usEmail) {
        this.usEmail = usEmail == null ? null : usEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.us_message
     *
     * @return the value of user.us_message
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    public String getUsMessage() {
        return usMessage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.us_message
     *
     * @param usMessage the value for user.us_message
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    public void setUsMessage(String usMessage) {
        this.usMessage = usMessage == null ? null : usMessage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.us_sex
     *
     * @return the value of user.us_sex
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    public Integer getUsSex() {
        return usSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.us_sex
     *
     * @param usSex the value for user.us_sex
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    public void setUsSex(Integer usSex) {
        this.usSex = usSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.us_birthday
     *
     * @return the value of user.us_birthday
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    public Date getUsBirthday() {
        return usBirthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.us_birthday
     *
     * @param usBirthday the value for user.us_birthday
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    public void setUsBirthday(Date usBirthday) {
        this.usBirthday = usBirthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.us_nowhome
     *
     * @return the value of user.us_nowhome
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    public String getUsNowhome() {
        return usNowhome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.us_nowhome
     *
     * @param usNowhome the value for user.us_nowhome
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    public void setUsNowhome(String usNowhome) {
        this.usNowhome = usNowhome == null ? null : usNowhome.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.us_job
     *
     * @return the value of user.us_job
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    public String getUsJob() {
        return usJob;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.us_job
     *
     * @param usJob the value for user.us_job
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    public void setUsJob(String usJob) {
        this.usJob = usJob == null ? null : usJob.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.us_head
     *
     * @return the value of user.us_head
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    public String getUsHead() {
        return usHead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.us_head
     *
     * @param usHead the value for user.us_head
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    public void setUsHead(String usHead) {
        this.usHead = usHead == null ? null : usHead.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.us_fansCount
     *
     * @return the value of user.us_fansCount
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    public Integer getUsFanscount() {
        return usFanscount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.us_fansCount
     *
     * @param usFanscount the value for user.us_fansCount
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    public void setUsFanscount(Integer usFanscount) {
        this.usFanscount = usFanscount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.us_bookCount
     *
     * @return the value of user.us_bookCount
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    public Integer getUsBookcount() {
        return usBookcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.us_bookCount
     *
     * @param usBookcount the value for user.us_bookCount
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    public void setUsBookcount(Integer usBookcount) {
        this.usBookcount = usBookcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.us_createdate
     *
     * @return the value of user.us_createdate
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    public Date getUsCreatedate() {
        return usCreatedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.us_createdate
     *
     * @param usCreatedate the value for user.us_createdate
     *
     * @mbggenerated Tue Apr 09 21:23:38 CST 2019
     */
    public void setUsCreatedate(Date usCreatedate) {
        this.usCreatedate = usCreatedate;
    }

    @Override
    public String toString() {
        return "User{" +
                "usId=" + usId +
                ", usName='" + usName + '\'' +
                ", usPassword='" + usPassword + '\'' +
                ", usMobile=" + usMobile +
                ", usEmail='" + usEmail + '\'' +
                ", usMessage='" + usMessage + '\'' +
                ", usSex=" + usSex +
                ", usBirthday=" + usBirthday +
                ", usNowhome='" + usNowhome + '\'' +
                ", usJob='" + usJob + '\'' +
                ", usHead='" + usHead + '\'' +
                ", usFanscount=" + usFanscount +
                ", usBookcount=" + usBookcount +
                ", usCreatedate=" + usCreatedate +
                '}';
    }
}
