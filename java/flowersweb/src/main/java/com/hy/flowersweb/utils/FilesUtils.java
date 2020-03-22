package com.hy.flowersweb.utils;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Create By hy on 2020/2/25.
 */
public class FilesUtils {

    /**
     *
     * @param file 文件
     * @param filePath 文件存放路径
     * @param fileName 源文件名
     * @return
     */
    public static void upload(byte[] file, String filePath, String fileName) throws Exception {
        File targetFile = new File(filePath);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }

        FileOutputStream out = new FileOutputStream(filePath + fileName);
        out.write(file);
        out.flush();
        out.close();
    }
}
