package com.exam.exam_system.controller.examTypeController;

import com.alibaba.fastjson.JSON;
import com.exam.exam_system.common.PageRequest;
import com.exam.exam_system.common.PageResult;
import com.exam.exam_system.common.Result;
import com.exam.exam_system.controller.BaseController;
import com.exam.exam_system.pojo.request.ExamTypeRequest;
import com.exam.exam_system.pojo.response.ExamTypeVO;
import com.exam.exam_system.service.examTypeService.ExamTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author :
 * @ClassName : ExamTypeController
 * @Description : 考试类型控制器
 * @Date : 2020/3/24 15:19
 */
@RestController
@RequestMapping("/examtype")
public class ExamTypeController extends BaseController {

    private ExamTypeService examTypeService;

    @Autowired
    public ExamTypeController(ExamTypeService examTypeService) {
        this.examTypeService = examTypeService;
    }

    /**
     * @param examTypeRequest
     * @Author :
     * @Description : 添加考试类型
     * @Date : 2020/3/24 15:26
     * @Return :
     **/
    @PostMapping("/saveExamType")
    public Result<Object> saveExamType(@RequestBody ExamTypeRequest examTypeRequest) {
        logger.info("添加考试类型:{}", JSON.toJSONString(examTypeRequest));
        examTypeService.addExamType(examTypeRequest);
        return new Result<Object>();
    }

    /**
     * @param examTypeRequest
     * @Author :
     * @Description : 修改考试类型
     * @Date : 2020/3/24 15:54
     * @Return :
     **/
    @PostMapping("/modifyExamType")
    public Result<Object> modifyExamType(@RequestBody ExamTypeRequest examTypeRequest) {
        logger.info("修改考试类型:{}", JSON.toJSONString(examTypeRequest));
        examTypeService.modifyExamTypeById(examTypeRequest);
        return new Result<Object>();
    }

    /**
     * @param examTypeRequest
     * @Author :
     * @Description : 查询考试类型(分页)
     * @Date : 2020/3/24 16:16
     * @Return :
     **/
    @PostMapping("/queryExamTypeAll")
    public PageResult<List<ExamTypeVO>> queryExamTypeAll(@RequestBody PageRequest<ExamTypeRequest> examTypeRequest) {
        logger.info("查询考试类型:{}", JSON.toJSONString(examTypeRequest));
        PageResult<List<ExamTypeVO>> examTypeAll = examTypeService.findExamTypeAll(examTypeRequest);
        logger.info("查询考试类型返回:{}", JSON.toJSONString(examTypeAll));
        return new PageResult<List<ExamTypeVO>>(examTypeAll.getPageNo(), examTypeAll.getPageSize(), examTypeAll.getTotal(), examTypeAll.getObj());
       }

}
