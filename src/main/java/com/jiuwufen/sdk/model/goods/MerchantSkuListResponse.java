package com.jiuwufen.sdk.model.goods;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import java.util.List;

/**
 * 商家绑定 SKU 查询结果，保留平台返回的类目、品牌和绑定信息
 */
@Data
public class MerchantSkuListResponse {
    
    /**
     * 总记录数
     */
    @SerializedName("total")
    private Long total;
    
    /**
     * SKU列表
     */
    @SerializedName("list")
    private List<SkuItem> list;

    
    /** 平台 SKU 及商家绑定关系 */
    @Data
    public static class SkuItem {
        
        /**
         * SKU ID
         */
        @SerializedName("sku_id")
        private Long skuId;
        
        /**
         * 标题
         */
        @SerializedName("title")
        private String title;

        /** 销售属性描述 */
        @SerializedName("property_value")
        private String propertyValue;

        /** 销售属性列表 */
        @SerializedName("sku_properties")
        private List<PropertyItem> skuProperties;
        
        /**
         * 货号
         */
        @SerializedName("code")
        private String code;

        /** 一级类目 ID */
        @SerializedName("root_category_id")
        private Long rootCategoryId;

        /** 一级类目名称 */
        @SerializedName("root_category_name")
        private String rootCategoryName;

        /** 二级类目 ID */
        @SerializedName("middle_category_id")
        private Long middleCategoryId;

        /** 二级类目名称 */
        @SerializedName("middle_category_name")
        private String middleCategoryName;

        /** 三级类目 ID */
        @SerializedName("child_category_id")
        private Long childCategoryId;

        /** 三级类目名称 */
        @SerializedName("child_category_name")
        private String childCategoryName;

        /** 品牌 ID */
        @SerializedName("brand_id")
        private Long brandId;

        /** 品牌名称 */
        @SerializedName("brand_name")
        private String brandName;

        /** SPU ID */
        @SerializedName("spu_id")
        private Long spuId;

        /** 商家商品编码 */
        @SerializedName("merchant_sku_code")
        private String merchantSkuCode;

        /** 绑定时间 */
        @SerializedName("bind_time")
        private String bindTime;

        /** 主图地址 */
        @SerializedName("img")
        private String img;
    }

    /** 单项销售属性 */
    @Data
    public static class PropertyItem {
        /** 属性名称 */
        @SerializedName("property_name")
        private String propertyName;

        /** 属性值 */
        @SerializedName("property_value")
        private String propertyValue;
    }
}
