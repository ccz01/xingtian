/**
 * FileName: Education
 * Author:   zcc
 * Date:     2020/1/12 16:23
 * Description: 学历
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ccz.xingtian.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *〈学历〉
 *
 * @author zcc
 * @create 2020/1/12
 * @since 1.0.0
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum Education {

    DOCTOR(0, "博士及以上"),
    POST_GRADUATE(1, "研究生"),
    UNDER_GRADUATE(2, "本科"),
    COLLEGE(3, "大专"),
    HIGH_SCHOOL(4, "高中或中专"),
    MIDDLE_SCHOOL(5, "初中"),
    PRIMARY_SCHOOL(6, "小学"),
    ILLITERACY(7, "文盲或半文盲");

    private Integer code;

    private String description;

}
