package com.lmj.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: RedisProperty
 * Description:
 * date: 2020/3/29 15:46
 *
 * @author MJ
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RedisProperty {

    private String key;
    private String value;
}
