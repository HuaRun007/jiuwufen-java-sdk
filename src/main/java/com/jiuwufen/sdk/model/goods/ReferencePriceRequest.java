package com.jiuwufen.sdk.model.goods;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import java.util.List;

/**
 * ReferencePriceRequest
 */
@Data
public class ReferencePriceRequest {

    /**
     * 商品编号
     */
    @SerializedName("goods_sn")
    private String goodsSn;

    /**
     * 卖家订单号
     */
    @SerializedName("order_number")
    private String orderNumber;

    /**
     * skuId
     */
    @SerializedName("sku_id")
    private Long skuId;

    /**
     * 成色
     */
    @SerializedName("is_new")
    private Long isNew;

    /**
     * 出售方式 （固定传：sale_type = 3）
     */
    @SerializedName("sale_type")
    private Integer saleType;
}