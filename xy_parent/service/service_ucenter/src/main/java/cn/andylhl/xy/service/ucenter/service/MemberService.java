package cn.andylhl.xy.service.ucenter.service;

import cn.andylhl.xy.service.base.dto.MemberDTO;
import cn.andylhl.xy.service.ucenter.entity.Member;
import cn.andylhl.xy.service.ucenter.entity.vo.LoginVO;
import cn.andylhl.xy.service.ucenter.entity.vo.RegisterVO;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 会员表 服务类
 * </p>
 *
 * @author lhl
 * @since 2021-03-02
 */
public interface MemberService extends IService<Member> {

    /**
     * 会员注册
     * @param registerVO
     */
    void register(RegisterVO registerVO);

    /**
     * 会员登录
     * @param loginVO
     * @return
     */
    String login(LoginVO loginVO);

    /**
     * 根据openid获取会员对象
     * @param openid
     * @return
     */
    Member getByOpenId(String openid);

    /**
     * 根据id获取订单中需要的会员信息
     * @param memberId
     * @return
     */
    MemberDTO getMemberDTO(String memberId);

    /**
     * 根据日期统计注册人数
     * @param day
     * @return
     */
    Integer countRegisterNum(String day);

    /**
     * 分页展示用户信息
     * @param page
     * @param limit
     * @return
     */
    Page<Member> selectPage(Long page, Long limit);

    /**
     * 修改用户禁用状态
     * @param id
     * @param disabled
     * @return
     */
    boolean updateMemberDisabled(String id, Boolean disabled);
}
