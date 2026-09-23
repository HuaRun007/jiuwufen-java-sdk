package com.jiuwufen.sdk.model.goods;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import java.util.List;

/**
 * 类目属性查询的 data 结果，包含属性选项与必填标记
 */
@Data
public class QueryPropertiesResponse {
    
    /**
     * 属性列表
     */
    @SerializedName("list")
    private List<PropertyItem> list;

    
    /** 类目下单个可填属性 */
    @Data
    public static class PropertyItem {
        
        /**
         * 属性ID
         */
        @SerializedName("id")
        private Long id;
        
        /**
         * 属性名
         */
        @SerializedName("name")
        private String name;
        
        /**
         * 属性类型
         */
        @SerializedName("property_type")
        private Integer propertyType;

        /** 可选属性值，多个值由平台字符串表示 */
        @SerializedName("value_options")
        private String valueOptions;
        
        /**
         * 是否必填
         */
        @SerializedName("is_required")
        private Integer isRequired;
    }
}
