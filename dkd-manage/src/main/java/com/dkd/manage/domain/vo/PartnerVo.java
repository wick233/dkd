package com.dkd.manage.domain.vo;

import com.dkd.manage.domain.Partner;
import lombok.Data;

/**
 * @author zhangyang
 * @date@date 2019/1/14
 * @Description 合作商的视图
 */
@Data
public class PartnerVo extends Partner {
    //点位数量数量
    private Integer nodeCount;

}
