package com.wlt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 魏霖涛
 * @since 2018/1/25 0025
 */
@RestController
@RequestMapping("/index")
public class IndexController {
    /**
     * 调试springmvc
     * @return
     */
    @RequestMapping("/test")
    public String test(){
        return "springmvc test success(调试成功)";
    }
}
