package com.dkd.manage.mapper;

import java.util.List;
import com.dkd.manage.domain.Partner;
import com.dkd.manage.domain.vo.PartnerVo;

/**
 * 合作商管理Mapper接口
 * 
 * @author kang
 * @date 2024-06-30
 */
public interface PartnerMapper 
{
    /**
     * 查询合作商管理
     * 
     * @param id 合作商管理主键
     * @return 合作商管理
     */
    public Partner selectPartnerById(Long id);

    /**
     * 查询合作商管理列表
     * 
     * @param partner 合作商管理
     * @return 合作商管理集合
     */
    public List<Partner> selectPartnerList(Partner partner);

    /**
     * 新增合作商管理
     * 
     * @param partner 合作商管理
     * @return 结果
     */
    public int insertPartner(Partner partner);

    /**
     * 修改合作商管理
     * 
     * @param partner 合作商管理
     * @return 结果
     */
    public int updatePartner(Partner partner);

    /**
     * 删除合作商管理
     * 
     * @param id 合作商管理主键
     * @return 结果
     */
    public int deletePartnerById(Long id);

    /**
     * 批量删除合作商管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePartnerByIds(Long[] ids);

    /**
    * 查询并返回根据指定Partner对象匹配的合作伙伴信息列表。
    *
    * @param partner 用于筛选合作伙伴的条件对象，包含相关查询条件。
    * @return 匹配的合作伙伴信息列表，类型为PartnerVo的List集合。如果没有符合的记录，将返回一个空列表。
    */
    public List<PartnerVo> selectPartneryVo(Partner partner);

    /**
     * 根据用户ID删除重置密码记录。
     *
     * @param partner 用户的唯一标识ID，用于定位需要删除的重置密码记录。
     * @return 操作结果，一般情况下，1表示成功，0或负数表示失败或异常。
     */
    public int deleteresetPwd(Partner partner);

}
