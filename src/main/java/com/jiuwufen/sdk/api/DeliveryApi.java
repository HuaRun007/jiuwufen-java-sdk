package com.jiuwufen.sdk.api;

import com.jiuwufen.sdk.JiuWuFenClient;
import com.jiuwufen.sdk.exception.ApiException;
import com.jiuwufen.sdk.model.delivery.*;

/**
 * 物流管理 API
 */
public class DeliveryApi {

    private final JiuWuFenClient client;

    public DeliveryApi(JiuWuFenClient client) {
        this.client = client;
    }

    /**
     * 发货 & 重打面单
     */
    public DeliveryBizResponse deliveryBiz(DeliveryBizRequest request) throws ApiException {
        return client.execute("/api_tob/delivery/bizDelivery/v1.0", request, DeliveryBizResponse.class);
    }

    /**
     * 按运单号查询物流轨迹，节点顺序由平台根据请求参数返回
     */
    public LogisticsQueryResponse logisticsQuery(LogisticsQueryRequest request) throws ApiException {
        return client.execute("/api_tob/logisticsQuery/v1.0", request, LogisticsQueryResponse.class);
    }
}
