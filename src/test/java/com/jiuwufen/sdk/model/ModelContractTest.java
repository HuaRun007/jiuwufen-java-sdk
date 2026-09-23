package com.jiuwufen.sdk.model;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.jiuwufen.sdk.model.delivery.DeliveryBizRequest;
import com.jiuwufen.sdk.model.delivery.DeliveryBizResponse;
import com.jiuwufen.sdk.model.goods.BargainSuccessRequest;
import com.jiuwufen.sdk.model.goods.CopyOnSaleRequest;
import com.jiuwufen.sdk.model.goods.MerchantSkuListResponse;
import com.jiuwufen.sdk.model.inventory.InventorySyncRequest;
import com.jiuwufen.sdk.model.order.ConsignBatchOrderListRequest;
import com.jiuwufen.sdk.model.order.ConsignBatchOrderListResponse;
import com.jiuwufen.sdk.model.order.GetOrderListRequest;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 核对开放平台请求 JSON 与 data 响应结构，避免模型字段与接口文档偏离
 */
class ModelContractTest {
    private final Gson gson = new Gson();

    /**
     * 核对必填请求字段及嵌套库存字段确实按文档名称发送
     */
    @Test
    void serializesDocumentedRequestFields() {
        CopyOnSaleRequest copy = new CopyOnSaleRequest();
        copy.setOldGoodsSn("old");
        copy.setNewGoodsSn("new");
        copy.setPrice(300);
        JsonObject copyJson = gson.toJsonTree(copy).getAsJsonObject();
        assertEquals("old", copyJson.get("old_goods_sn").getAsString());
        assertEquals("new", copyJson.get("new_goods_sn").getAsString());
        assertEquals(300, copyJson.get("price").getAsInt());
        assertFalse(copyJson.has("goods_sn"));

        BargainSuccessRequest bargain = new BargainSuccessRequest();
        bargain.setGoodsSn("goods");
        bargain.setPrice(299);
        assertEquals(299, gson.toJsonTree(bargain).getAsJsonObject().get("price").getAsInt());

        ConsignBatchOrderListRequest batch = new ConsignBatchOrderListRequest();
        batch.setMotherNo("mother");
        batch.setPage(1);
        batch.setPageSize(20);
        JsonObject batchJson = gson.toJsonTree(batch).getAsJsonObject();
        assertEquals("mother", batchJson.get("mother_no").getAsString());
        assertFalse(batchJson.has("batch_number"));

        GetOrderListRequest orders = new GetOrderListRequest();
        orders.setGoodsSnList(Collections.singletonList("goods"));
        JsonObject ordersJson = gson.toJsonTree(orders).getAsJsonObject();
        assertEquals("goods", ordersJson.getAsJsonArray("goods_sn_list").get(0).getAsString());
        assertFalse(ordersJson.has("page"));

        InventorySyncRequest.InventorySyncItem stock = new InventorySyncRequest.InventorySyncItem();
        stock.setLockQty(1L);
        stock.setBatchId("batch");
        stock.setMappingType(1L);
        JsonObject stockJson = gson.toJsonTree(stock).getAsJsonObject();
        assertEquals(1L, stockJson.get("lock_qty").getAsLong());
        assertEquals("batch", stockJson.get("batch_id").getAsString());
        assertEquals(1L, stockJson.get("mapping_type").getAsLong());

        DeliveryBizRequest.DeliveryAddress address = new DeliveryBizRequest.DeliveryAddress();
        address.setStreet("street");
        assertEquals("street", gson.toJsonTree(address).getAsJsonObject().get("street").getAsString());
    }

    /**
     * 核对客户端剥离公共响应层后，data 中的批次、商品和发货字段可读取
     */
    @Test
    void deserializesDocumentedDataFields() {
        ConsignBatchOrderListResponse batch = gson.fromJson("{\"mother_no\":\"mother\",\"total_order_count\":2,\"verified_order_count\":1,\"unverified_order_count\":1,\"pending_order_count\":0,\"order_list\":[{\"sell_order_number\":\"95\",\"merchant_sku_code\":\"sku\",\"verification_time\":1609459200,\"verification_result\":1,\"verification_failure_reason\":\"\",\"verification_failure_image_url\":[\"img\"]}]}", ConsignBatchOrderListResponse.class);
        assertEquals("mother", batch.getMotherNo());
        assertEquals(2, batch.getTotalOrderCount());
        assertEquals("95", batch.getOrderList().get(0).getSellOrderNumber());
        assertEquals("img", batch.getOrderList().get(0).getVerificationFailureImageUrl().get(0));

        MerchantSkuListResponse sku = gson.fromJson("{\"list\":[{\"sku_id\":1,\"sku_properties\":[{\"property_name\":\"颜色\",\"property_value\":\"红\"}],\"brand_id\":2,\"merchant_sku_code\":\"sku\",\"img\":\"url\"}]}", MerchantSkuListResponse.class);
        assertEquals("颜色", sku.getList().get(0).getSkuProperties().get(0).getPropertyName());
        assertEquals(2L, sku.getList().get(0).getBrandId());
        assertEquals("sku", sku.getList().get(0).getMerchantSkuCode());

        DeliveryBizResponse delivery = gson.fromJson("{\"list\":[{\"order_number\":\"95\",\"express_name\":\"快递\",\"address_info\":{\"street\":\"street\"}}]}", DeliveryBizResponse.class);
        assertEquals("95", delivery.getList().get(0).getOrderNumber());
        assertEquals("快递", delivery.getList().get(0).getExpressName());
        assertEquals("street", delivery.getList().get(0).getAddressInfo().getStreet());
    }
}
