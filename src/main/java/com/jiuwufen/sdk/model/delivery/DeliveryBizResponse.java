package com.jiuwufen.sdk.model.delivery;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import java.util.List;

/**
 * 平台发货结果，data 中包含每笔订单的面单信息
 */
@Data
public class DeliveryBizResponse {
    
    /**
     * 发货信息列表
     */
    @SerializedName("list")
    private List<DeliveryItem> list;

    
    /** 单笔订单的快递与面单数据 */
    @Data
    public static class DeliveryItem {
        /** 95 卖家订单号 */
        @SerializedName("order_number")
        private String orderNumber;
        
        /**
         * 快递单号
         */
        @SerializedName("express_number")
        private String expressNumber;

        /** 快递名称 */
        @SerializedName("express_name")
        private String expressName;

        /** 二维码 */
        @SerializedName("two_dimension_code")
        private String twoDimensionCode;

        /** 一维码 */
        @SerializedName("dimension_code")
        private String dimensionCode;

        /** 目的地路由标签 */
        @SerializedName("dest_route_label")
        private String destRouteLabel;

        /** 网点编码 */
        @SerializedName("dept_code")
        private String deptCode;

        /** 发货地址信息 */
        @SerializedName("address_info")
        private DeliveryBizRequest.DeliveryAddress addressInfo;

        /** 商品标题 */
        @SerializedName("goods_title")
        private String goodsTitle;
    }
}
