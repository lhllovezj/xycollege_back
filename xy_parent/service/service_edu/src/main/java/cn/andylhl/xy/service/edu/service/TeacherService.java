package cn.andylhl.xy.service.edu.service;

import cn.andylhl.xy.service.edu.entity.Teacher;
import cn.andylhl.xy.service.edu.entity.vo.TeacherQueryVO;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 讲师 服务类
 * </p>
 *
 * @author lhl
 * @since 2021-01-29
 */
public interface TeacherService extends IService<Teacher> {

    /**
     * 执行分页, 返回分页对象信息
     * @param page
     * @param limit
     * @param teacherQueryVO
     * @return
     */
    Page<Teacher> selectPage(Long page, Long limit, TeacherQueryVO teacherQueryVO);

    /**
     * 根据左关键词查询讲师名字列表
     * @param key
     * @return
     */
    List<Map<String, Object>> getNameListByKey(String key);

    /**
     * 删除讲师头像
     * @param id
     */
    Boolean removeAvatarById(String id);

    /**
     * 根据id获取讲师及其主讲课程信息
     * @param id
     * @return
     */
    Map<String, Object> getTeacherInfoandCourseInfoById(String id);

    /**
     * 获取首页4个热门讲师（sort字段排序的前4个）
     * @return
     */
    List<Teacher> getHotTeacherList();
}
