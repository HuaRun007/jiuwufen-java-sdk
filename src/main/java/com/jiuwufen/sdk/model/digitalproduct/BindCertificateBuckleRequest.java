package com.jiuwufen.sdk.model.digitalproduct;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * 绑扣/更新绑扣 (BindCertificate) 请求（字段名与开放平台 JSON 一致）
 */
@Data
public class BindCertificateBuckleRequest {

    /** 平台商品编码；序列化为goods_sn，不替代原有字段。 */
    @SerializedName("goods_sn")
    private String goodsSn;

    @SerializedName("erpSkuId")
    private String erpSkuId;

    @SerializedName("antiFakeCode")
    private String antiFakeCode;

    @SerializedName("certificateNo")
    private String certificateNo;
}
