package com.exam.exam_system.mapper.examtypemapper;

import com.exam.exam_system.common.PageRequest;
import com.exam.exam_system.pojo.request.ExamTypeRequest;
import com.exam.exam_system.pojo.response.ExamTypeVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author :
 * @ClassName : ExamTypeMapper
 * @Description :
 * @Date : 2020/3/24 15:31
 */
public interface ExamTypeMapper {
    /**
     * @param examTypeRequest
     * @Author :
     * @Description : 添加考试类型
     * @Date : 2020/3/24 15:35
     * @Return :
     **/
    int insert(@Param("examTypeRequest") ExamTypeRequest examTypeRequest);

    /**
     * @param examTypeRequest
     * @Author :
     * @Description : 修改考试类型
     * @Date : 2020/3/24 15:56
     * @Return :
     **/
    int updateExamTypeById(@Param("examTypeRequest") ExamTypeRequest examTypeRequest);

    /**
     * @param examTypeRequest
     * @Author :
     * @Description : 查询所有考试类型(分页)
     * @Date : 2020/3/26 13:39
     * @Return :
     **/
    List<ExamTypeVO> selectExamTypeAll(@Param("examTypeRequest") ExamTypeRequest examTypeRequest, @Param("offset") int offset, @Param("limit") int limit);

    /**
     * @param examTypeRequest
     * @Author :
     * @Description :  查询所有考试类型总数
     * @Date : 2020/3/26 14:05
     * @Return :
     **/
    int selectExamTypeAllCount(@Param("examTypeRequest") ExamTypeRequest examTypeRequest);

    /**
     * @param examTypeId
     * @Author :
     * @Description : 通过选中的考试类型找出此次考试类型中包含的科目
     * @Date : 2020/3/26 15:36
     * @Return :
     **/
    String selectEaxmSubjectById(@Param("examTypeId") Long examTypeId);
}
