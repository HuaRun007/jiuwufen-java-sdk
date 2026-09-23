package com.jiuwufen.sdk.model.inventory;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import java.util.List;

/**
 * 批量库存同步请求，单项库存和绑定关系由平台分别处理
 */
@Data
public class InventorySyncRequest {
    
    /**
     * 详情
     */
    @SerializedName("detail")
    private List<InventorySyncItem> detail;

    
    /** 单个商家 SKU 的库存与批次信息 */
    @Data
    public static class InventorySyncItem {
        
        /**
         * 商家商品编码
         */
        @SerializedName("merchant_sku_code")
        private String merchantSkuCode;
        
        /**
         * SKU ID
         */
        @SerializedName("sku_id")
        private Long skuId;
        
        /**
         * 实际库存
         */
        @SerializedName("qty")
        private Long qty;

        /** 平台预占库存，可选 */
        @SerializedName("lock_qty")
        private Long lockQty;
        
        /**
         * 可售库存
         */
        @SerializedName("salable_qty")
        private Long salableQty;

        /** 美妆类目必填的批次号 */
        @SerializedName("batch_id")
        private String batchId;

        /** 到期时间，格式 yyyy-MM-dd HH:mm:ss */
        @SerializedName("expire_date")
        private String expireDate;

        /** 生产时间，格式 yyyy-MM-dd HH:mm:ss */
        @SerializedName("production_date")
        private String productionDate;

        /** 绑定关系维护类型，0 为平台维护，1 为商家维护 */
        @SerializedName("mapping_type")
        private Long mappingType;

        /** 成色，可选 */
        @SerializedName("is_new")
        private Long isNew;
    }
}
