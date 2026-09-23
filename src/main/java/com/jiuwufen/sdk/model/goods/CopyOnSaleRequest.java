package com.jiuwufen.sdk.model.goods;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * 复制订单上架请求，使用新旧商品编号区分两笔订单
 */
@Data
public class CopyOnSaleRequest {
    
    /**
     * 原商品编号
     */
    @SerializedName("old_goods_sn")
    private String oldGoodsSn;

    /** 新商品编号 */
    @SerializedName("new_goods_sn")
    private String newGoodsSn;

    /** 新订单价格，单位元 */
    @SerializedName("price")
    private Integer price;
}
