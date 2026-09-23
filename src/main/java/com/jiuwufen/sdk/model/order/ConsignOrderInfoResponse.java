package com.jiuwufen.sdk.model.order;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import java.util.List;

/**
 * 寄售订单查询的 data 结果，公共状态由 CommonResponse 处理
 */
@Data
public class ConsignOrderInfoResponse {

    /**
     * 订单列表
     */
    @SerializedName("order_list")
    private List<OrderItem> orderList;


    /** 单笔寄售订单的商品、费用与交易信息 */
    @Data
    public static class OrderItem {

        /**
         * 卖家订单号
         */
        @SerializedName("sell_order_number")
        private String sellOrderNumber;

        /**
         * 商品统一代码
         */
        @SerializedName("upc")
        private String upc;

        /**
         * 商品信息
         */
        @SerializedName("goods_info")
        private GoodsInfo goodsInfo;

        /**
         * 状态
         */
        @SerializedName("status")
        private Integer status;

        /**
         * 子状态
         */
        @SerializedName("sub_status")
        private Integer subStatus;

        /**
         * 状态描述
         */
        @SerializedName("status_desc")
        private String statusDesc;

        /**
         * SKU 最低价（单位：分）
         */
        @SerializedName("sku_min_price")
        private Long skuMinPrice;

        /**
         * 价格（单位：分）
         */
        @SerializedName("price")
        private Long price;

        /**
         * 最终价格（单位：分）
         */
        @SerializedName("final_price")
        private Long finalPrice;

        /**
         * 总费用（单位：分）
         */
        @SerializedName("total_fees")
        private Long totalFees;

        /**
         * 费用明细
         */
        @SerializedName("fee_detail")
        private FeeDetail feeDetail;

        /**
         * 回收价格（单位：分）
         */
        @SerializedName("retrieve_price")
        private Long retrievePrice;

        /**
         * 是否包邮
         */
        @SerializedName("is_free_ship")
        private Integer isFreeShip;

        /**
         * 包邮信息
         */
        @SerializedName("free_ship_info")
        private FreeShipInfo freeShipInfo;

        /**
         * 发布时间
         */
        @SerializedName("publish_time")
        private String publishTime;

        /**
         * 图片列表
         */
        @SerializedName("img_list")
        private List<String> imgList;

        /**
         * 瑕疵列表
         */
        @SerializedName("flaw_list")
        private List<FlawItem> flawList;

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
         * IMEI 码
         */
        @SerializedName("imei")
        private String imei;

        /**
         * 买家价格（单位：分）
         */
        @SerializedName("buyer_price")
        private Long buyerPrice;

        /**
         * 卖家优惠券金额（单位：分）
         */
        @SerializedName("seller_coupon_amount")
        private Long sellerCouponAmount;

        /**
         * 满减金额（单位：分）
         */
        @SerializedName("full_reduction_amount")
        private Long fullReductionAmount;

        /**
         * 包邮金额（单位：分）
         */
        @SerializedName("free_shipping_amount")
        private Long freeShippingAmount;

        /**
         * 是否后置
         */
        @SerializedName("is_posterior")
        private Boolean isPosterior;

        /**
         * 后置状态
         */
        @SerializedName("posterior_status")
        private Integer posteriorStatus;

        /**
         * 促销信息列表
         */
        @SerializedName("promotion_info_list")
        private List<Object> promotionInfoList;

        /**
         * 账单价格（单位：分）
         */
        @SerializedName("bill_price")
        private Long billPrice;

        /**
         * 买家支付时间
         */
        @SerializedName("buyer_pay_time")
        private String buyerPayTime;

        /**
         * 买家下单时间
         */
        @SerializedName("buyer_create_time")
        private String buyerCreateTime;

        /**
         * 买家订单号
         */
        @SerializedName("buyer_order_number")
        private String buyerOrderNumber;
    }


    /** 寄售订单关联的商品信息 */
    @Data
    public static class GoodsInfo {

        /**
         * 商品图片
         */
        @SerializedName("img")
        private String img;

        /**
         * 商品标题
         */
        @SerializedName("title")
        private String title;

        /**
         * 一级类目名称
         */
        @SerializedName("root_category_name")
        private String rootCategoryName;

        /**
         * 子类目名称
         */
        @SerializedName("child_category_name")
        private String childCategoryName;

        /**
         * 属性值
         */
        @SerializedName("property_value")
        private String propertyValue;

        /**
         * 尺码
         */
        @SerializedName("size")
        private String size;

        /**
         * 品牌名称
         */
        @SerializedName("brand_name")
        private String brandName;

        /**
         * 成色
         */
        @SerializedName("quality")
        private String quality;

        /**
         * 状态
         */
        @SerializedName("status")
        private Integer status;

        /**
         * 规格
         */
        @SerializedName("specification")
        private String specification;
    }


    /** 平台包邮及运费补贴信息 */
    @Data
    public static class FreeShipInfo {

        /**
         * 原始运费（单位：分）
         */
        @SerializedName("origin_freight")
        private Long originFreight;

        /**
         * 补贴金额（单位：分）
         */
        @SerializedName("allowance_price")
        private Long allowancePrice;

        /**
         * 卖家运费（单位：分）
         */
        @SerializedName("seller_freight_price")
        private Long sellerFreightPrice;
    }

    /** 服务费明细，目前文档仅定义总费用和活动标记 */
    @Data
    public static class FeeDetail {
        /** 总费用，单位分 */
        @SerializedName("total_fees")
        private Integer totalFees;

        /** 是否参与活动 */
        @SerializedName("is_activity")
        private Integer isActivity;
    }

    /** 瑕疵图片与说明 */
    @Data
    public static class FlawItem {
        /** 瑕疵图片 */
        @SerializedName("img")
        private String img;

        /** 瑕疵说明 */
        @SerializedName("desc")
        private String desc;
    }
}
