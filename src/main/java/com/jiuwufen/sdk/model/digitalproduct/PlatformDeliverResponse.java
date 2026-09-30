package com.jiuwufen.sdk.model.digitalproduct;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * 3C普通订单发货面单响应；对应平台data对象，不再包裹公共响应层。
 * <p>字段取自旧爱果SDK 3.7.24已使用的协议；本模型不添加或修改任何调用逻辑。</p>
 * @author z7
 * @date 2026/09/30
 */
@Data
public class PlatformDeliverResponse {
    /** 快递子运单号。 */
    @SerializedName("express_number")
    private String expressNumber;

    /** 物流公司名称。 */
    @SerializedName("express_name")
    private String expressName;

    /** 响应中的物流类型为文本；不与请求Integer强制统一。 */
    @SerializedName("express_type")
    private String expressType;

    /** 发件网点编码。 */
    @SerializedName("dept_code")
    private String deptCode;

    /** 面单地址信息，按平台返回读取，不假设为寄件人。 */
    @SerializedName("address_info")
    private AddressInfo addressInfo;

    /** 商品类目名称。 */
    @SerializedName("goods_category_name")
    private String goodsCategoryName;

    /** 平台面单路由信息，可为空。 */
    @SerializedName("road")
    private String road;

    /** 快递产品编码，可为空。 */
    @SerializedName("express_product_type")
    private String expressProductType;

    /** 来源分拣中心名称。 */
    @SerializedName("source_center_name")
    private String sourceCenterName;

    /** 目的分拣中心名称。 */
    @SerializedName("target_center_name")
    private String targetCenterName;

    /** 站点名称。 */
    @SerializedName("site_name")
    private String siteName;

    /** 始发枢纽或网点编码。 */
    @SerializedName("source_code")
    private String sourceCode;

    /** 目的枢纽或网点编码。 */
    @SerializedName("target_code")
    private String targetCode;

    /** 二维面单数据；仅传输，不写入业务数据库。 */
    @SerializedName("two_dimension_code")
    private String twoDimensionCode;

    /** 一维面单数据；仅传输，不写入业务数据库。 */
    @SerializedName("dimension_code")
    private String dimensionCode;

    /** 母运单号，平台未返回时为空。 */
    @SerializedName("origin_express_number")
    private String originExpressNumber;

    /** 平台生成时间原文，不擅自改变时区或时间格式。 */
    @SerializedName("generate_time")
    private String generateTime;

    /** 生成面单时的平台提示。 */
    @SerializedName("generate_tip")
    private String generateTip;

    /** 目的地路由标签。 */
    @SerializedName("dest_route_label")
    private String destRouteLabel;

    /**
     * 平台面单地址，允许区域及脱敏联系方式按原样返回。
     * @author z7
     * @date 2026/09/30
     */
    @Data
    public static class AddressInfo {
        /** 平台返回的姓名。 */
        @SerializedName("name")
        private String name;
        /** 省份名称。 */
        @SerializedName("province")
        private String province;
        /** 城市名称。 */
        @SerializedName("city")
        private String city;
        /** 区县名称。 */
        @SerializedName("county")
        private String county;
        /** 平台返回的电话或虚拟号，不做数值转换。 */
        @SerializedName("mobile")
        private String mobile;
        /** 平台区域描述。 */
        @SerializedName("region")
        private String region;
        /** 街道及详细地址原文。 */
        @SerializedName("street")
        private String street;
    }
}
