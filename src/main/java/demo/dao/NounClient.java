package demo.dao;

import demo.domain.Word;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/5/30.
 */
@FeignClient("Noun")
public interface NounClient extends WordDao{
    @RequestMapping("/")
    Word getWord();
}
