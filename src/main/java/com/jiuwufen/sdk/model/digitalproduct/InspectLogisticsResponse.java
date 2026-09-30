package com.jiuwufen.sdk.model.digitalproduct;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * 3C后验物流响应；自送信息和快递信息按平台返回存在，不以空值伪装成功。
 * <p>字段取自旧爱果SDK 3.7.24已使用的协议；本模型不添加或修改任何调用逻辑。</p>
 * @author z7
 * @date 2026/09/30
 */
@Data
public class InspectLogisticsResponse {
    /** 实际配送方式；可为空，调用方须与请求及平台结果共同核对。 */
    @SerializedName("delivery_method")
    private Integer deliveryMethod;

    /** 本次商品数量；空值表示平台未提供，不能视作0。 */
    @SerializedName("total")
    private Integer total;

    /** 后验收件地址。 */
    @SerializedName("address_info")
    private PlatformDeliverResponse.AddressInfo addressInfo;

    /** 面单生成时间原文。 */
    @SerializedName("generate_time")
    private String generateTime;

    /** 自送信息，自送时按平台返回读取。 */
    @SerializedName("self_pickup_info")
    private SelfPickupInfo selfPickupInfo;

    /** 快递面单信息；复用相同字段协议，不复制路由和地址模型。 */
    @SerializedName("express_info")
    private PlatformDeliverResponse expressInfo;

    /**
     * 自送后验的提货凭据。
     * @author z7
     * @date 2026/09/30
     */
    @Data
    public static class SelfPickupInfo {
        /** 自送标题。 */
        @SerializedName("self_pickup_title")
        private String selfPickupTitle;
        /** 平台商户说明。 */
        @SerializedName("merchant_info")
        private String merchantInfo;
        /** 自提单号，保持字符串及前导零。 */
        @SerializedName("self_pickup_number")
        private String selfPickupNumber;
    }
}
