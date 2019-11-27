package com.yyh.service;

import com.yyh.po.Status;

import java.util.List;

/**
 * @author 马梓健
 * @create 2019-11-21-15:06
 */
public interface StatusService {
    /**
     * 查询全部
     *
     * @return
     */
    List<Status> selectAll();

    /**
     * 根据id查询
     *
     * @param status_id
     * @return
     */
    Status selectOne(int status_id);

    /**
     * 增加
     *
     * @param status
     * @return
     */
    int insert(Status status);

    /**
     * 修改
     *
     * @param status
     * @return
     */
    int update(Status status);

    /**
     * 删除
     *
     * @param status_id
     * @return
     */
    int delete(int status_id);
}
