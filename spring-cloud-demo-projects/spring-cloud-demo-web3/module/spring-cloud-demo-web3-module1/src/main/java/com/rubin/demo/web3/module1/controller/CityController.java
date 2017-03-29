package com.rubin.demo.web3.module1.controller;

import com.rubin.demo.web3.module1.dto.CityDto;
import com.rubin.demo.web3.module1.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * Created by rubin on 17-2-15.
 */
@Controller
public class CityController {

    private CityService cityService;

    @GetMapping("cities/{name}")
    public CityDto getCity(String name) {
        return cityService.getCity(name);
    }

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

}
