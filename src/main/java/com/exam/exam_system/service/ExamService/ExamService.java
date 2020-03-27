package com.exam.exam_system.service.ExamService;

import com.exam.exam_system.common.PageRequest;
import com.exam.exam_system.common.PageResult;
import com.exam.exam_system.mapper.exammapper.ExamMapper;
import com.exam.exam_system.mapper.examtypemapper.ExamTypeMapper;
import com.exam.exam_system.pojo.request.ExamRequest;
import com.exam.exam_system.pojo.response.ExamVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author :
 * @ClassName : ExamService
 * @Description :
 * @Date : 2020/3/26 15:20
 */
@Transactional
@Service
public class ExamService {
    private ExamMapper examMapper;
    private ExamTypeMapper examTypeMapper;

    @Autowired
    public ExamService(ExamMapper examMapper, ExamTypeMapper examTypeMapper) {
        this.examMapper = examMapper;
        this.examTypeMapper = examTypeMapper;
    }

    /**
     * @param examRequest
     * @Author :
     * @Description : 报名参加考试
     * @Date : 2020/3/26 15:23
     * @Return :
     **/
    public int saveExam(ExamRequest examRequest) {
        //通过选中的考试类型找出此次考试类型中包含的科目
        String subject = examTypeMapper.selectEaxmSubjectById(examRequest.getExamTypeId());
        examRequest.setSubjectId(subject);
        examRequest.setStatus(1);
        return examMapper.insert(examRequest);
    }

    /**
     * @param examRequest
     * @Author :
     * @Description : 查询所有考试
     * @Date : 2020/3/26 16:14
     * @Return :
     **/
    public PageResult<List<ExamVO>> getExamAll(PageRequest<ExamRequest> examRequest) {
        List<ExamVO> examVOS = examMapper
                .selectExamAll(examRequest.getObj(), examRequest.getOffset(), examRequest.getLimit());

        return null;
    }
}
