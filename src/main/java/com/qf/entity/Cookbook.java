package com.qf.entity;

import java.util.Date;

public class Cookbook {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cookbook.book_Id
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    private Integer bookId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cookbook.book_name
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    private String bookName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cookbook.type_id
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    private Integer typeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cookbook.us_id
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    private Integer usId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cookbook.book_details
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    private String bookDetails;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cookbook.book_comment
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    private String bookComment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cookbook.book_pageView
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    private Integer bookPageview;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cookbook.book_grade
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    private Double bookGrade;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cookbook.book_collect
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    private Integer bookCollect;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cookbook.book_image
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    private String bookImage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cookbook.book_time
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    private Date bookTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cookbook.book_Id
     *
     * @return the value of cookbook.book_Id
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public Integer getBookId() {
        return bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cookbook.book_Id
     *
     * @param bookId the value for cookbook.book_Id
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cookbook.book_name
     *
     * @return the value of cookbook.book_name
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cookbook.book_name
     *
     * @param bookName the value for cookbook.book_name
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cookbook.type_id
     *
     * @return the value of cookbook.type_id
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cookbook.type_id
     *
     * @param typeId the value for cookbook.type_id
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cookbook.us_id
     *
     * @return the value of cookbook.us_id
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public Integer getUsId() {
        return usId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cookbook.us_id
     *
     * @param usId the value for cookbook.us_id
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public void setUsId(Integer usId) {
        this.usId = usId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cookbook.book_details
     *
     * @return the value of cookbook.book_details
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public String getBookDetails() {
        return bookDetails;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cookbook.book_details
     *
     * @param bookDetails the value for cookbook.book_details
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public void setBookDetails(String bookDetails) {
        this.bookDetails = bookDetails == null ? null : bookDetails.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cookbook.book_comment
     *
     * @return the value of cookbook.book_comment
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public String getBookComment() {
        return bookComment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cookbook.book_comment
     *
     * @param bookComment the value for cookbook.book_comment
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public void setBookComment(String bookComment) {
        this.bookComment = bookComment == null ? null : bookComment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cookbook.book_pageView
     *
     * @return the value of cookbook.book_pageView
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public Integer getBookPageview() {
        return bookPageview;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cookbook.book_pageView
     *
     * @param bookPageview the value for cookbook.book_pageView
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public void setBookPageview(Integer bookPageview) {
        this.bookPageview = bookPageview;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cookbook.book_grade
     *
     * @return the value of cookbook.book_grade
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public Double getBookGrade() {
        return bookGrade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cookbook.book_grade
     *
     * @param bookGrade the value for cookbook.book_grade
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public void setBookGrade(Double bookGrade) {
        this.bookGrade = bookGrade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cookbook.book_collect
     *
     * @return the value of cookbook.book_collect
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public Integer getBookCollect() {
        return bookCollect;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cookbook.book_collect
     *
     * @param bookCollect the value for cookbook.book_collect
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public void setBookCollect(Integer bookCollect) {
        this.bookCollect = bookCollect;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cookbook.book_image
     *
     * @return the value of cookbook.book_image
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public String getBookImage() {
        return bookImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cookbook.book_image
     *
     * @param bookImage the value for cookbook.book_image
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public void setBookImage(String bookImage) {
        this.bookImage = bookImage == null ? null : bookImage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cookbook.book_time
     *
     * @return the value of cookbook.book_time
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public Date getBookTime() {
        return bookTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cookbook.book_time
     *
     * @param bookTime the value for cookbook.book_time
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public void setBookTime(Date bookTime) {
        this.bookTime = bookTime;
    }
}