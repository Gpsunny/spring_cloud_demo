package com.eagga.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Author:luoyujia
 * Date:2019/5/7
 * Description:todo
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {


    private Long id;
    private String Username;
    private String Password;
}
