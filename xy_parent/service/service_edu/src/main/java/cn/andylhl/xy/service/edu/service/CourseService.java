package cn.andylhl.xy.service.edu.service;

import cn.andylhl.xy.service.base.dto.CourseDTO;
import cn.andylhl.xy.service.edu.entity.Course;
import cn.andylhl.xy.service.edu.entity.form.CourseInfoForm;
import cn.andylhl.xy.service.edu.entity.vo.*;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author lhl
 * @since 2021-01-29
 */
public interface CourseService extends IService<Course> {

    /**
     * 保存课程基本信息
     * @param courseInfoForm
     * @return
     */
    String saveCourseInfo(CourseInfoForm courseInfoForm);

    /**
     * 根据id查询课程基本信息
     * @param id
     * @return
     */
    CourseInfoForm getCourseInfoById(String id);

    /**
     * 更新课程信息
     * @param courseInfoForm
     */
    void updateCourseInfo(CourseInfoForm courseInfoForm);

    /**
     * 分页查询（关键词可选）
     * @param page
     * @param limit
     * @param courseQueryVO
     * @return
     */
    Page<CourseVO> selectPage(Long page, Long limit, CourseQueryVO courseQueryVO);

    /**
     * 删除课程封面
     * @param id
     */
    Boolean removeCoverById(String id);

    /**
     * 删除课程相关数据（数据库层面）
     * @param id
     * @return
     */
    Boolean removeCourseById(String id);

    /**
     * 获取课程发布基本信息
     * @param id
     * @return
     */
    CoursePublishVO getCoursePublishInfo(String id);

    /**
     * 发布课程
     * @param id
     * @return
     */
    Boolean publishCourse(String id);

    /**
     * 根据courseId删除该课程下的所有视频
     * @param id
     */
    void removeMediaByCourseId(String id);

    /**
     * 网站端课程列表查询（参数可选）
     * @return
     */
    List<Course> webGetCourseList(WebCourseQueruVO webCourseQueruVO);

    /**
     * 查询课程信息和讲师信息
     * @param id
     * @return
     */
    WebCourseVO webGetWebCourseVOById(String id);

    /**
     * 获取首页热门8个课程（浏览量最高的8个）
     * @return
     */
    List<Course> getHotCourseList();

    /**
     * 根据id获取订单中需要的课程信息和讲师信息
     * @param courseId
     * @return
     */
    CourseDTO getCourseDTO(String courseId);

    /**
     * 更新课程销量
     * @param courseId
     * @return
     */
    boolean updateCourseBuyCount(String courseId);
}
