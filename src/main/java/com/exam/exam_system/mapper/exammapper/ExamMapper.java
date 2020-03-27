package com.exam.exam_system.mapper.exammapper;

import com.exam.exam_system.pojo.request.ExamRequest;
import com.exam.exam_system.pojo.response.ExamVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author :
 * @ClassName : ExamMapper
 * @Description :
 * @Date : 2020/3/26 15:24
 */
public interface ExamMapper {
    /**
     * @param examRequest
     * @Author :
     * @Description : 添加一条考试信息
     * @Date : 2020/3/26 15:28
     * @Return :
     **/
    int insert(@Param("examRequest") ExamRequest examRequest);

    /**
     * @param request
     * @param offset
     * @param limit
     * @Author :
     * @Description : 查询所有考试
     * @Date : 2020/3/26 16:17
     * @Return :
     **/
    List<ExamVO> selectExamAll(@Param("request") ExamRequest request, @Param("offset") int offset, @Param("limit") int limit);
}
