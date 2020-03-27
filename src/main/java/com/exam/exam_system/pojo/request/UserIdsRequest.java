package com.exam.exam_system.pojo.request;

import java.util.List;

/**
 * @Author :
 * @ClassName : UserIdsRequest
 * @Description : 批量删除学生请求
 * @Date : 2020/3/22 17:15
 */
public class UserIdsRequest {
    private List<Long> userIds;

    public List<Long> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<Long> userIds) {
        this.userIds = userIds;
    }
}
