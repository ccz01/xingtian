/**
 * FileName: Customer
 * Author:   zcc
 * Date:     2020/1/12 15:26
 * Description: 客户信息
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ccz.xingtian.model;

import com.ccz.xingtian.enums.Education;
import lombok.Data;

/**
 *〈客户信息〉
 *
 * @author zcc
 * @create 2020/1/12
 * @since 1.0.0
 */
@Data
public class Customer {

    private Long id;

    /**
     * 姓名
     */
    private String realName;

    private String nickName;

    private Integer gender;

    private String idCardNum;

    private String birthday;

    private String phoneNum;

    private Education education;

    private String address;

}

