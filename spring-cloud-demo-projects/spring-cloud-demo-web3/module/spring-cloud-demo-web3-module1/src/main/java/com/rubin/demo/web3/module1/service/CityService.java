package com.rubin.demo.web3.module1.service;

import com.rubin.demo.web3.module1.dto.CityDto;
import com.rubin.demo.web3.module1.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * Created by rubin on 17-2-15.
 */
@Service
public class CityService {

    private CityMapper cityMapper;

    public CityDto getCity(String name) {
        return cityMapper.selectCityByName(name);
    }

    @Autowired
    public CityService(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

}
