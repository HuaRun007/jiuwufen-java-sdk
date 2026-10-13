package com.jiuwufen.sdk.model.delivery;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * 物流轨迹查询请求，按运单号查询并可指定倒序展示
 */
@Data
public class LogisticsQueryRequest {

    /** 运单号，必填 */
    @SerializedName("express_number")
    private String expressNumber;

    /** 是否倒序展示，未传时使用平台默认顺序 */
    @SerializedName("is_reverse")
    private Boolean isReverse;
}
