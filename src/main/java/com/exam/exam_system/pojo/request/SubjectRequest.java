package com.exam.exam_system.pojo.request;

import java.util.Date;
import java.util.List;
import java.util.zip.DataFormatException;

/**
 * @Author :
 * @ClassName : subjectRequest
 * @Description :
 * @Date : 2020/3/23 14:46
 */
public class SubjectRequest {

    private Long id;

    private String subjectName;

    private Integer subjectStatus;

    private Date modifyTime;

    //配合批量操作
    private List<Long> ids;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Integer getSubjectStatus() {
        return subjectStatus;
    }

    public void setSubjectStatus(Integer subjectStatus) {
        this.subjectStatus = subjectStatus;
    }

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}
