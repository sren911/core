package com.sren.core.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author: renshuai
 * @date: 2019/09/05 下午4:20
 * @Description:
 */
@Service
@Profile("java7")
public class Java7CalService implements CalService {
    @Override
    public Integer sum(Integer... vals) {
        Integer sum = 0;
        for (Integer val : vals) {
            sum += val;
        }
        return sum;
    }
}
