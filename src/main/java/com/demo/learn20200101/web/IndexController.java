package com.demo.learn20200101.web;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import com.demo.learn20200101.dao.domain.MusicInfo;
import com.demo.learn20200101.service.MusicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@NacosPropertySource(dataId = "com.demo.learn20200101.index", autoRefreshed = true)
public class IndexController {
    @Autowired
    MusicInfoService musicInfoService;

    @NacosValue(value = "${nacos.indexController.name:123}", autoRefreshed = true)
    private String name;

    @RequestMapping("/show")
    public String getIndex() {
        System.out.println("测试专用");
        return "index";
    }
    @RequestMapping("/show1")
    public String getIndex1() {
        System.out.println("测试专用");
        return "index1";
    }
    @RequestMapping("/music")
    @ResponseBody
    public List<MusicInfo> getMusicInfo(MusicInfo musicInfo) {
        List<MusicInfo> musicInfoList = musicInfoService.getMusicInfo(null);
        return musicInfoList;
    }

    @RequestMapping("/showNacos")
    @ResponseBody
    public String showNacos() {
        return name;
    }
}
