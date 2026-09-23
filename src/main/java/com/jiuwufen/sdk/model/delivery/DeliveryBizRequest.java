package com.jiuwufen.sdk.model.delivery;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import java.util.List;

/**
 * 平台发货请求，包含卖家订单号和发货地址
 */
@Data
public class DeliveryBizRequest {
    
    /**
     * 订单号
     */
    @SerializedName("order_number")
    private String orderNumber;
    
    /**
     * 发货地址
     */
    @SerializedName("send_address")
    private DeliveryAddress sendAddress;

    
    /** 平台面单使用的卖家发货地址 */
    @Data
    public static class DeliveryAddress {
        
        /**
         * 姓名
         */
        @SerializedName("name")
        private String name;
        
        /**
         * 省
         */
        @SerializedName("province")
        private String province;
        
        /**
         * 市
         */
        @SerializedName("city")
        private String city;
        
        /**
         * 区/县
         */
        @SerializedName("county")
        private String county;
        
        /**
         * 联系方式
         */
        @SerializedName("mobile")
        private String mobile;

        /** 街道地址，可选 */
        @SerializedName("street")
        private String street;
    }
}
