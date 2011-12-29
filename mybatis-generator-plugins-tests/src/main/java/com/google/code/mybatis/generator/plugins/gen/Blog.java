package com.google.code.mybatis.generator.plugins.gen;

public class Blog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_BLOG.ID
     *
     * @mbggenerated Wed Nov 30 10:19:04 CET 2011
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_BLOG.NAME
     *
     * @mbggenerated Wed Nov 30 10:19:04 CET 2011
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_BLOG.URL
     *
     * @mbggenerated Wed Nov 30 10:19:04 CET 2011
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_BLOG.DESCRIPTION
     *
     * @mbggenerated Wed Nov 30 10:19:04 CET 2011
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_BLOG.OWNER_ID
     *
     * @mbggenerated Wed Nov 30 10:19:04 CET 2011
     */
    private Long ownerId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_BLOG.ID
     *
     * @return the value of T_BLOG.ID
     *
     * @mbggenerated Wed Nov 30 10:19:04 CET 2011
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_BLOG.ID
     *
     * @param id the value for T_BLOG.ID
     *
     * @mbggenerated Wed Nov 30 10:19:04 CET 2011
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_BLOG.NAME
     *
     * @return the value of T_BLOG.NAME
     *
     * @mbggenerated Wed Nov 30 10:19:04 CET 2011
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_BLOG.NAME
     *
     * @param name the value for T_BLOG.NAME
     *
     * @mbggenerated Wed Nov 30 10:19:04 CET 2011
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_BLOG.URL
     *
     * @return the value of T_BLOG.URL
     *
     * @mbggenerated Wed Nov 30 10:19:04 CET 2011
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_BLOG.URL
     *
     * @param url the value for T_BLOG.URL
     *
     * @mbggenerated Wed Nov 30 10:19:04 CET 2011
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_BLOG.DESCRIPTION
     *
     * @return the value of T_BLOG.DESCRIPTION
     *
     * @mbggenerated Wed Nov 30 10:19:04 CET 2011
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_BLOG.DESCRIPTION
     *
     * @param description the value for T_BLOG.DESCRIPTION
     *
     * @mbggenerated Wed Nov 30 10:19:04 CET 2011
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_BLOG.OWNER_ID
     *
     * @return the value of T_BLOG.OWNER_ID
     *
     * @mbggenerated Wed Nov 30 10:19:04 CET 2011
     */
    public Long getOwnerId() {
        return ownerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_BLOG.OWNER_ID
     *
     * @param ownerId the value for T_BLOG.OWNER_ID
     *
     * @mbggenerated Wed Nov 30 10:19:04 CET 2011
     */
    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }
}