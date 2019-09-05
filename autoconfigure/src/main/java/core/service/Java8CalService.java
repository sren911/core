package core.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

/**
 * @author: renshuai
 * @date: 2019/09/05 下午4:21
 * @Description:
 */
@Service
@Profile("java8")
public class Java8CalService implements CalService {
    @Override
    public Integer sum(Integer... vals) {
        Integer sum = Stream.of(vals).reduce(0, Integer::sum);
        return sum;
    }
}
