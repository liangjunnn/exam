package com.exam.exam_system.service.timeservice;

import com.exam.exam_system.mapper.timemapper.TimeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @Author :
 * @ClassName : TimeService
 * @Description : 时间服务
 * @Date : 2020/3/22 11:48
 */
@Service
@Transactional
public class TimeService {
    /**
     * 时间Mapper
     */
    private final TimeMapper timeMapper;

    @Autowired
    public TimeService(TimeMapper timeMapper) {
        this.timeMapper = timeMapper;
    }

    /**
     * 获取当前时间
     *
     * @return 当前时间
     */
    public Date getTime() {
        return timeMapper.getTime();
    }
}
