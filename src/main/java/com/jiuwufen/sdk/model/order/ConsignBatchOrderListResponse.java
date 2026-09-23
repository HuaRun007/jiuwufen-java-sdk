package com.jiuwufen.sdk.model.order;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import java.util.List;

/**
 * 自送货母单批次查询结果，包含批次统计和订单核验明细
 */
@Data
public class ConsignBatchOrderListResponse {
    
    /**
     * 母单批次号
     */
    @SerializedName("mother_no")
    private String motherNo;

    /** 总订单数 */
    @SerializedName("total_order_count")
    private Integer totalOrderCount;

    /** 已核验订单数 */
    @SerializedName("verified_order_count")
    private Integer verifiedOrderCount;

    /** 未通过核验订单数 */
    @SerializedName("unverified_order_count")
    private Integer unverifiedOrderCount;

    /** 待核验订单数 */
    @SerializedName("pending_order_count")
    private Integer pendingOrderCount;

    /** 订单核验明细 */
    @SerializedName("order_list")
    private List<BatchOrderItem> orderList;

    
    /** 单笔自送货订单的核验结果 */
    @Data
    public static class BatchOrderItem {
        
        /**
         * 95 卖家订单号
         */
        @SerializedName("sell_order_number")
        private String sellOrderNumber;

        /** 商家商品编码 */
        @SerializedName("merchant_sku_code")
        private String merchantSkuCode;

        /** 核验时间戳 */
        @SerializedName("verification_time")
        private Long verificationTime;

        /** 核验结果 */
        @SerializedName("verification_result")
        private Integer verificationResult;

        /** 核验失败原因 */
        @SerializedName("verification_failure_reason")
        private String verificationFailureReason;

        /** 核验失败图片 */
        @SerializedName("verification_failure_image_url")
        private List<String> verificationFailureImageUrl;
    }
}
