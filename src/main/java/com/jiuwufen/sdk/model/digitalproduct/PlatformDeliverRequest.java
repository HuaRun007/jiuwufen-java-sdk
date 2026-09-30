package com.jiuwufen.sdk.model.digitalproduct;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * 3C普通订单发货及面单请求，对应platformDeliver协议，不等同于deliveryBiz。
 * <p>字段取自旧爱果SDK 3.7.24已使用的协议；本模型不添加或修改任何调用逻辑。</p>
 * @author z7
 * @date 2026/09/30
 */
@Data
public class PlatformDeliverRequest {
    /** 平台商品唯一编码；由源订单读取，不能传内部订单ID。 */
    @SerializedName("goods_sn")
    private String goodsSn;

    /** 卖家发货地址；复用同协议六字段地址模型。 */
    @SerializedName("address")
    private DigitalSuperSaleAddress address;

    /** 实际发货机器IMEI，保持字符串，不进行数值转换。 */
    @SerializedName("imei")
    private String imei;

}
