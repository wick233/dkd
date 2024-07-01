package com.dkd.manage.service.impl;

import java.util.List;
import com.dkd.common.utils.DateUtils;
import com.dkd.common.utils.SecurityUtils;
import com.dkd.manage.domain.vo.PartnerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dkd.manage.mapper.PartnerMapper;
import com.dkd.manage.domain.Partner;
import com.dkd.manage.service.IPartnerService;

/**
 * 合作商管理Service业务层处理
 * 
 * @author kang
 * @date 2024-06-30
 */
@Service
public class PartnerServiceImpl implements IPartnerService 
{
    @Autowired
    private PartnerMapper partnerMapper;

    /**
     * 查询合作商管理
     * 
     * @param id 合作商管理主键
     * @return 合作商管理
     */
    @Override
    public Partner selectPartnerById(Long id)
    {
        return partnerMapper.selectPartnerById(id);
    }

    /**
     * 查询合作商管理列表
     * 
     * @param partner 合作商管理
     * @return 合作商管理
     */
    @Override
    public List<Partner> selectPartnerList(Partner partner)
    {
        return partnerMapper.selectPartnerList(partner);
    }

    /**
     * 新增合作商管理
     * 
     * @param partner 合作商管理
     * @return 结果
     */
    @Override
    public int insertPartner(Partner partner)
    {
        //对新增的密码进行加密处理
        partner.setPassword(SecurityUtils.encryptPassword(partner.getPassword()));
        partner.setCreateTime(DateUtils.getNowDate());
        return partnerMapper.insertPartner(partner);
    }

    /**
     * 修改合作商管理
     * 
     * @param partner 合作商管理
     * @return 结果
     */
    @Override
    public int updatePartner(Partner partner)
    {
        partner.setUpdateTime(DateUtils.getNowDate());
        return partnerMapper.updatePartner(partner);
    }

    /**
     * 批量删除合作商管理
     * 
     * @param ids 需要删除的合作商管理主键
     * @return 结果
     */
    @Override
    public int deletePartnerByIds(Long[] ids)
    {
        return partnerMapper.deletePartnerByIds(ids);
    }

    /**
     * 删除合作商管理信息
     * 
     * @param id 合作商管理主键
     * @return 结果
     */
    @Override
    public int deletePartnerById(Long id)
    {
        return partnerMapper.deletePartnerById(id);
    }

    /**
     * 根据Partner对象查询合作伙伴信息。
     *
     * 本方法通过调用partnerMapper的selectPartneryVo方法，传递Partner对象来查询相应的合作伙伴信息。
     * 查询结果以List<PartnerVo>的形式返回，包含了满足条件的所有合作伙伴的详细信息。
     *
     * @param partner 查询条件对象，包含合作伙伴的各类条件信息。
     * @return 返回符合条件的合作伙伴信息列表，如果无匹配结果，则返回空列表。
     */
    @Override
    public List<PartnerVo> selectPartneryVo(Partner partner) {
        return partnerMapper.selectPartneryVo(partner);
    }

    /**
     * 根据合作伙伴ID删除重置密码记录。
     *
     * @param partner 合作伙伴的唯一标识符，用于指定要删除的重置密码记录。
     * @return 返回影响的行数，指示删除操作的结果。
     */
    @Override
    public int resetPwd(Partner partner) {
        return partnerMapper.deleteresetPwd(partner);
    }
}
