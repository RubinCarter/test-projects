package com.rubin.demo.web3.module1.dto;

import lombok.Data;

import java.io.Serializable;

/**
 *
 * Created by rubin on 17-2-15.
 */
@Data
public class CityDto implements Serializable {

    private String name;
    private Integer state;
    private String county;

}
