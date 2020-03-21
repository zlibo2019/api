package com.weds.api.entity.archives;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

public class InsertDtUserEntity implements Serializable {

    /**
     *
     */
    @Size(max = 20)
    @ApiModelProperty(required = true, dataType = "string", example = "001", value = "")
    private String userNo;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "张三", value = "")
    private String userLname;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = false, dataType = "string", example = "一组", value = "")
    private String userFname;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "10000", value = "")
    private Integer userDep;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @ApiModelProperty(required = false, dataType = "string", example = "2020-03-05", value = "")
    private Date userWorkday;

    /**
     *
     */
    @Size(max = 20)
    @ApiModelProperty(required = false, dataType = "string", example = "班长", value = "")
    private String userDuty;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = false, dataType = "string", example = "12823FB45", value = "")
    private String userCard;

    /**
     *
     */
    @Size(max = 20)
    @ApiModelProperty(required = false, dataType = "string", example = "00000000", value = "")
    private String userPassword;

    /**
     *
     */
    @ApiModelProperty(required = false, dataType = "integer", example = "0", value = "")
    private Short userType;

    /**
     *
     */
    @Size(max = 8)
    @ApiModelProperty(required = false, dataType = "string", example = "男", value = "")
    private String userSex;

    /**
     *
     */
    @Size(max = 20)
    @ApiModelProperty(required = false, dataType = "string", example = "汉", value = "")
    private String userNation;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @ApiModelProperty(required = false, dataType = "string", example = "2020-03-05", value = "")
    private Date userBirthday;

    /**
     *
     */
    @Size(max = 30)
    @ApiModelProperty(required = false, dataType = "string", example = "37025487885452521", value = "")
    private String userId;

    /**
     *
     */
    @Size(max = 30)
    @ApiModelProperty(required = false, dataType = "string", example = "13111111111", value = "")
    private String userTelephone;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = false, dataType = "string", example = "烟台", value = "")
    private String userAddress;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = false, dataType = "string", example = "abc@163.com", value = "")
    private String userEmail;

    /**
     * This method returns the value of the database column dt_user.user_no
     *
     * @return the value of dt_user.user_no
     */
    public String getUserNo() {
        return userNo;
    }

    /**
     */
    public InsertDtUserEntity withUserNo(String userNo) {
        this.setUserNo(userNo);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_no
     *
     * @param userNo the value for dt_user.user_no
     */
    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    /**
     * This method returns the value of the database column dt_user.user_lname
     *
     * @return the value of dt_user.user_lname
     */
    public String getUserLname() {
        return userLname;
    }

    /**
     */
    public InsertDtUserEntity withUserLname(String userLname) {
        this.setUserLname(userLname);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_lname
     *
     * @param userLname the value for dt_user.user_lname
     */
    public void setUserLname(String userLname) {
        this.userLname = userLname;
    }

    /**
     * This method returns the value of the database column dt_user.user_fname
     *
     * @return the value of dt_user.user_fname
     */
    public String getUserFname() {
        return userFname;
    }

    /**
     */
    public InsertDtUserEntity withUserFname(String userFname) {
        this.setUserFname(userFname);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_fname
     *
     * @param userFname the value for dt_user.user_fname
     */
    public void setUserFname(String userFname) {
        this.userFname = userFname;
    }

    /**
     * This method returns the value of the database column dt_user.user_dep
     *
     * @return the value of dt_user.user_dep
     */
    public Integer getUserDep() {
        return userDep;
    }

    /**
     */
    public InsertDtUserEntity withUserDep(Integer userDep) {
        this.setUserDep(userDep);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_dep
     *
     * @param userDep the value for dt_user.user_dep
     */
    public void setUserDep(Integer userDep) {
        this.userDep = userDep;
    }

    /**
     * This method returns the value of the database column dt_user.user_workday
     *
     * @return the value of dt_user.user_workday
     */
    public Date getUserWorkday() {
        return userWorkday;
    }

    /**
     */
    public InsertDtUserEntity withUserWorkday(Date userWorkday) {
        this.setUserWorkday(userWorkday);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_workday
     *
     * @param userWorkday the value for dt_user.user_workday
     */
    public void setUserWorkday(Date userWorkday) {
        this.userWorkday = userWorkday;
    }

    /**
     * This method returns the value of the database column dt_user.user_duty
     *
     * @return the value of dt_user.user_duty
     */
    public String getUserDuty() {
        return userDuty;
    }

    /**
     */
    public InsertDtUserEntity withUserDuty(String userDuty) {
        this.setUserDuty(userDuty);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_duty
     *
     * @param userDuty the value for dt_user.user_duty
     */
    public void setUserDuty(String userDuty) {
        this.userDuty = userDuty;
    }

    /**
     * This method returns the value of the database column dt_user.user_card
     *
     * @return the value of dt_user.user_card
     */
    public String getUserCard() {
        return userCard;
    }

    /**
     */
    public InsertDtUserEntity withUserCard(String userCard) {
        this.setUserCard(userCard);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_card
     *
     * @param userCard the value for dt_user.user_card
     */
    public void setUserCard(String userCard) {
        this.userCard = userCard;
    }

    /**
     * This method returns the value of the database column dt_user.user_password
     *
     * @return the value of dt_user.user_password
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     */
    public InsertDtUserEntity withUserPassword(String userPassword) {
        this.setUserPassword(userPassword);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_password
     *
     * @param userPassword the value for dt_user.user_password
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * This method returns the value of the database column dt_user.user_type
     *
     * @return the value of dt_user.user_type
     */
    public Short getUserType() {
        return userType;
    }

    /**
     */
    public InsertDtUserEntity withUserType(Short userType) {
        this.setUserType(userType);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_type
     *
     * @param userType the value for dt_user.user_type
     */
    public void setUserType(Short userType) {
        this.userType = userType;
    }

    /**
     * This method returns the value of the database column dt_user.user_sex
     *
     * @return the value of dt_user.user_sex
     */
    public String getUserSex() {
        return userSex;
    }

    /**
     */
    public InsertDtUserEntity withUserSex(String userSex) {
        this.setUserSex(userSex);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_sex
     *
     * @param userSex the value for dt_user.user_sex
     */
    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    /**
     * This method returns the value of the database column dt_user.user_nation
     *
     * @return the value of dt_user.user_nation
     */
    public String getUserNation() {
        return userNation;
    }

    /**
     */
    public InsertDtUserEntity withUserNation(String userNation) {
        this.setUserNation(userNation);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_nation
     *
     * @param userNation the value for dt_user.user_nation
     */
    public void setUserNation(String userNation) {
        this.userNation = userNation;
    }

    /**
     * This method returns the value of the database column dt_user.user_birthday
     *
     * @return the value of dt_user.user_birthday
     */
    public Date getUserBirthday() {
        return userBirthday;
    }

    /**
     */
    public InsertDtUserEntity withUserBirthday(Date userBirthday) {
        this.setUserBirthday(userBirthday);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_birthday
     *
     * @param userBirthday the value for dt_user.user_birthday
     */
    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    /**
     * This method returns the value of the database column dt_user.user_id
     *
     * @return the value of dt_user.user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     */
    public InsertDtUserEntity withUserId(String userId) {
        this.setUserId(userId);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_id
     *
     * @param userId the value for dt_user.user_id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method returns the value of the database column dt_user.user_telephone
     *
     * @return the value of dt_user.user_telephone
     */
    public String getUserTelephone() {
        return userTelephone;
    }

    /**
     */
    public InsertDtUserEntity withUserTelephone(String userTelephone) {
        this.setUserTelephone(userTelephone);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_telephone
     *
     * @param userTelephone the value for dt_user.user_telephone
     */
    public void setUserTelephone(String userTelephone) {
        this.userTelephone = userTelephone;
    }

    /**
     * This method returns the value of the database column dt_user.user_address
     *
     * @return the value of dt_user.user_address
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     */
    public InsertDtUserEntity withUserAddress(String userAddress) {
        this.setUserAddress(userAddress);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_address
     *
     * @param userAddress the value for dt_user.user_address
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    /**
     * This method returns the value of the database column dt_user.user_email
     *
     * @return the value of dt_user.user_email
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     */
    public InsertDtUserEntity withUserEmail(String userEmail) {
        this.setUserEmail(userEmail);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_email
     *
     * @param userEmail the value for dt_user.user_email
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}