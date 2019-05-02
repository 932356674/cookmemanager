package com.qf.controller;

import com.qf.dto.BookCommentAll;
import com.qf.service.SysBookComment;
import com.qf.utils.Lg;
import com.qf.utils.Pager;
import com.qf.utils.R;
import com.qf.utils.ResultData;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

@RestController
public class SysBookCommentController {

    @Resource
    private SysBookComment sysBookComment;

    @RequestMapping("/sys/user/bookcomment")
    public ResultData selectBookComment(Pager pager){
        return  sysBookComment.selectBookComment(pager);
    }

    @RequestMapping("/sys/bookcomment/del")
    public R del(@RequestBody List<Integer> ids){
        return sysBookComment.del(ids);
    }

    @RequestMapping("/bookcomment/exportExcel")
    public void export(HttpServletResponse response){
        try {
            response.setContentType("application/octet-stream");//任何类型都能响应
            String filename = "cookme评论管理.xls";
            filename = URLEncoder.encode(filename,"utf-8");
            response.setHeader("content-disposition","attachment;filename="+filename);
            List<Map<String,Object>> list = sysBookComment.exportExcel();
            Workbook workbook = new HSSFWorkbook();//空的excel文件
            Sheet sheet = workbook.createSheet("cookme科技有限公司");
            String titles = "commentId,commentValue,usId,bookId,commentTime";
            for (int i = 0; i < list.size(); i++) {
                Row row = sheet.createRow(i);//行
                String t[] = titles.split(",");
                Map<String,Object> map = list.get(i);
                for (int j = 0; j < t.length; j++) {
                    Cell cell = row.createCell(j);
                    cell.setCellValue(map.get(t[j])+"");
                }
            }

            OutputStream os = response.getOutputStream();
            workbook.write(os);
            os.flush();
            Lg.log("导出成功");
        } catch (Exception e) {
            e.printStackTrace();
            Lg.log("导出失败");
        }

    }

}
