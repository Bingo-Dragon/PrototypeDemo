/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: UploadUtil
 * Author:   bingo
 * Date:     2018/7/3 20:51
 * Description: 单文件上传
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.bingo.springmvc.util;

import com.alibaba.druid.support.json.JSONUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.IIOException;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static com.bingo.springmvc.util.ConvertUtils.byte2FitMemorySize;

/**
 * 〈一句话功能简述〉<br>
 * 〈文件上传〉
 *
 * @author bingo
 * @create 2018/7/3
 * @since 1.0.0
 */
public final class UploadUtil {


    /**
     * 单文件上传
     * @param file
     * @param request
     * @return
     * @throws IllegalStateException
     * @throws IOException
     */
    public static String simUpload(MultipartFile file, HttpServletRequest request) throws IllegalStateException, IOException {
        if(!file.isEmpty()){
            //获取服务器路径
            String path = request.getSession().getServletContext().getRealPath("/upload");
            //创建文件
            File parent = new File(path);
            if(!parent.exists()) parent.mkdirs();
            //存放文件信息集合
            HashMap<String, Object> map = new HashMap<String, Object>();
            String oldName = file.getOriginalFilename();
            Long size  = file.getSize();
            //获取文件大小
            String sizeString =byte2FitMemorySize(size);
            //获取文件后缀名
            String postfix = FileUtils.getFileExtension(oldName);
            //创建随机重命名
            String newFileName = FileUtils.getNewFileName(oldName,6,true);
            //长传路径
            String url = "upload/"+newFileName;
            //统一转换成File
            file.transferTo(new File(parent,newFileName));
            //添加文件信息
            map.put("oldName",oldName);
            map.put("newName",newFileName);
            map.put("postfix",postfix);
            map.put("size",size);
            map.put("url",url);
            //已json方式输出到页面
            return JSONUtils.toJSONString(map);

        }
        else{
            return null;
        }
    }

    public static List<HashMap<String,Object>> multiUpload(MultipartFile[] files, HttpServletRequest request) throws IOException {
        if (files.length > 0) {
            //获取服务器路径
            String path = request.getSession().getServletContext().getRealPath("/upload");
            //创建文件
            File parent = new File(path);
            if (!parent.exists()) parent.mkdirs();
            //存放文件信息集合list
            List<HashMap<String, Object>> fileInfoLsit = new ArrayList<HashMap<String, Object>>();
            //循环上传多个文件
            for (MultipartFile file : files) {
                //每个文件一个map保存信息
                HashMap<String, Object> map = new HashMap<String, Object>();
                String oldName = file.getOriginalFilename();
                Long size = file.getSize();
                //获取文件大小
                String sizeString = byte2FitMemorySize(size);
                //获取文件后缀名
                String postfix = FileUtils.getFileExtension(oldName);
                //创建随机重命名
                String newFileName = FileUtils.getNewFileName(oldName, 6, true);
                //长传路径
                String url = "upload/" + newFileName;
                //统一转换成File
                file.transferTo(new File(parent, newFileName));
                //添加文件信息
                map.put("oldName", oldName);
                map.put("newName", newFileName);
                map.put("postfix", postfix);
                map.put("size", size);
                map.put("url", url);
                fileInfoLsit.add(map);
            }

            return fileInfoLsit;


        }
        else{
            return null;
        }
    }

}