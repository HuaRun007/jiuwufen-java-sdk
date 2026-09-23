package com.jiuwufen.sdk.model.goods;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * 查询类目下可鉴别品牌，二级类目可选
 */
@Data
public class GetBrandIdentifyAbilityRequest {
    
    /**
     * 一级类目ID
     */
    @SerializedName("l1_category_id")
    private Long l1CategoryId;

    /** 二级类目 ID，可选 */
    @SerializedName("l2_category_id")
    private Integer l2CategoryId;
    
    /**
     * 品牌名称
     */
    @SerializedName("brand_name")
    private String brandName;
}
