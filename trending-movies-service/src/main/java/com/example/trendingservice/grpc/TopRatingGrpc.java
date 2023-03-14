package com.example.trendingservice.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: top_rating.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TopRatingGrpc {

  private TopRatingGrpc() {}

  public static final String SERVICE_NAME = "rating.TopRating";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.trendingservice.grpc.TopRatingRequest,
      com.example.trendingservice.grpc.TopRatingReply> getGetTopRatingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTopRating",
      requestType = com.example.trendingservice.grpc.TopRatingRequest.class,
      responseType = com.example.trendingservice.grpc.TopRatingReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.trendingservice.grpc.TopRatingRequest,
      com.example.trendingservice.grpc.TopRatingReply> getGetTopRatingMethod() {
    io.grpc.MethodDescriptor<com.example.trendingservice.grpc.TopRatingRequest, com.example.trendingservice.grpc.TopRatingReply> getGetTopRatingMethod;
    if ((getGetTopRatingMethod = TopRatingGrpc.getGetTopRatingMethod) == null) {
      synchronized (TopRatingGrpc.class) {
        if ((getGetTopRatingMethod = TopRatingGrpc.getGetTopRatingMethod) == null) {
          TopRatingGrpc.getGetTopRatingMethod = getGetTopRatingMethod =
              io.grpc.MethodDescriptor.<com.example.trendingservice.grpc.TopRatingRequest, com.example.trendingservice.grpc.TopRatingReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTopRating"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.trendingservice.grpc.TopRatingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.trendingservice.grpc.TopRatingReply.getDefaultInstance()))
              .setSchemaDescriptor(new TopRatingMethodDescriptorSupplier("getTopRating"))
              .build();
        }
      }
    }
    return getGetTopRatingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TopRatingStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TopRatingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TopRatingStub>() {
        @java.lang.Override
        public TopRatingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TopRatingStub(channel, callOptions);
        }
      };
    return TopRatingStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TopRatingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TopRatingBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TopRatingBlockingStub>() {
        @java.lang.Override
        public TopRatingBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TopRatingBlockingStub(channel, callOptions);
        }
      };
    return TopRatingBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TopRatingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TopRatingFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TopRatingFutureStub>() {
        @java.lang.Override
        public TopRatingFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TopRatingFutureStub(channel, callOptions);
        }
      };
    return TopRatingFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class TopRatingImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void getTopRating(com.example.trendingservice.grpc.TopRatingRequest request,
        io.grpc.stub.StreamObserver<com.example.trendingservice.grpc.TopRatingReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTopRatingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTopRatingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.trendingservice.grpc.TopRatingRequest,
                com.example.trendingservice.grpc.TopRatingReply>(
                  this, METHODID_GET_TOP_RATING)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class TopRatingStub extends io.grpc.stub.AbstractAsyncStub<TopRatingStub> {
    private TopRatingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TopRatingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TopRatingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void getTopRating(com.example.trendingservice.grpc.TopRatingRequest request,
        io.grpc.stub.StreamObserver<com.example.trendingservice.grpc.TopRatingReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTopRatingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class TopRatingBlockingStub extends io.grpc.stub.AbstractBlockingStub<TopRatingBlockingStub> {
    private TopRatingBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TopRatingBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TopRatingBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.example.trendingservice.grpc.TopRatingReply getTopRating(com.example.trendingservice.grpc.TopRatingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTopRatingMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class TopRatingFutureStub extends io.grpc.stub.AbstractFutureStub<TopRatingFutureStub> {
    private TopRatingFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TopRatingFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TopRatingFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.trendingservice.grpc.TopRatingReply> getTopRating(
        com.example.trendingservice.grpc.TopRatingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTopRatingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TOP_RATING = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TopRatingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TopRatingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TOP_RATING:
          serviceImpl.getTopRating((com.example.trendingservice.grpc.TopRatingRequest) request,
              (io.grpc.stub.StreamObserver<com.example.trendingservice.grpc.TopRatingReply>) responseObserver);
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

  private static abstract class TopRatingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TopRatingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.trendingservice.grpc.RatingProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TopRating");
    }
  }

  private static final class TopRatingFileDescriptorSupplier
      extends TopRatingBaseDescriptorSupplier {
    TopRatingFileDescriptorSupplier() {}
  }

  private static final class TopRatingMethodDescriptorSupplier
      extends TopRatingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TopRatingMethodDescriptorSupplier(String methodName) {
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
      synchronized (TopRatingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TopRatingFileDescriptorSupplier())
              .addMethod(getGetTopRatingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
