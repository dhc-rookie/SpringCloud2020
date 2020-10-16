package springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author denghanchen
 * @date 2020/9/18 10:55
 */

public interface PaymentService {
    public Integer create(@Param("payment") Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
