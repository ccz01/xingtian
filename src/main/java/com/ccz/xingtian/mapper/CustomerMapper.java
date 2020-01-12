/**
 * FileName: CustomerMapper
 * Author:   zcc
 * Date:     2020/1/12 17:23
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ccz.xingtian.mapper;

import com.ccz.xingtian.model.Customer;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *〈〉
 *
 * @author zcc
 * @create 2020/1/12
 * @since 1.0.0
 */
@Repository
public interface CustomerMapper {

    @Select("select * from customer where real_name = #{realName}")
    List<Customer> queryCustomerByRealName(String realName);
}

