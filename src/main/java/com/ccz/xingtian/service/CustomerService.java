/**
 * FileName: CustomerService
 * Author:   zcc
 * Date:     2020/1/12 17:27
 * Description: 客户服务
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ccz.xingtian.service;

import com.ccz.xingtian.model.Customer;

import java.util.List;

/**
 *〈客户服务〉
 *
 * @author zcc
 * @create 2020/1/12
 * @since 1.0.0
 */
public interface CustomerService {

    List<Customer> queryCustomerByRealName(String realName);

}

