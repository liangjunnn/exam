package com.exam.exam_system.mapper.timemapper;

import java.util.Date;

/**
 * @Author :
 * @ClassName : TimeMapper
 * @Description : 时间数据（统一用数据库时间为准）
 * @Date : 2020/3/22 11:49
 */
public interface TimeMapper {
    /**
     * 获取当前时间
     *
     * @return 当前时间
     */
    Date getTime();
}
