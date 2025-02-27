package com.wapgyj.paymentservice.mapper;

import com.wapgyj.paymentservice.model.Payment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wapGYJ
 * @since 2025-02-10
 */
@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {

}
