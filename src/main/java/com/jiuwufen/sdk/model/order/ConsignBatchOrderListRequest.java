package com.jiuwufen.sdk.model.order;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * 自送货母单批次查询请求，按母单号分页查询
 */
@Data
public class ConsignBatchOrderListRequest {
    
    /**
     * 自送单母单批次号
     */
    @SerializedName("mother_no")
    private String motherNo;

    /** 页码，默认 1 */
    @SerializedName("page")
    private Integer page;

    /** 每页数量，最大 100 */
    @SerializedName("page_size")
    private Integer pageSize;
}
