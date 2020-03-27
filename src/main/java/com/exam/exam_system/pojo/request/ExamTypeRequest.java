package com.exam.exam_system.pojo.request;

import java.util.Date;

public class ExamTypeRequest {

    private Long id;

    private String examName;

    private String examMold;

    private Date examTime;

    private Date examMinTime;

    private Date examMaxTime;

    private String subjectId;

    private String remark;

    private Integer status;

    private Date modifyTime;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public String getExamMold() {
        return examMold;
    }

    public void setExamMold(String examMold) {
        this.examMold = examMold;
    }

    public Date getExamTime() {
        return examTime;
    }

    public void setExamTime(Date examTime) {
        this.examTime = examTime;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getExamMinTime() {
        return examMinTime;
    }

    public void setExamMinTime(Date examMinTime) {
        this.examMinTime = examMinTime;
    }

    public Date getExamMaxTime() {
        return examMaxTime;
    }

    public void setExamMaxTime(Date examMaxTime) {
        this.examMaxTime = examMaxTime;
    }
}