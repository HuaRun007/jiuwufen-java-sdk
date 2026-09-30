package com.jiuwufen.sdk.api;

import com.google.gson.JsonObject;
import com.jiuwufen.sdk.JiuWuFenClient;
import com.jiuwufen.sdk.exception.ApiException;
import com.jiuwufen.sdk.model.digitalproduct.*;

/**
 * 3C 数码相关 API（质检项、IMEI、一键出售、后验签收、绑扣等）。
 * <p>
 * 一键出售 v1/v2 使用 {@link DigitalSuperSaleRequest}、{@link DigitalSuperSaleV2Request} 及配套嵌套类型，与开放平台文档字段一致。
 */
public class DigitalProductApi {

    private final JiuWuFenClient client;

    public DigitalProductApi(JiuWuFenClient client) {
        this.client = client;
    }

    /**
     * 质检项查询 (ExaminingConfig)
     */
    public JsonObject examiningConfig(ExaminingConfigRequest request) throws ApiException {
        return client.execute("/api_tob/examiningConfig/v1.0", request, JsonObject.class);
    }

    /**
     * IMEI 查询 (Imei)
     */
    public JsonObject imeiQuery(ImeiQueryRequest request) throws ApiException {
        return client.execute("/api_tob/imei/v1.0", request, JsonObject.class);
    }

    /**
     * 一键出售 - 平台商家 (DigitalSuperSale v1.0)
     *
     * @see DigitalSuperSaleRequest
     * @see DigitalSuperSaleV1ExaminingItem
     * @see DigitalSuperSaleV1SecondExaminingItem
     * @see DigitalSuperSaleV1ThirdExaminingItem
     * @see DigitalSuperSaleAddress
     */
    public JsonObject digitalSuperSale(DigitalSuperSaleRequest request) throws ApiException {
        return client.execute("/api_tob/digitalSuperSale/v1.0", request, JsonObject.class);
    }

    /**
     * 一键出售 - 自研商家 (DigitalSuperSale v2.0)
     *
     * @see DigitalSuperSaleV2Request
     * @see DigitalSuperSaleV2ExaminingItem
     * @see DigitalSuperSaleAddress
     */
    public JsonObject digitalSuperSaleV2(DigitalSuperSaleV2Request request) throws ApiException {
        return client.execute("/api_tob/digitalSuperSale/v2.0", request, JsonObject.class);
    }

    /**
     * 非后验订单打印面单并发货，沿用旧SDK的商品编码协议。
     * <p>此接口可能产生发货副作用；不能把调用超时等同于未执行后直接重发。</p>
     *
     * @param request 商品编码、寄件地址及机器IMEI，不能为null
     * @return 平台data中的运单及面单信息；平台未返回data时可能为null，调用方须核对
     * @throws IllegalArgumentException 请求为null
     * @throws ApiException 平台业务拒绝或客户端调用失败，保留现有错误码和请求号
     */
    public PlatformDeliverResponse platformDeliver(PlatformDeliverRequest request) throws ApiException {
        // 只委托现有客户端，统一复用签名、HTTP和公共响应解析。
        return client.execute("/api_tob/platformDeliver/v1.0", request, PlatformDeliverResponse.class);
    }

    /**
     * 后验订单发货打单，沿用旧SDK的商品集合、配送方式及原运单参数。
     * <p>尽管名称包含Query，该协议用于后验发货打单，调用方不得当作无副作用查询自动重试。</p>
     *
     * @param request 后验商品集合及物流参数，不能为null；可选address为空时不提交
     * @return 平台data中的自送或快递面单信息；平台未返回data时可能为null，调用方须核对
     * @throws IllegalArgumentException 请求为null
     * @throws ApiException 平台业务拒绝或客户端调用失败，保留现有错误码和请求号
     */
    public InspectLogisticsResponse inspectLogisticsQuery(InspectLogisticsRequest request) throws ApiException {
        return client.execute("/api_tob/inspectLogisticsQuery/v1.0", body, InspectLogisticsResponse.class);
    }

    /**
     * 后验退回签收 (InspectSignReceipt)
     */
    public JsonObject inspectSignReceipt(InspectSignReceiptRequest request) throws ApiException {
        return client.execute("/api_tob/inspectSignReceipt/v1.0", request, JsonObject.class);
    }

    /**
     * 绑扣/更新绑扣 (BindCertificate)
     */
    public JsonObject bindCertificateBuckle(BindCertificateBuckleRequest request) throws ApiException {
        return client.execute("/api_tob/bindCertificateBuckle/v1.0", request, JsonObject.class);
    }
}
