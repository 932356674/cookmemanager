package com.qf.dto;

import com.qf.entity.User;

import java.util.Date;

public class BookCommentAll extends User {

    private Integer commentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_comment.book_id
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    private Integer bookId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_comment.us_id
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    private Integer usId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_comment.comment_value
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    private String commentValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_comment.comment_time
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    private Date commentTime;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    @Override
    public Integer getUsId() {
        return usId;
    }

    @Override
    public void setUsId(Integer usId) {
        this.usId = usId;
    }

    public String getCommentValue() {
        return commentValue;
    }

    public void setCommentValue(String commentValue) {
        this.commentValue = commentValue;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getBookDetails() {
        return bookDetails;
    }

    public void setBookDetails(String bookDetails) {
        this.bookDetails = bookDetails;
    }

    public String getBookComment() {
        return bookComment;
    }

    public void setBookComment(String bookComment) {
        this.bookComment = bookComment;
    }

    public Integer getBookPageview() {
        return bookPageview;
    }

    public void setBookPageview(Integer bookPageview) {
        this.bookPageview = bookPageview;
    }

    public Double getBookGrade() {
        return bookGrade;
    }

    public void setBookGrade(Double bookGrade) {
        this.bookGrade = bookGrade;
    }

    public Integer getBookCollect() {
        return bookCollect;
    }

    public void setBookCollect(Integer bookCollect) {
        this.bookCollect = bookCollect;
    }

    public String getBookImage() {
        return bookImage;
    }

    public void setBookImage(String bookImage) {
        this.bookImage = bookImage;
    }

    public Date getBookTime() {
        return bookTime;
    }

    public void setBookTime(Date bookTime) {
        this.bookTime = bookTime;
    }

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


}