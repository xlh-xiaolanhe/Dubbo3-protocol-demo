package com.xiaolanhe.service;

import com.xiaolanhe.DubboDemoServiceGrpc;
import com.xiaolanhe.RequestData;
import com.xiaolanhe.ResponseData;
import io.grpc.stub.StreamObserver;
import org.apache.dubbo.config.annotation.DubboService;

/**
 *@author: xiaolanhe
 *@createDate: 2024/2/28 22:38
 */

@DubboService
public class DemoServiceImpl extends DubboDemoServiceGrpc.DemoServiceImplBase {
    @Override
    public void demo(RequestData request, StreamObserver<ResponseData> responseObserver) {
        System.out.println("DemoServiceImpl.demo request: " + request.getName());
        responseObserver.onNext(ResponseData.newBuilder().setResult("this is res").build());
        responseObserver.onCompleted();
    }
}
