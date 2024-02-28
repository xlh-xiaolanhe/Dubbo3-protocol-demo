package com.xiaolanhe;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: DemoService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DemoServiceGrpc {

  private DemoServiceGrpc() {}

  public static final String SERVICE_NAME = "DemoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.xiaolanhe.RequestData,
      com.xiaolanhe.ResponseData> getDemoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "demo",
      requestType = com.xiaolanhe.RequestData.class,
      responseType = com.xiaolanhe.ResponseData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xiaolanhe.RequestData,
      com.xiaolanhe.ResponseData> getDemoMethod() {
    io.grpc.MethodDescriptor<com.xiaolanhe.RequestData, com.xiaolanhe.ResponseData> getDemoMethod;
    if ((getDemoMethod = DemoServiceGrpc.getDemoMethod) == null) {
      synchronized (DemoServiceGrpc.class) {
        if ((getDemoMethod = DemoServiceGrpc.getDemoMethod) == null) {
          DemoServiceGrpc.getDemoMethod = getDemoMethod =
              io.grpc.MethodDescriptor.<com.xiaolanhe.RequestData, com.xiaolanhe.ResponseData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "demo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xiaolanhe.RequestData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xiaolanhe.ResponseData.getDefaultInstance()))
              .setSchemaDescriptor(new DemoServiceMethodDescriptorSupplier("demo"))
              .build();
        }
      }
    }
    return getDemoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DemoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DemoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DemoServiceStub>() {
        @java.lang.Override
        public DemoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DemoServiceStub(channel, callOptions);
        }
      };
    return DemoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DemoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DemoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DemoServiceBlockingStub>() {
        @java.lang.Override
        public DemoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DemoServiceBlockingStub(channel, callOptions);
        }
      };
    return DemoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DemoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DemoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DemoServiceFutureStub>() {
        @java.lang.Override
        public DemoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DemoServiceFutureStub(channel, callOptions);
        }
      };
    return DemoServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DemoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void demo(com.xiaolanhe.RequestData request,
        io.grpc.stub.StreamObserver<com.xiaolanhe.ResponseData> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDemoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDemoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.xiaolanhe.RequestData,
                com.xiaolanhe.ResponseData>(
                  this, METHODID_DEMO)))
          .build();
    }
  }

  /**
   */
  public static final class DemoServiceStub extends io.grpc.stub.AbstractAsyncStub<DemoServiceStub> {
    private DemoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DemoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DemoServiceStub(channel, callOptions);
    }

    /**
     */
    public void demo(com.xiaolanhe.RequestData request,
        io.grpc.stub.StreamObserver<com.xiaolanhe.ResponseData> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDemoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DemoServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DemoServiceBlockingStub> {
    private DemoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DemoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DemoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.xiaolanhe.ResponseData demo(com.xiaolanhe.RequestData request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDemoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DemoServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DemoServiceFutureStub> {
    private DemoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DemoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DemoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xiaolanhe.ResponseData> demo(
        com.xiaolanhe.RequestData request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDemoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DEMO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DemoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DemoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DEMO:
          serviceImpl.demo((com.xiaolanhe.RequestData) request,
              (io.grpc.stub.StreamObserver<com.xiaolanhe.ResponseData>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DemoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DemoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.xiaolanhe.DemoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DemoService");
    }
  }

  private static final class DemoServiceFileDescriptorSupplier
      extends DemoServiceBaseDescriptorSupplier {
    DemoServiceFileDescriptorSupplier() {}
  }

  private static final class DemoServiceMethodDescriptorSupplier
      extends DemoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DemoServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DemoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DemoServiceFileDescriptorSupplier())
              .addMethod(getDemoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
