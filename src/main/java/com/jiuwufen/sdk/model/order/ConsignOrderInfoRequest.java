package com.jiuwufen.sdk.model.order;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import java.util.List;

/**
 * 寄售订单查询请求，可按商品、订单或批次定位并控制费用明细
 */
@Data
public class ConsignOrderInfoRequest {
    
    /**
     * 商品统一代码
     */
    @SerializedName("upc")
    private String upc;
    
    /**
     * 订单号
     */
    @SerializedName("order_number")
    private List<String> orderNumber;
    
    /**
     * 批次号
     */
    @SerializedName("batch_number")
    private String batchNumber;
    
    /**
     * 商品编号
     */
    @SerializedName("goods_sn")
    private String goodsSn;
    
    /**
     * 页码
     */
    @SerializedName("page")
    private Long page;
    
    /**
     * 每页数量
     */
    @SerializedName("page_size")
    private Long pageSize;

    /** 是否查询服务费，1 为查询 */
    @SerializedName("is_fee_detail")
    private Integer isFeeDetail;

    /** 是否查询取回费，1 为查询 */
    @SerializedName("is_retrieve")
    private Integer isRetrieve;
}
