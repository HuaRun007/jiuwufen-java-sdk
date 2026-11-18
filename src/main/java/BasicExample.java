package com.jiuwufen.sdk.example;

import com.jiuwufen.sdk.JiuWuFenClient;
import com.jiuwufen.sdk.exception.ApiException;
import com.jiuwufen.sdk.model.merchant.*;
import com.jiuwufen.sdk.model.goods.*;
import com.jiuwufen.sdk.model.inventory.*;

import java.util.Arrays;

/**
 * 基础使用示例
 * 
 * @author 95分开放平台团队
 */
public class BasicExample {

    public static void main(String[] args) {
        try {
            // 创建客户端
            JiuWuFenClient client = JiuWuFenClient.builder()
                    .erpName("aiguo")
                    .thirdPartyId("b815dfd4")
                    .merchantSecret("1eef396e286d63e2b60bd0340afcb23e")
                    .platformSecret("6d94dd64b8a0fb2")
                    .baseUrl("http://t1.95fenapp.com")
                    .sortNestedKeys(true) // 测试环境开启；生产环境删除此配置或设为 false
                    .debug(true)
                    .build();


            ReferencePriceRequest request = new ReferencePriceRequest();
            request.setSkuId(53238313L);
            request.setIsNew(20L);
            request.setSaleType(3);
            ReferencePriceResponse referencePrice = client.goods().getReferencePrice(request);
            System.out.println(referencePrice);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
