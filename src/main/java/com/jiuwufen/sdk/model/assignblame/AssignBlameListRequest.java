package com.jiuwufen.sdk.model.assignblame;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * 数码判责单信息查询 (AssignBlameLst) 请求
 */
@Data
public class AssignBlameListRequest {

    /**
     * 查询开始时间，格式 yyyy-MM-dd HH:mm:ss
     */
    @SerializedName("start_time")
    private String startTime;

    /**
     * 查询结束时间，格式 yyyy-MM-dd HH:mm:ss
     */
    @SerializedName("end_time")
    private String endTime;

    /**
     * 页码
     */
    @SerializedName("page_id")
    private Integer pageId;

    /**
     * 每页数量
     */
    @SerializedName("page_size")
    private Integer pageSize;
}
