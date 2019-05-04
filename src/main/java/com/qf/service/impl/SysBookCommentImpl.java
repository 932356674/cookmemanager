package com.qf.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.dto.BookCommentAll;
import com.qf.entity.BookCommentExample;
import com.qf.mapper.BookCommentMapper;
import com.qf.service.SysBookComment;
import com.qf.utils.Pager;
import com.qf.utils.R;
import com.qf.utils.ResultData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class SysBookCommentImpl implements SysBookComment {

    @Resource
    private BookCommentMapper bookCommentMapper;
    @Override
    public ResultData selectBookComment(Pager pager) {

        PageHelper.offsetPage(pager.getOffset(),pager.getLimit());

        List<BookCommentAll> list = bookCommentMapper.selectBookComment();
        PageInfo info = new PageInfo(list);

        ResultData data = new ResultData(info.getTotal(),info.getList());

        return data;
    }

    @Override
    public R del(List<Integer> ids) {

        BookCommentExample example = new BookCommentExample();

        BookCommentExample.Criteria criteria = example.createCriteria();

        criteria.andBookIdIn(ids);

        for (Integer id : ids) {
            int i = bookCommentMapper.deleteById(id);
        }
        return R.ok();
    }

    @Override
    public List<Map<String, Object>> exportExcel() {
        return bookCommentMapper.findUserForExport();
    }
}


