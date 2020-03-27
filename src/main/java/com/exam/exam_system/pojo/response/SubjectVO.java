package com.exam.exam_system.pojo.response;

/**
 * @Author :
 * @ClassName : subjectVO
 * @Description :
 * @Date : 2020/3/23 14:48
 */
public class SubjectVO {
    private Long id;

    private String subjectName;

    private Integer subjectStatus;

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
}
