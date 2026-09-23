package com.jiuwufen.sdk.model.inventory;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import java.util.List;

/**
 * 库存查询的 data 结果，区分平台库存和外部可售库存
 */
@Data
public class InventoryListResponse {
    
    /**
     * 库存详情
     */
    @SerializedName("detail")
    private List<InventoryItem> detail;

    
    /** 单个商家 SKU 的库存详情 */
    @Data
    public static class InventoryItem {
        
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
         * 上架中库存
         */
        @SerializedName("available_qty")
        private Long availableQty;
        
        /**
         * 预占库存
         */
        @SerializedName("lock_qty")
        private Long lockQty;

        /** 外部可售库存 */
        @SerializedName("external_salable_qty")
        private Long externalSalableQty;
    }
}
