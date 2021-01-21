package com.demo.learn20200101.service.impl;

import com.demo.learn20200101.dao.domain.MusicInfo;
import com.demo.learn20200101.dao.mapper.MusicInfoMapper;
import com.demo.learn20200101.service.MusicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicInfoServiceImpl implements MusicInfoService {

    @Autowired
    private MusicInfoMapper musicInfoMapper;

    @Override
    public List<MusicInfo> getMusicInfo(MusicInfo musicInfo) {
        List<MusicInfo> musicInfos = musicInfoMapper.selectAll(null);
        return musicInfos;
    }
}
