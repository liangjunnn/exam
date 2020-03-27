package com.exam.exam_system.pojo.request;

import java.util.Date;

/**
 * @Author :
 * @ClassName : ExamRequest
 * @Description :
 * @Date : 2020/3/26 15:13
 */
public class ExamRequest {

    private Long id;


    private Long userId;


    private String subjectId;


    private Long examTypeId;


    private Integer status;


    private Date createTime;

    private Date createMinTime;

    private Date createMaxTime;


    private Date modifyTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public Long getExamTypeId() {
        return examTypeId;
    }

    public void setExamTypeId(Long examTypeId) {
        this.examTypeId = examTypeId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Date getCreateMinTime() {
        return createMinTime;
    }

    public void setCreateMinTime(Date createMinTime) {
        this.createMinTime = createMinTime;
    }

    public Date getCreateMaxTime() {
        return createMaxTime;
    }

    public void setCreateMaxTime(Date createMaxTime) {
        this.createMaxTime = createMaxTime;
    }
}
