package com.rubin.demo.web3.module1.mapper;

import com.rubin.demo.web3.module1.dto.CityDto;

/**
 *
 * Created by rubin on 17-2-15.
 */
public interface CityMapper {

    CityDto selectCityByName(String name);

}
