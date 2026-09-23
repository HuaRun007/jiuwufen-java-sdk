package com.jiuwufen.sdk.model.goods;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * 卖家接受还价请求，价格按平台要求以元传递
 */
@Data
public class BargainSuccessRequest {
    
    /**
     * 商品编号
     */
    @SerializedName("goods_sn")
    private String goodsSn;

    /** 买家还价最大价格，单位元 */
    @SerializedName("price")
    private Integer price;
}
