package com.jiuwufen.sdk.model.order;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import java.util.List;

/**
 * 挂售订单查询请求，一次最多查询 20 个商品编号
 */
@Data
public class GetOrderListRequest {
    
    /**
     * 商品编号列表，最多 20 个
     */
    @SerializedName("goods_sn_list")
    private List<String> goodsSnList;
}
