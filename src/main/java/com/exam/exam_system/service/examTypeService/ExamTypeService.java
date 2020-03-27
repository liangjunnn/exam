package com.exam.exam_system.service.examTypeService;

import com.exam.exam_system.common.PageRequest;
import com.exam.exam_system.common.PageResult;
import com.exam.exam_system.mapper.examtypemapper.ExamTypeMapper;
import com.exam.exam_system.mapper.timemapper.TimeMapper;
import com.exam.exam_system.pojo.request.ExamTypeRequest;
import com.exam.exam_system.pojo.response.ExamTypeVO;
import com.exam.exam_system.service.subjectservice.SubjectService;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author :
 * @ClassName : ExamTypeService
 * @Description :
 * @Date : 2020/3/24 15:28
 */
@Transactional
@Service
public class ExamTypeService {

    private ExamTypeMapper examTypeMapper;

    private TimeMapper timeMapper;

    private SubjectService subjectService;

    @Autowired
    public ExamTypeService(ExamTypeMapper examTypeMapper, TimeMapper timeMapper, SubjectService subjectService) {
        this.examTypeMapper = examTypeMapper;
        this.timeMapper = timeMapper;
        this.subjectService = subjectService;
    }


    /**
     * @param examTypeRequest
     * @Author :
     * @Description :  添加考试类型
     * @Date : 2020/3/24 15:30
     * @Return :
     **/
    public int addExamType(ExamTypeRequest examTypeRequest) {
        return examTypeMapper.insert(examTypeRequest);
    }


    /**
     * @param examTypeRequest
     * @Author :
     * @Description : 修改考试类型
     * @Date : 2020/3/24 15:55
     * @Return :
     **/
    public int modifyExamTypeById(ExamTypeRequest examTypeRequest) {
        examTypeRequest.setModifyTime(timeMapper.getTime());
        return examTypeMapper.updateExamTypeById(examTypeRequest);
    }

    /**
     * @param examTypeRequest
     * @Author :
     * @Description :  查询所有考试类型
     * @Date : 2020/3/24 16:18
     * @Return :
     **/
    public PageResult<List<ExamTypeVO>> findExamTypeAll(PageRequest<ExamTypeRequest> examTypeRequest) {
        List<ExamTypeVO> examTypeVOS = examTypeMapper
                .selectExamTypeAll(examTypeRequest.getObj(), examTypeRequest.getOffset(), examTypeRequest.getLimit());
        if (CollectionUtils.isNotEmpty(examTypeVOS)) {
            for (ExamTypeVO examTypeVO : examTypeVOS) {
                List<String> subjectIdList = new ArrayList<>();
                if (examTypeVO.getSubjectId().contains(",")) {
                    String[] subjectIds = examTypeVO.getSubjectId().split(",");
                    subjectIdList = Arrays.asList(subjectIds);
                    List<String> subjectName = subjectService.batchGetSubjectName(subjectIdList);
                    examTypeVO.setSubjectName(subjectName);
                } else {
                    subjectIdList.add(examTypeVO.getSubjectId());
                    List<String> subjectName = subjectService.batchGetSubjectName(subjectIdList);
                    examTypeVO.setSubjectName(subjectName);
                }
            }
        }
        int count = examTypeMapper.selectExamTypeAllCount(examTypeRequest.getObj());
        return new PageResult<List<ExamTypeVO>>(examTypeRequest.getPageNo(), examTypeRequest.getPageSize(), count, examTypeVOS);
    }
}
