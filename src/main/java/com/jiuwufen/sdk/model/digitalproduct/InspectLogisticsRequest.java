package com.jiuwufen.sdk.model.digitalproduct;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import java.util.List;

/**
 * 3C后验物流请求，对应inspectLogisticsQuery协议。
 * <p>字段取自旧爱果SDK 3.7.24已使用的协议；本模型不添加或修改任何调用逻辑。</p>
 * @author z7
 * @date 2026/09/30
 */
@Data
public class InspectLogisticsRequest {
    /** 本次商品唯一编码集合；调用方须限定同租户及批次大小，平台容量上限待文档确认。 */
    @SerializedName("goods_sn_arr")
    private List<String> goodsSnArr;

    /** 已有运单号；补打复用原号，不在模型内生成新单号。 */
    @SerializedName("express_number")
    private String expressNumber;

    /** 配送方式；旧链路使用1自送、2平台快递、3自行寄送，具体适用条件由调用方核验。 */
    @SerializedName("delivery_method")
    private Integer deliveryMethod;

    /** 平台物流类型编码，沿用平台契约，不按ERP物流ID替代。 */
    @SerializedName("express_type")
    private Integer expressType;

    /** 旧协议可选地址文本；保持String，不擅自改为地址对象。 */
    @SerializedName("address")
    private String address;

}
