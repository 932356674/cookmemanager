package com.qf.entity;

public class Attention {
    public Attention() {
    }

    public Attention(Integer id,Integer fansId, Integer attentionId, Integer status) {
        this.id = id;
        this.fansId = fansId;
        this.attentionId = attentionId;
        this.status = status;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attention.id
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */

    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attention.fans_id
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    private Integer fansId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attention.attention_id
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    private Integer attentionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attention.status
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attention.id
     *
     * @return the value of attention.id
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attention.id
     *
     * @param id the value for attention.id
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attention.fans_id
     *
     * @return the value of attention.fans_id
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public Integer getFansId() {
        return fansId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attention.fans_id
     *
     * @param fansId the value for attention.fans_id
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public void setFansId(Integer fansId) {
        this.fansId = fansId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attention.attention_id
     *
     * @return the value of attention.attention_id
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public Integer getAttentionId() {
        return attentionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attention.attention_id
     *
     * @param attentionId the value for attention.attention_id
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public void setAttentionId(Integer attentionId) {
        this.attentionId = attentionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attention.status
     *
     * @return the value of attention.status
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attention.status
     *
     * @param status the value for attention.status
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}