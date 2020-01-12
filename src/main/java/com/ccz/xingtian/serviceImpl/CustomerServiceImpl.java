/**
 * FileName: CustomerServiceImpl
 * Author:   zcc
 * Date:     2020/1/12 17:28
 * Description: 客户服务实现类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ccz.xingtian.serviceImpl;

import com.ccz.xingtian.mapper.CustomerMapper;
import com.ccz.xingtian.model.Customer;
import com.ccz.xingtian.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *〈客户服务实现类〉
 *
 * @author zcc
 * @create 2020/1/12
 * @since 1.0.0
 */
@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public List<Customer> queryCustomerByRealName(String realName) {
        List<Customer> customers = customerMapper.queryCustomerByRealName(realName);
        log.info("查询到的客户{}", customers);
        return customers;
    }
}

