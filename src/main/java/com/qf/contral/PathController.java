package com.qf.contral;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PathController {

    @GetMapping("/{path}")
    public String getPath(@PathVariable("path") String path){
        return path;
    }
}
