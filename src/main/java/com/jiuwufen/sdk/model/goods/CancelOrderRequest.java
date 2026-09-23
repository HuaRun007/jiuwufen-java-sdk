package com.jiuwufen.sdk.model.goods;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * 商品下架请求，后验强制下架时传入类型 1
 */
@Data
public class CancelOrderRequest {
    
    /**
     * 商品编号
     */
    @SerializedName("goods_sn")
    private String goodsSn;

    /** 仅 3C 寄售后验商品强制下架传 1 */
    @SerializedName("type")
    private Integer type;
}
