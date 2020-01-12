/**
 * FileName: CustomerController
 * Author:   zcc
 * Date:     2020/1/12 17:32
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ccz.xingtian.controller;

import com.ccz.xingtian.model.Customer;
import com.ccz.xingtian.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *〈〉
 *
 * @author zcc
 * @create 2020/1/12
 * @since 1.0.0
 */
@RestController
@RequestMapping("/v1")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/customer/query/{realName}")
    public List<Customer> findCustomerInfo(@PathVariable("realName")String realName) {
        return customerService.queryCustomerByRealName(realName);
    }

}

