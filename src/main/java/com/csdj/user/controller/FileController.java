package com.csdj.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * @version 1.0
 * @ClassName FileController
 * @Author wuzl
 * @Date 2019/9/3
 **/
@Controller
@RequestMapping("/file")
public class FileController {
    @RequestMapping("/upload")
    public String upload(){
        return "fileupload";
    }

    @RequestMapping(value = "/doUpload",method = RequestMethod.POST)
    public String doUpload(@RequestParam MultipartFile file, HttpServletRequest req)throws IOException {
        String path = req.getServletContext().getRealPath("/");
        file.transferTo(new File(path+"upload/"+file.getOriginalFilename()));
        return "success" ;
    }
}
