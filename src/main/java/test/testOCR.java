package test;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

/**
 * @Author: tant
 * @Date: 2022/6/15 9:39
 */
public class testOCR {
    public static void main(String[] args) throws TesseractException {
        //如果未将tessdata放在根目录下需要指定绝对路径
        String path = "F:\\practiceWorkspace\\OCR\\src\\main\\resources\\";
        ITesseract instance = new Tesseract();
        //设置训练库的位置
        instance.setDatapath(path + "testdata");

        //如果需要识别英文之外的语种，需要指定识别语种，并且需要将对应的语言包放进项目中
        // chi_sim ：简体中文， eng    根据需求选择语言库
        instance.setLanguage("chi_sim");

        // 指定识别图片
        File img = new File(path + "/imgs/9026e1efa0f03296d6620f69e3ea7ac.jpg");
        long startTime = System.currentTimeMillis();
        String result = instance.doOCR(img).replaceAll(" ","");

        // 输出识别结果
        long endTime = System.currentTimeMillis();
        System.out.println("识别结果: \n" + result + "\n 耗时：" + (endTime - startTime) + "ms");
    }
}
