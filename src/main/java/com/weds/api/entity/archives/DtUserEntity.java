package com.weds.api.entity.archives;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import com.weds.core.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.Size;

public class DtUserEntity extends BaseEntity implements Serializable {
    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Long userSerial;

    /**
     *
     */
    @Size(max = 20)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String userNo;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String userLname;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String userFname;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "-1", value = "")
    private Integer userDep;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-05 09:55:43", value = "")
    private Date userWorkday;

    /**
     *
     */
    @Size(max = 20)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String userDuty;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String userCard;

    /**
     *
     */
    @Size(max = 20)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String userPassword;

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private Short userType;

    /**
     *
     */
    @Size(max = 8)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String userSex;

    /**
     *
     */
    @Size(max = 20)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String userNation;

    /**
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(required = true, dataType = "string", example = "2020-03-05 09:55:43", value = "")
    private Date userBirthday;

    /**
     *
     */
    @Size(max = 30)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String userId;

    /**
     *
     */
    @Size(max = 30)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String userTelephone;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String userAddress;

    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "test", value = "")
    private String userEmail;

    /**
     */
    private static final long serialVersionUID = 1L;

    private String keys;

    /**
     * This method returns the value of the database column dt_user.user_serial
     *
     * @return the value of dt_user.user_serial
     */
    public Long getUserSerial() {
        return userSerial;
    }

    /**
     */
    public DtUserEntity withUserSerial(Long userSerial) {
        this.setUserSerial(userSerial);
        return this;
    }

    /**
     * This method sets the value of the database column dt_user.user_serial
     *
     * @param userSerial the value for dt_user.user_serial
     */
    public void setUserSerial(Long userSerial) {
        this.userSerial = userSerial;
    }

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
    public DtUserEntity withUserNo(String userNo) {
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
    public DtUserEntity withUserLname(String userLname) {
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
    public DtUserEntity withUserFname(String userFname) {
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
    public DtUserEntity withUserDep(Integer userDep) {
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
    public DtUserEntity withUserWorkday(Date userWorkday) {
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
    public DtUserEntity withUserDuty(String userDuty) {
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
    public DtUserEntity withUserCard(String userCard) {
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
    public DtUserEntity withUserPassword(String userPassword) {
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
    public DtUserEntity withUserType(Short userType) {
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
    public DtUserEntity withUserSex(String userSex) {
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
    public DtUserEntity withUserNation(String userNation) {
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
    public DtUserEntity withUserBirthday(Date userBirthday) {
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
    public DtUserEntity withUserId(String userId) {
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
    public DtUserEntity withUserTelephone(String userTelephone) {
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
    public DtUserEntity withUserAddress(String userAddress) {
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
    public DtUserEntity withUserEmail(String userEmail) {
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

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }
}