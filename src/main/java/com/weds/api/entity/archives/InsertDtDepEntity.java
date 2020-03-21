package com.weds.api.entity.archives;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Size;
import java.io.Serializable;

public class InsertDtDepEntity implements Serializable {

    /**
     *
     */
    @ApiModelProperty(required = true, dataType = "integer", example = "10000", value = "父部门序号")
    private Integer depParent;


    /**
     *
     */
    @Size(max = 50)
    @ApiModelProperty(required = true, dataType = "string", example = "人事部", value = "部门名称")
    private String depName;


    /**
     */
    private static final long serialVersionUID = 1L;



    /**
     * This method returns the value of the database column dt_dep.dep_parent
     *
     * @return the value of dt_dep.dep_parent
     */
    public Integer getDepParent() {
        return depParent;
    }

    /**
     */
    public InsertDtDepEntity withDepParent(Integer depParent) {
        this.setDepParent(depParent);
        return this;
    }

    /**
     * This method sets the value of the database column dt_dep.dep_parent
     *
     * @param depParent the value for dt_dep.dep_parent
     */
    public void setDepParent(Integer depParent) {
        this.depParent = depParent;
    }


    /**
     * This method returns the value of the database column dt_dep.dep_name
     *
     * @return the value of dt_dep.dep_name
     */
    public String getDepName() {
        return depName;
    }

    /**
     */
    public InsertDtDepEntity withDepName(String depName) {
        this.setDepName(depName);
        return this;
    }

    /**
     * This method sets the value of the database column dt_dep.dep_name
     *
     * @param depName the value for dt_dep.dep_name
     */
    public void setDepName(String depName) {
        this.depName = depName;
    }

}