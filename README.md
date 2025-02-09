# Preparation for Ubuntu 24.04

```bash
sudo apt-get install -y nvidia-driver-550 openjdk-21-jdk maven
sudo reboot
```

I have tested on a Google Cloud NVIDIA T4 instance.

# How to run

To run the Test class,

```bash
mvn compile exec:java -Dorg.bytedeco.javacpp.logger.debug=true
```

# Result

```text
[INFO] --- exec-maven-plugin:3.5.0:java (default-cli) @ TensorFlowJavaBugReport ---
Debug: Loading class org.tensorflow.internal.c_api.global.tensorflow
Debug: Loading class org.tensorflow.internal.c_api.global.tensorflow
Debug: Loading library cudart
Debug: Failed to load for cudart@.11.0: java.lang.UnsatisfiedLinkError: no cudart in java.library.path: /usr/java/packages/lib:/usr/lib/x86_64-linux-gnu/jni:/lib/x86_64-linux-gnu:/usr/lib/x86_64-linux-gnu:/usr/lib/jni:/lib:/usr/lib
Debug: Loading library cublasLt
Debug: Failed to load for cublasLt@.11: java.lang.UnsatisfiedLinkError: no cublasLt in java.library.path: /usr/java/packages/lib:/usr/lib/x86_64-linux-gnu/jni:/lib/x86_64-linux-gnu:/usr/lib/x86_64-linux-gnu:/usr/lib/jni:/lib:/usr/lib
Debug: Loading library cublas
Debug: Failed to load for cublas@.11: java.lang.UnsatisfiedLinkError: no cublas in java.library.path: /usr/java/packages/lib:/usr/lib/x86_64-linux-gnu/jni:/lib/x86_64-linux-gnu:/usr/lib/x86_64-linux-gnu:/usr/lib/jni:/lib:/usr/lib
Debug: Loading library cufft
Debug: Failed to load for cufft@.10: java.lang.UnsatisfiedLinkError: no cufft in java.library.path: /usr/java/packages/lib:/usr/lib/x86_64-linux-gnu/jni:/lib/x86_64-linux-gnu:/usr/lib/x86_64-linux-gnu:/usr/lib/jni:/lib:/usr/lib
Debug: Loading /home/ubuntu/.javacpp/cache/cuda-12.3-8.9-1.5.10-linux-x86_64-redist.jar/org/bytedeco/cuda/linux-x86_64/libcurand.so.10
Debug: Loading library cusolver
Debug: Failed to load for cusolver@.10: java.lang.UnsatisfiedLinkError: no cusolver in java.library.path: /usr/java/packages/lib:/usr/lib/x86_64-linux-gnu/jni:/lib/x86_64-linux-gnu:/usr/lib/x86_64-linux-gnu:/usr/lib/jni:/lib:/usr/lib
Debug: Loading library cusparse
Debug: Failed to load for cusparse@.11: java.lang.UnsatisfiedLinkError: no cusparse in java.library.path: /usr/java/packages/lib:/usr/lib/x86_64-linux-gnu/jni:/lib/x86_64-linux-gnu:/usr/lib/x86_64-linux-gnu:/usr/lib/jni:/lib:/usr/lib
Debug: Loading /home/ubuntu/.javacpp/cache/cuda-12.3-8.9-1.5.10-linux-x86_64-redist.jar/org/bytedeco/cuda/linux-x86_64/libcudnn.so.8
Debug: Loading /home/ubuntu/.javacpp/cache/cuda-12.3-8.9-1.5.10-linux-x86_64-redist.jar/org/bytedeco/cuda/linux-x86_64/libnccl.so.2
Debug: Loading library nvrtc
Debug: Failed to load for nvrtc@.11.0: java.lang.UnsatisfiedLinkError: no nvrtc in java.library.path: /usr/java/packages/lib:/usr/lib/x86_64-linux-gnu/jni:/lib/x86_64-linux-gnu:/usr/lib/x86_64-linux-gnu:/usr/lib/jni:/lib:/usr/lib
Debug: Loading library myelin
Debug: Failed to load for myelin@.1: java.lang.UnsatisfiedLinkError: no myelin in java.library.path: /usr/java/packages/lib:/usr/lib/x86_64-linux-gnu/jni:/lib/x86_64-linux-gnu:/usr/lib/x86_64-linux-gnu:/usr/lib/jni:/lib:/usr/lib
Debug: Loading library nvinfer
Debug: Failed to load for nvinfer@.7: java.lang.UnsatisfiedLinkError: no nvinfer in java.library.path: /usr/java/packages/lib:/usr/lib/x86_64-linux-gnu/jni:/lib/x86_64-linux-gnu:/usr/lib/x86_64-linux-gnu:/usr/lib/jni:/lib:/usr/lib
Debug: Loading /home/ubuntu/.javacpp/cache/cuda-12.3-8.9-1.5.10-linux-x86_64-redist.jar/org/bytedeco/cuda/linux-x86_64/libcudnn_ops_infer.so.8
Debug: Loading /home/ubuntu/.javacpp/cache/cuda-12.3-8.9-1.5.10-linux-x86_64-redist.jar/org/bytedeco/cuda/linux-x86_64/libcudnn_ops_train.so.8
Debug: Loading /home/ubuntu/.javacpp/cache/cuda-12.3-8.9-1.5.10-linux-x86_64-redist.jar/org/bytedeco/cuda/linux-x86_64/libcudnn_adv_infer.so.8
Debug: Loading /home/ubuntu/.javacpp/cache/cuda-12.3-8.9-1.5.10-linux-x86_64-redist.jar/org/bytedeco/cuda/linux-x86_64/libcudnn_adv_train.so.8
Debug: Loading /home/ubuntu/.javacpp/cache/cuda-12.3-8.9-1.5.10-linux-x86_64-redist.jar/org/bytedeco/cuda/linux-x86_64/libcudnn_cnn_infer.so.8
Debug: Loading /home/ubuntu/.javacpp/cache/cuda-12.3-8.9-1.5.10-linux-x86_64-redist.jar/org/bytedeco/cuda/linux-x86_64/libcudnn_cnn_train.so.8
Debug: Loading /home/ubuntu/.javacpp/cache/tensorflow-core-native-1.0.0-linux-x86_64-gpu.jar/org/tensorflow/internal/c_api/linux-x86_64-gpu/libtensorflow_cc.so.2
2025-02-09 22:23:47.622244: I external/local_tsl/tsl/cuda/cudart_stub.cc:32] Could not find cuda drivers on your machine, GPU will not be used.
2025-02-09 22:23:47.626592: I external/local_tsl/tsl/cuda/cudart_stub.cc:32] Could not find cuda drivers on your machine, GPU will not be used.
2025-02-09 22:23:47.643765: E external/local_xla/xla/stream_executor/cuda/cuda_fft.cc:479] Unable to register cuFFT factory: Attempting to register factory for plugin cuFFT when one has already been registered
2025-02-09 22:23:47.677593: E external/local_xla/xla/stream_executor/cuda/cuda_dnn.cc:10575] Unable to register cuDNN factory: Attempting to register factory for plugin cuDNN when one has already been registered
2025-02-09 22:23:47.677634: E external/local_xla/xla/stream_executor/cuda/cuda_blas.cc:1442] Unable to register cuBLAS factory: Attempting to register factory for plugin cuBLAS when one has already been registered
Debug: Loading /home/ubuntu/.javacpp/cache/tensorflow-core-native-1.0.0-linux-x86_64-gpu.jar/org/tensorflow/internal/c_api/linux-x86_64-gpu/libtensorflow_framework.so.2
Debug: Loading /home/ubuntu/.javacpp/cache/tensorflow-core-native-1.0.0-linux-x86_64-gpu.jar/org/tensorflow/internal/c_api/linux-x86_64-gpu/libjnitensorflow.so
Debug: Loading class org.bytedeco.javacpp.presets.javacpp
Debug: Loading class org.bytedeco.javacpp.Pointer
Debug: Loading library jnijavacpp
Debug: Failed to load for jnijavacpp: java.lang.UnsatisfiedLinkError: no jnijavacpp in java.library.path: /usr/java/packages/lib:/usr/lib/x86_64-linux-gnu/jni:/lib/x86_64-linux-gnu:/usr/lib/x86_64-linux-gnu:/usr/lib/jni:/lib:/usr/lib
Debug: Could not load Pointer: java.lang.UnsatisfiedLinkError: no jnijavacpp in java.library.path: /usr/java/packages/lib:/usr/lib/x86_64-linux-gnu/jni:/lib/x86_64-linux-gnu:/usr/lib/x86_64-linux-gnu:/usr/lib/jni:/lib:/usr/lib
Debug: Loading class org.bytedeco.javacpp.presets.javacpp
Debug: Loading class org.bytedeco.javacpp.BytePointer
Debug: Opening org.bytedeco.javacpp.PointerScope@34c37bb7
Debug: Registering org.tensorflow.internal.c_api.TFE_ContextOptions[address=0x7faf817c47c0,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTFE_ContextOptions$DeleteDeallocator[address=0x7faf817c47c0,position=0,limit=0,capacity=0,deallocator=null],count=0]]
Debug: Attaching org.tensorflow.internal.c_api.TFE_ContextOptions[address=0x7faf817c47c0,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTFE_ContextOptions$DeleteDeallocator[address=0x7faf817c47c0,position=0,limit=0,capacity=0,deallocator=null],count=0]] to org.bytedeco.javacpp.PointerScope@34c37bb7
Debug: Registering org.tensorflow.internal.c_api.TF_Status[address=0x7faf817c5d70,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7faf817c5d70,position=0,limit=0,capacity=0,deallocator=null],count=0]]
Debug: Attaching org.tensorflow.internal.c_api.TF_Status[address=0x7faf817c5d70,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7faf817c5d70,position=0,limit=0,capacity=0,deallocator=null],count=0]] to org.bytedeco.javacpp.PointerScope@34c37bb7
2025-02-09 22:23:47.733769: I tensorflow/core/platform/cpu_feature_guard.cc:210] This TensorFlow binary is optimized to use available CPU instructions in performance-critical operations.
To enable the following instructions: AVX2 FMA, in other operations, rebuild TensorFlow with the appropriate compiler flags.
2025-02-09 22:23:47.864329: I external/local_xla/xla/stream_executor/cuda/cuda_executor.cc:998] successful NUMA node read from SysFS had negative value (-1), but there must be at least one NUMA node, so returning NUMA node zero. See more at https://github.com/torvalds/linux/blob/v6.0/Documentation/ABI/testing/sysfs-bus-pci#L344-L355
2025-02-09 22:23:47.868111: W tensorflow/core/common_runtime/gpu/gpu_device.cc:2251] Cannot dlopen some GPU libraries. Please make sure the missing libraries mentioned above are installed properly if you would like to use GPU. Follow the guide at https://www.tensorflow.org/install/gpu for how to download and setup the required libraries for your platform.
Skipping registering GPU devices...
Debug: Closing org.bytedeco.javacpp.PointerScope@34c37bb7
Debug: Releasing org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7faf817c5d70,position=0,limit=0,capacity=0,deallocator=null],count=0]
Debug: Releasing org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTFE_ContextOptions$DeleteDeallocator[address=0x7faf817c47c0,position=0,limit=0,capacity=0,deallocator=null],count=0]
Debug: Loading class org.tensorflow.internal.c_api.global.tensorflow
Debug: Loading class org.tensorflow.internal.c_api.Deallocator_Pointer_long_Pointer
Debug: Registering org.tensorflow.internal.c_api.AbstractTF_Tensor$1[address=0x7faf817a8160,position=0,limit=1,capacity=1,deallocator=org.bytedeco.javacpp.Pointer$NativeDeallocator[ownerAddress=0x7faf817a8160,deallocatorAddress=0x7fb068088d40]]
Debug: Registering org.tensorflow.internal.c_api.TF_Tensor[address=0x7faf8275a790,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Tensor$DeleteDeallocator[address=0x7faf8275a790,position=0,limit=0,capacity=0,deallocator=null],count=0]]
Debug: Opening org.bytedeco.javacpp.PointerScope@3e3f7746
Debug: Attaching org.tensorflow.internal.c_api.TF_Tensor[address=0x7faf8275a790,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Tensor$DeleteDeallocator[address=0x7faf8275a790,position=0,limit=0,capacity=0,deallocator=null],count=0]] to org.bytedeco.javacpp.PointerScope@3e3f7746
Debug: Extending org.bytedeco.javacpp.PointerScope@3e3f7746
Debug: Closing org.bytedeco.javacpp.PointerScope@3e3f7746
Debug: Opening org.bytedeco.javacpp.PointerScope@345a9d0
Debug: Registering org.tensorflow.internal.c_api.TF_Status[address=0x7faf82781710,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7faf82781710,position=0,limit=0,capacity=0,deallocator=null],count=0]]
Debug: Attaching org.tensorflow.internal.c_api.TF_Status[address=0x7faf82781710,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7faf82781710,position=0,limit=0,capacity=0,deallocator=null],count=0]] to org.bytedeco.javacpp.PointerScope@345a9d0
Debug: Registering org.tensorflow.internal.c_api.TFE_Op[address=0x7faf8276f440,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTFE_Op$DeleteDeallocator[address=0x7faf8276f440,position=0,limit=0,capacity=0,deallocator=null],count=0]]
Debug: Attaching org.tensorflow.internal.c_api.TFE_Op[address=0x7faf8276f440,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTFE_Op$DeleteDeallocator[address=0x7faf8276f440,position=0,limit=0,capacity=0,deallocator=null],count=0]] to org.bytedeco.javacpp.PointerScope@345a9d0
Debug: Closing org.bytedeco.javacpp.PointerScope@345a9d0
Debug: Releasing org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7faf82781710,position=0,limit=0,capacity=0,deallocator=null],count=0]
Debug: Opening org.bytedeco.javacpp.PointerScope@676b30f0
Debug: Registering org.tensorflow.internal.c_api.TF_Status[address=0x7faf82781710,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7faf82781710,position=0,limit=0,capacity=0,deallocator=null],count=0]]
Debug: Attaching org.tensorflow.internal.c_api.TF_Status[address=0x7faf82781710,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7faf82781710,position=0,limit=0,capacity=0,deallocator=null],count=0]] to org.bytedeco.javacpp.PointerScope@676b30f0
Debug: Closing org.bytedeco.javacpp.PointerScope@676b30f0
Debug: Releasing org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7faf82781710,position=0,limit=0,capacity=0,deallocator=null],count=0]
Debug: Opening org.bytedeco.javacpp.PointerScope@13f070fc
Debug: Registering org.tensorflow.internal.c_api.TF_Status[address=0x7faf8061b760,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7faf8061b760,position=0,limit=0,capacity=0,deallocator=null],count=0]]
Debug: Attaching org.tensorflow.internal.c_api.TF_Status[address=0x7faf8061b760,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7faf8061b760,position=0,limit=0,capacity=0,deallocator=null],count=0]] to org.bytedeco.javacpp.PointerScope@13f070fc
Debug: Closing org.bytedeco.javacpp.PointerScope@13f070fc
Debug: Releasing org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7faf8061b760,position=0,limit=0,capacity=0,deallocator=null],count=0]
Debug: Opening org.bytedeco.javacpp.PointerScope@60875435
Debug: Loading class org.bytedeco.javacpp.presets.javacpp
Debug: Loading class org.bytedeco.javacpp.IntPointer
Debug: Registering org.bytedeco.javacpp.IntPointer[address=0x7faf8102bc40,position=0,limit=1,capacity=1,deallocator=org.bytedeco.javacpp.Pointer$NativeDeallocator[ownerAddress=0x7faf8102bc40,deallocatorAddress=0x7fb0680d1880]]
Debug: Attaching org.bytedeco.javacpp.IntPointer[address=0x7faf8102bc40,position=0,limit=1,capacity=1,deallocator=org.bytedeco.javacpp.Pointer$NativeDeallocator[ownerAddress=0x7faf8102bc40,deallocatorAddress=0x7fb0680d1880]] to org.bytedeco.javacpp.PointerScope@60875435
Debug: Loading class org.bytedeco.javacpp.presets.javacpp
Debug: Loading class org.bytedeco.javacpp.PointerPointer
Debug: Registering org.bytedeco.javacpp.PointerPointer[address=0x7faf81790140,position=0,limit=1000,capacity=1000,deallocator=org.bytedeco.javacpp.Pointer$NativeDeallocator[ownerAddress=0x7faf81790140,deallocatorAddress=0x7fb0680d1940]]
Debug: Attaching org.bytedeco.javacpp.PointerPointer[address=0x7faf81790140,position=0,limit=1000,capacity=1000,deallocator=org.bytedeco.javacpp.Pointer$NativeDeallocator[ownerAddress=0x7faf81790140,deallocatorAddress=0x7fb0680d1940]] to org.bytedeco.javacpp.PointerScope@60875435
Debug: Registering org.tensorflow.internal.c_api.TF_Status[address=0x7faf8102b730,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7faf8102b730,position=0,limit=0,capacity=0,deallocator=null],count=0]]
Debug: Attaching org.tensorflow.internal.c_api.TF_Status[address=0x7faf8102b730,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7faf8102b730,position=0,limit=0,capacity=0,deallocator=null],count=0]] to org.bytedeco.javacpp.PointerScope@60875435
Debug: Closing org.bytedeco.javacpp.PointerScope@60875435
Debug: Releasing org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7faf8102b730,position=0,limit=0,capacity=0,deallocator=null],count=0]
Debug: Releasing org.bytedeco.javacpp.Pointer$NativeDeallocator[ownerAddress=0x7faf81790140,deallocatorAddress=0x7fb0680d1940]
Debug: Collecting org.bytedeco.javacpp.Pointer$NativeDeallocator[ownerAddress=0x0,deallocatorAddress=0x0]
Debug: Releasing org.bytedeco.javacpp.Pointer$NativeDeallocator[ownerAddress=0x7faf8102bc40,deallocatorAddress=0x7fb0680d1880]
Debug: Collecting org.bytedeco.javacpp.Pointer$NativeDeallocator[ownerAddress=0x0,deallocatorAddress=0x0]
Debug: Closing org.bytedeco.javacpp.PointerScope@3e3f7746
Debug: Releasing org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Tensor$DeleteDeallocator[address=0x7faf8275a790,position=0,limit=0,capacity=0,deallocator=null],count=0]
[WARNING]
org.tensorflow.exceptions.TFInvalidArgumentException: Could not satisfy device specification '/device:GPU:0'. enable_soft_placement=0. Supported device types [CPU]. All available devices [/job:localhost/replica:0/task:0/device:CPU:0].
    at org.tensorflow.internal.c_api.AbstractTF_Status.throwExceptionIfNotOK (AbstractTF_Status.java:76)
    at org.tensorflow.EagerOperationBuilder.execute (EagerOperationBuilder.java:312)
    at org.tensorflow.EagerOperationBuilder.build (EagerOperationBuilder.java:77)
    at org.tensorflow.EagerOperationBuilder.build (EagerOperationBuilder.java:64)
    at org.tensorflow.op.core.Constant.create (Constant.java:1346)
    at org.tensorflow.op.core.Constant.vectorOf (Constant.java:252)
    at org.tensorflow.op.core.Constant.arrayOf (Constant.java:268)
    at org.tensorflow.op.Ops.array (Ops.java:649)
    at Test.main (Test.java:15)
    at org.codehaus.mojo.exec.ExecJavaMojo.doMain (ExecJavaMojo.java:375)
    at org.codehaus.mojo.exec.ExecJavaMojo.doExec (ExecJavaMojo.java:364)
    at org.codehaus.mojo.exec.ExecJavaMojo.lambda$execute$0 (ExecJavaMojo.java:286)
    at java.lang.Thread.run (Thread.java:1583)
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.569 s
[INFO] Finished at: 2025-02-09T22:23:48+09:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.codehaus.mojo:exec-maven-plugin:3.5.0:java (default-cli) on project TensorFlowJavaBugReport: An exception occurred while executing the Java class. Could not satisfy device specification '/device:GPU:0'. enable_soft_placement=0. Supported device types [CPU]. All available devices [/job:localhost/replica:0/task:0/device:CPU:0]. -> [Help 1]
[ERROR]
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR]
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoExecutionException
```

# How to avoid this issue

```bash
sudo apt-get install -y nvidia-cuda-dev
```

The output will change as follows.

```text
[INFO] --- exec-maven-plugin:3.5.0:java (default-cli) @ TensorFlowJavaBugReport ---
Debug: Loading class org.tensorflow.internal.c_api.global.tensorflow
Debug: Loading class org.tensorflow.internal.c_api.global.tensorflow
Debug: Loading library cudart
Debug: Loading library cublasLt
Debug: Loading library cublas
Debug: Loading library cufft
Debug: Loading /home/ubuntu/.javacpp/cache/cuda-12.3-8.9-1.5.10-linux-x86_64-redist.jar/org/bytedeco/cuda/linux-x86_64/libcurand.so.10
Debug: Loading library cusolver
Debug: Loading library cusparse
Debug: Loading /home/ubuntu/.javacpp/cache/cuda-12.3-8.9-1.5.10-linux-x86_64-redist.jar/org/bytedeco/cuda/linux-x86_64/libcudnn.so.8
Debug: Loading /home/ubuntu/.javacpp/cache/cuda-12.3-8.9-1.5.10-linux-x86_64-redist.jar/org/bytedeco/cuda/linux-x86_64/libnccl.so.2
Debug: Loading library nvrtc
Debug: Loading library myelin
Debug: Failed to load for myelin@.1: java.lang.UnsatisfiedLinkError: no myelin in java.library.path: /usr/java/packages/lib:/usr/lib/x86_64-linux-gnu/jni:/lib/x86_64-linux-gnu:/usr/lib/x86_64-linux-gnu:/usr/lib/jni:/lib:/usr/lib
Debug: Loading library nvinfer
Debug: Failed to load for nvinfer@.7: java.lang.UnsatisfiedLinkError: no nvinfer in java.library.path: /usr/java/packages/lib:/usr/lib/x86_64-linux-gnu/jni:/lib/x86_64-linux-gnu:/usr/lib/x86_64-linux-gnu:/usr/lib/jni:/lib:/usr/lib
Debug: Loading /home/ubuntu/.javacpp/cache/cuda-12.3-8.9-1.5.10-linux-x86_64-redist.jar/org/bytedeco/cuda/linux-x86_64/libcudnn_ops_infer.so.8
Debug: Loading /home/ubuntu/.javacpp/cache/cuda-12.3-8.9-1.5.10-linux-x86_64-redist.jar/org/bytedeco/cuda/linux-x86_64/libcudnn_ops_train.so.8
Debug: Loading /home/ubuntu/.javacpp/cache/cuda-12.3-8.9-1.5.10-linux-x86_64-redist.jar/org/bytedeco/cuda/linux-x86_64/libcudnn_adv_infer.so.8
Debug: Loading /home/ubuntu/.javacpp/cache/cuda-12.3-8.9-1.5.10-linux-x86_64-redist.jar/org/bytedeco/cuda/linux-x86_64/libcudnn_adv_train.so.8
Debug: Loading /home/ubuntu/.javacpp/cache/cuda-12.3-8.9-1.5.10-linux-x86_64-redist.jar/org/bytedeco/cuda/linux-x86_64/libcudnn_cnn_infer.so.8
Debug: Loading /home/ubuntu/.javacpp/cache/cuda-12.3-8.9-1.5.10-linux-x86_64-redist.jar/org/bytedeco/cuda/linux-x86_64/libcudnn_cnn_train.so.8
Debug: Loading /home/ubuntu/.javacpp/cache/tensorflow-core-native-1.0.0-linux-x86_64-gpu.jar/org/tensorflow/internal/c_api/linux-x86_64-gpu/libtensorflow_cc.so.2
2025-02-09 22:28:42.656219: E external/local_xla/xla/stream_executor/cuda/cuda_fft.cc:479] Unable to register cuFFT factory: Attempting to register factory for plugin cuFFT when one has already been registered
2025-02-09 22:28:42.690265: E external/local_xla/xla/stream_executor/cuda/cuda_dnn.cc:10575] Unable to register cuDNN factory: Attempting to register factory for plugin cuDNN when one has already been registered
2025-02-09 22:28:42.690311: E external/local_xla/xla/stream_executor/cuda/cuda_blas.cc:1442] Unable to register cuBLAS factory: Attempting to register factory for plugin cuBLAS when one has already been registered
Debug: Loading /home/ubuntu/.javacpp/cache/tensorflow-core-native-1.0.0-linux-x86_64-gpu.jar/org/tensorflow/internal/c_api/linux-x86_64-gpu/libtensorflow_framework.so.2
Debug: Loading /home/ubuntu/.javacpp/cache/tensorflow-core-native-1.0.0-linux-x86_64-gpu.jar/org/tensorflow/internal/c_api/linux-x86_64-gpu/libjnitensorflow.so
Debug: Loading class org.bytedeco.javacpp.presets.javacpp
Debug: Loading class org.bytedeco.javacpp.Pointer
Debug: Loading library jnijavacpp
Debug: Failed to load for jnijavacpp: java.lang.UnsatisfiedLinkError: no jnijavacpp in java.library.path: /usr/java/packages/lib:/usr/lib/x86_64-linux-gnu/jni:/lib/x86_64-linux-gnu:/usr/lib/x86_64-linux-gnu:/usr/lib/jni:/lib:/usr/lib
Debug: Could not load Pointer: java.lang.UnsatisfiedLinkError: no jnijavacpp in java.library.path: /usr/java/packages/lib:/usr/lib/x86_64-linux-gnu/jni:/lib/x86_64-linux-gnu:/usr/lib/x86_64-linux-gnu:/usr/lib/jni:/lib:/usr/lib
Debug: Loading class org.bytedeco.javacpp.presets.javacpp
Debug: Loading class org.bytedeco.javacpp.BytePointer
Debug: Opening org.bytedeco.javacpp.PointerScope@377ea861
Debug: Registering org.tensorflow.internal.c_api.TFE_ContextOptions[address=0x7eeab5d475b0,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTFE_ContextOptions$DeleteDeallocator[address=0x7eeab5d475b0,position=0,limit=0,capacity=0,deallocator=null],count=0]]
Debug: Attaching org.tensorflow.internal.c_api.TFE_ContextOptions[address=0x7eeab5d475b0,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTFE_ContextOptions$DeleteDeallocator[address=0x7eeab5d475b0,position=0,limit=0,capacity=0,deallocator=null],count=0]] to org.bytedeco.javacpp.PointerScope@377ea861
Debug: Registering org.tensorflow.internal.c_api.TF_Status[address=0x7eeab5d48b40,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab5d48b40,position=0,limit=0,capacity=0,deallocator=null],count=0]]
Debug: Attaching org.tensorflow.internal.c_api.TF_Status[address=0x7eeab5d48b40,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab5d48b40,position=0,limit=0,capacity=0,deallocator=null],count=0]] to org.bytedeco.javacpp.PointerScope@377ea861
2025-02-09 22:28:42.749427: I tensorflow/core/platform/cpu_feature_guard.cc:210] This TensorFlow binary is optimized to use available CPU instructions in performance-critical operations.
To enable the following instructions: AVX2 FMA, in other operations, rebuild TensorFlow with the appropriate compiler flags.
2025-02-09 22:28:42.878487: I external/local_xla/xla/stream_executor/cuda/cuda_executor.cc:998] successful NUMA node read from SysFS had negative value (-1), but there must be at least one NUMA node, so returning NUMA node zero. See more at https://github.com/torvalds/linux/blob/v6.0/Documentation/ABI/testing/sysfs-bus-pci#L344-L355
2025-02-09 22:28:42.882108: I external/local_xla/xla/stream_executor/cuda/cuda_executor.cc:998] successful NUMA node read from SysFS had negative value (-1), but there must be at least one NUMA node, so returning NUMA node zero. See more at https://github.com/torvalds/linux/blob/v6.0/Documentation/ABI/testing/sysfs-bus-pci#L344-L355
2025-02-09 22:28:42.885143: I external/local_xla/xla/stream_executor/cuda/cuda_executor.cc:998] successful NUMA node read from SysFS had negative value (-1), but there must be at least one NUMA node, so returning NUMA node zero. See more at https://github.com/torvalds/linux/blob/v6.0/Documentation/ABI/testing/sysfs-bus-pci#L344-L355
2025-02-09 22:28:43.202258: I external/local_xla/xla/stream_executor/cuda/cuda_executor.cc:998] successful NUMA node read from SysFS had negative value (-1), but there must be at least one NUMA node, so returning NUMA node zero. See more at https://github.com/torvalds/linux/blob/v6.0/Documentation/ABI/testing/sysfs-bus-pci#L344-L355
2025-02-09 22:28:43.204209: I external/local_xla/xla/stream_executor/cuda/cuda_executor.cc:998] successful NUMA node read from SysFS had negative value (-1), but there must be at least one NUMA node, so returning NUMA node zero. See more at https://github.com/torvalds/linux/blob/v6.0/Documentation/ABI/testing/sysfs-bus-pci#L344-L355
2025-02-09 22:28:43.206008: I external/local_xla/xla/stream_executor/cuda/cuda_executor.cc:998] successful NUMA node read from SysFS had negative value (-1), but there must be at least one NUMA node, so returning NUMA node zero. See more at https://github.com/torvalds/linux/blob/v6.0/Documentation/ABI/testing/sysfs-bus-pci#L344-L355
2025-02-09 22:28:43.207749: I tensorflow/core/common_runtime/gpu/gpu_device.cc:1928] Created device /job:localhost/replica:0/task:0/device:GPU:0 with 13764 MB memory:  -> device: 0, name: Tesla T4, pci bus id: 0000:00:04.0, compute capability: 7.5
Debug: Closing org.bytedeco.javacpp.PointerScope@377ea861
Debug: Releasing org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab5d48b40,position=0,limit=0,capacity=0,deallocator=null],count=0]
Debug: Releasing org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTFE_ContextOptions$DeleteDeallocator[address=0x7eeab5d475b0,position=0,limit=0,capacity=0,deallocator=null],count=0]
Debug: Loading class org.tensorflow.internal.c_api.global.tensorflow
Debug: Loading class org.tensorflow.internal.c_api.Deallocator_Pointer_long_Pointer
Debug: Registering org.tensorflow.internal.c_api.AbstractTF_Tensor$1[address=0x7eeab6f52950,position=0,limit=1,capacity=1,deallocator=org.bytedeco.javacpp.Pointer$NativeDeallocator[ownerAddress=0x7eeab6f52950,deallocatorAddress=0x7eebafe8cd40]]
Debug: Registering org.tensorflow.internal.c_api.TF_Tensor[address=0x7eeab6f52af0,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Tensor$DeleteDeallocator[address=0x7eeab6f52af0,position=0,limit=0,capacity=0,deallocator=null],count=0]]
Debug: Opening org.bytedeco.javacpp.PointerScope@6d6f2a7e
Debug: Attaching org.tensorflow.internal.c_api.TF_Tensor[address=0x7eeab6f52af0,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Tensor$DeleteDeallocator[address=0x7eeab6f52af0,position=0,limit=0,capacity=0,deallocator=null],count=0]] to org.bytedeco.javacpp.PointerScope@6d6f2a7e
Debug: Extending org.bytedeco.javacpp.PointerScope@6d6f2a7e
Debug: Closing org.bytedeco.javacpp.PointerScope@6d6f2a7e
Debug: Opening org.bytedeco.javacpp.PointerScope@1057f0c6
Debug: Registering org.tensorflow.internal.c_api.TF_Status[address=0x7eeab6f7e6a0,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab6f7e6a0,position=0,limit=0,capacity=0,deallocator=null],count=0]]
Debug: Attaching org.tensorflow.internal.c_api.TF_Status[address=0x7eeab6f7e6a0,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab6f7e6a0,position=0,limit=0,capacity=0,deallocator=null],count=0]] to org.bytedeco.javacpp.PointerScope@1057f0c6
Debug: Registering org.tensorflow.internal.c_api.TFE_Op[address=0x7eeab6f67890,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTFE_Op$DeleteDeallocator[address=0x7eeab6f67890,position=0,limit=0,capacity=0,deallocator=null],count=0]]
Debug: Attaching org.tensorflow.internal.c_api.TFE_Op[address=0x7eeab6f67890,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTFE_Op$DeleteDeallocator[address=0x7eeab6f67890,position=0,limit=0,capacity=0,deallocator=null],count=0]] to org.bytedeco.javacpp.PointerScope@1057f0c6
Debug: Closing org.bytedeco.javacpp.PointerScope@1057f0c6
Debug: Releasing org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab6f7e6a0,position=0,limit=0,capacity=0,deallocator=null],count=0]
Debug: Opening org.bytedeco.javacpp.PointerScope@5740652e
Debug: Registering org.tensorflow.internal.c_api.TF_Status[address=0x7eeab6f7e6a0,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab6f7e6a0,position=0,limit=0,capacity=0,deallocator=null],count=0]]
Debug: Attaching org.tensorflow.internal.c_api.TF_Status[address=0x7eeab6f7e6a0,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab6f7e6a0,position=0,limit=0,capacity=0,deallocator=null],count=0]] to org.bytedeco.javacpp.PointerScope@5740652e
Debug: Closing org.bytedeco.javacpp.PointerScope@5740652e
Debug: Releasing org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab6f7e6a0,position=0,limit=0,capacity=0,deallocator=null],count=0]
Debug: Opening org.bytedeco.javacpp.PointerScope@41b9e4f
Debug: Registering org.tensorflow.internal.c_api.TF_Status[address=0x7eeab4a88990,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab4a88990,position=0,limit=0,capacity=0,deallocator=null],count=0]]
Debug: Attaching org.tensorflow.internal.c_api.TF_Status[address=0x7eeab4a88990,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab4a88990,position=0,limit=0,capacity=0,deallocator=null],count=0]] to org.bytedeco.javacpp.PointerScope@41b9e4f
Debug: Closing org.bytedeco.javacpp.PointerScope@41b9e4f
Debug: Releasing org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab4a88990,position=0,limit=0,capacity=0,deallocator=null],count=0]
Debug: Opening org.bytedeco.javacpp.PointerScope@8011da7
Debug: Loading class org.bytedeco.javacpp.presets.javacpp
Debug: Loading class org.bytedeco.javacpp.IntPointer
Debug: Registering org.bytedeco.javacpp.IntPointer[address=0x7eeab5521ea0,position=0,limit=1,capacity=1,deallocator=org.bytedeco.javacpp.Pointer$NativeDeallocator[ownerAddress=0x7eeab5521ea0,deallocatorAddress=0x7eebafed5880]]
Debug: Attaching org.bytedeco.javacpp.IntPointer[address=0x7eeab5521ea0,position=0,limit=1,capacity=1,deallocator=org.bytedeco.javacpp.Pointer$NativeDeallocator[ownerAddress=0x7eeab5521ea0,deallocatorAddress=0x7eebafed5880]] to org.bytedeco.javacpp.PointerScope@8011da7
Debug: Loading class org.bytedeco.javacpp.presets.javacpp
Debug: Loading class org.bytedeco.javacpp.PointerPointer
Debug: Registering org.bytedeco.javacpp.PointerPointer[address=0x7eeab5d114c0,position=0,limit=1000,capacity=1000,deallocator=org.bytedeco.javacpp.Pointer$NativeDeallocator[ownerAddress=0x7eeab5d114c0,deallocatorAddress=0x7eebafed5940]]
Debug: Attaching org.bytedeco.javacpp.PointerPointer[address=0x7eeab5d114c0,position=0,limit=1000,capacity=1000,deallocator=org.bytedeco.javacpp.Pointer$NativeDeallocator[ownerAddress=0x7eeab5d114c0,deallocatorAddress=0x7eebafed5940]] to org.bytedeco.javacpp.PointerScope@8011da7
Debug: Registering org.tensorflow.internal.c_api.TF_Status[address=0x7eeab5522020,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab5522020,position=0,limit=0,capacity=0,deallocator=null],count=0]]
Debug: Attaching org.tensorflow.internal.c_api.TF_Status[address=0x7eeab5522020,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab5522020,position=0,limit=0,capacity=0,deallocator=null],count=0]] to org.bytedeco.javacpp.PointerScope@8011da7
Debug: Registering org.tensorflow.internal.c_api.TFE_TensorHandle[address=0x7eeab5cef5f0,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTFE_TensorHandle$DeleteDeallocator[address=0x7eeab5cef5f0,position=0,limit=0,capacity=0,deallocator=null],count=0]]
Debug: Attaching org.tensorflow.internal.c_api.TFE_TensorHandle[address=0x7eeab5cef5f0,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTFE_TensorHandle$DeleteDeallocator[address=0x7eeab5cef5f0,position=0,limit=0,capacity=0,deallocator=null],count=0]] to org.bytedeco.javacpp.PointerScope@8011da7
Debug: Closing org.bytedeco.javacpp.PointerScope@8011da7
Debug: Releasing org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab5522020,position=0,limit=0,capacity=0,deallocator=null],count=0]
Debug: Releasing org.bytedeco.javacpp.Pointer$NativeDeallocator[ownerAddress=0x7eeab5d114c0,deallocatorAddress=0x7eebafed5940]
Debug: Collecting org.bytedeco.javacpp.Pointer$NativeDeallocator[ownerAddress=0x0,deallocatorAddress=0x0]
Debug: Releasing org.bytedeco.javacpp.Pointer$NativeDeallocator[ownerAddress=0x7eeab5521ea0,deallocatorAddress=0x7eebafed5880]
Debug: Collecting org.bytedeco.javacpp.Pointer$NativeDeallocator[ownerAddress=0x0,deallocatorAddress=0x0]
Debug: Closing org.bytedeco.javacpp.PointerScope@6d6f2a7e
Debug: Releasing org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Tensor$DeleteDeallocator[address=0x7eeab6f52af0,position=0,limit=0,capacity=0,deallocator=null],count=0]
Debug: Registering org.tensorflow.internal.c_api.TF_Tensor[address=0x7eeab5a0c510,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Tensor$DeleteDeallocator[address=0x7eeab5a0c510,position=0,limit=0,capacity=0,deallocator=null],count=0]]
Debug: Opening org.bytedeco.javacpp.PointerScope@6d6fb367
Debug: Attaching org.tensorflow.internal.c_api.TF_Tensor[address=0x7eeab5a0c510,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Tensor$DeleteDeallocator[address=0x7eeab5a0c510,position=0,limit=0,capacity=0,deallocator=null],count=0]] to org.bytedeco.javacpp.PointerScope@6d6fb367
Debug: Extending org.bytedeco.javacpp.PointerScope@6d6fb367
Debug: Closing org.bytedeco.javacpp.PointerScope@6d6fb367
Debug: Opening org.bytedeco.javacpp.PointerScope@40323be1
Debug: Registering org.tensorflow.internal.c_api.TF_Status[address=0x7eeab5a0c180,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab5a0c180,position=0,limit=0,capacity=0,deallocator=null],count=0]]
Debug: Attaching org.tensorflow.internal.c_api.TF_Status[address=0x7eeab5a0c180,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab5a0c180,position=0,limit=0,capacity=0,deallocator=null],count=0]] to org.bytedeco.javacpp.PointerScope@40323be1
Debug: Registering org.tensorflow.internal.c_api.TFE_Op[address=0x7eeab4a83460,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTFE_Op$DeleteDeallocator[address=0x7eeab4a83460,position=0,limit=0,capacity=0,deallocator=null],count=0]]
Debug: Attaching org.tensorflow.internal.c_api.TFE_Op[address=0x7eeab4a83460,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTFE_Op$DeleteDeallocator[address=0x7eeab4a83460,position=0,limit=0,capacity=0,deallocator=null],count=0]] to org.bytedeco.javacpp.PointerScope@40323be1
Debug: Closing org.bytedeco.javacpp.PointerScope@40323be1
Debug: Releasing org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab5a0c180,position=0,limit=0,capacity=0,deallocator=null],count=0]
Debug: Opening org.bytedeco.javacpp.PointerScope@7f79de73
Debug: Registering org.tensorflow.internal.c_api.TF_Status[address=0x7eeab5a0ba60,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab5a0ba60,position=0,limit=0,capacity=0,deallocator=null],count=0]]
Debug: Attaching org.tensorflow.internal.c_api.TF_Status[address=0x7eeab5a0ba60,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab5a0ba60,position=0,limit=0,capacity=0,deallocator=null],count=0]] to org.bytedeco.javacpp.PointerScope@7f79de73
Debug: Closing org.bytedeco.javacpp.PointerScope@7f79de73
Debug: Releasing org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab5a0ba60,position=0,limit=0,capacity=0,deallocator=null],count=0]
Debug: Opening org.bytedeco.javacpp.PointerScope@56f3dbbf
Debug: Registering org.tensorflow.internal.c_api.TF_Status[address=0x7eeab5a0eb50,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab5a0eb50,position=0,limit=0,capacity=0,deallocator=null],count=0]]
Debug: Attaching org.tensorflow.internal.c_api.TF_Status[address=0x7eeab5a0eb50,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab5a0eb50,position=0,limit=0,capacity=0,deallocator=null],count=0]] to org.bytedeco.javacpp.PointerScope@56f3dbbf
Debug: Closing org.bytedeco.javacpp.PointerScope@56f3dbbf
Debug: Releasing org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab5a0eb50,position=0,limit=0,capacity=0,deallocator=null],count=0]
Debug: Opening org.bytedeco.javacpp.PointerScope@4617be8d
Debug: Registering org.bytedeco.javacpp.IntPointer[address=0x7eeab59fefc0,position=0,limit=1,capacity=1,deallocator=org.bytedeco.javacpp.Pointer$NativeDeallocator[ownerAddress=0x7eeab59fefc0,deallocatorAddress=0x7eebafed5880]]
Debug: Attaching org.bytedeco.javacpp.IntPointer[address=0x7eeab59fefc0,position=0,limit=1,capacity=1,deallocator=org.bytedeco.javacpp.Pointer$NativeDeallocator[ownerAddress=0x7eeab59fefc0,deallocatorAddress=0x7eebafed5880]] to org.bytedeco.javacpp.PointerScope@4617be8d
Debug: Registering org.bytedeco.javacpp.PointerPointer[address=0x7eeab5d114c0,position=0,limit=1000,capacity=1000,deallocator=org.bytedeco.javacpp.Pointer$NativeDeallocator[ownerAddress=0x7eeab5d114c0,deallocatorAddress=0x7eebafed5940]]
Debug: Attaching org.bytedeco.javacpp.PointerPointer[address=0x7eeab5d114c0,position=0,limit=1000,capacity=1000,deallocator=org.bytedeco.javacpp.Pointer$NativeDeallocator[ownerAddress=0x7eeab5d114c0,deallocatorAddress=0x7eebafed5940]] to org.bytedeco.javacpp.PointerScope@4617be8d
Debug: Registering org.tensorflow.internal.c_api.TF_Status[address=0x7eeab59fb210,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab59fb210,position=0,limit=0,capacity=0,deallocator=null],count=0]]
Debug: Attaching org.tensorflow.internal.c_api.TF_Status[address=0x7eeab59fb210,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab59fb210,position=0,limit=0,capacity=0,deallocator=null],count=0]] to org.bytedeco.javacpp.PointerScope@4617be8d
Debug: Registering org.tensorflow.internal.c_api.TFE_TensorHandle[address=0x7eeab5ce1fe0,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTFE_TensorHandle$DeleteDeallocator[address=0x7eeab5ce1fe0,position=0,limit=0,capacity=0,deallocator=null],count=0]]
Debug: Attaching org.tensorflow.internal.c_api.TFE_TensorHandle[address=0x7eeab5ce1fe0,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTFE_TensorHandle$DeleteDeallocator[address=0x7eeab5ce1fe0,position=0,limit=0,capacity=0,deallocator=null],count=0]] to org.bytedeco.javacpp.PointerScope@4617be8d
Debug: Closing org.bytedeco.javacpp.PointerScope@4617be8d
Debug: Releasing org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab59fb210,position=0,limit=0,capacity=0,deallocator=null],count=0]
Debug: Releasing org.bytedeco.javacpp.Pointer$NativeDeallocator[ownerAddress=0x7eeab5d114c0,deallocatorAddress=0x7eebafed5940]
Debug: Collecting org.bytedeco.javacpp.Pointer$NativeDeallocator[ownerAddress=0x0,deallocatorAddress=0x0]
Debug: Releasing org.bytedeco.javacpp.Pointer$NativeDeallocator[ownerAddress=0x7eeab59fefc0,deallocatorAddress=0x7eebafed5880]
Debug: Collecting org.bytedeco.javacpp.Pointer$NativeDeallocator[ownerAddress=0x0,deallocatorAddress=0x0]
Debug: Closing org.bytedeco.javacpp.PointerScope@6d6fb367
Debug: Releasing org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Tensor$DeleteDeallocator[address=0x7eeab5a0c510,position=0,limit=0,capacity=0,deallocator=null],count=0]
Debug: Opening org.bytedeco.javacpp.PointerScope@156e9796
Debug: Registering org.tensorflow.internal.c_api.TF_Status[address=0x7eeab4a8ee50,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab4a8ee50,position=0,limit=0,capacity=0,deallocator=null],count=0]]
Debug: Attaching org.tensorflow.internal.c_api.TF_Status[address=0x7eeab4a8ee50,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab4a8ee50,position=0,limit=0,capacity=0,deallocator=null],count=0]] to org.bytedeco.javacpp.PointerScope@156e9796
Debug: Registering org.tensorflow.internal.c_api.TFE_Op[address=0x7eeab71637a0,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTFE_Op$DeleteDeallocator[address=0x7eeab71637a0,position=0,limit=0,capacity=0,deallocator=null],count=0]]
Debug: Attaching org.tensorflow.internal.c_api.TFE_Op[address=0x7eeab71637a0,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTFE_Op$DeleteDeallocator[address=0x7eeab71637a0,position=0,limit=0,capacity=0,deallocator=null],count=0]] to org.bytedeco.javacpp.PointerScope@156e9796
Debug: Closing org.bytedeco.javacpp.PointerScope@156e9796
Debug: Releasing org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab4a8ee50,position=0,limit=0,capacity=0,deallocator=null],count=0]
Debug: Opening org.bytedeco.javacpp.PointerScope@402acae3
Debug: Registering org.tensorflow.internal.c_api.TF_Status[address=0x7eeab55219d0,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab55219d0,position=0,limit=0,capacity=0,deallocator=null],count=0]]
Debug: Attaching org.tensorflow.internal.c_api.TF_Status[address=0x7eeab55219d0,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab55219d0,position=0,limit=0,capacity=0,deallocator=null],count=0]] to org.bytedeco.javacpp.PointerScope@402acae3
Debug: Closing org.bytedeco.javacpp.PointerScope@402acae3
Debug: Releasing org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab55219d0,position=0,limit=0,capacity=0,deallocator=null],count=0]
Debug: Opening org.bytedeco.javacpp.PointerScope@7204940a
Debug: Registering org.tensorflow.internal.c_api.TF_Status[address=0x7eeab49e8360,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab49e8360,position=0,limit=0,capacity=0,deallocator=null],count=0]]
Debug: Attaching org.tensorflow.internal.c_api.TF_Status[address=0x7eeab49e8360,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab49e8360,position=0,limit=0,capacity=0,deallocator=null],count=0]] to org.bytedeco.javacpp.PointerScope@7204940a
Debug: Closing org.bytedeco.javacpp.PointerScope@7204940a
Debug: Releasing org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab49e8360,position=0,limit=0,capacity=0,deallocator=null],count=0]
Debug: Opening org.bytedeco.javacpp.PointerScope@6c3ec32b
Debug: Registering org.tensorflow.internal.c_api.TF_Status[address=0x7eeab49d7740,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab49d7740,position=0,limit=0,capacity=0,deallocator=null],count=0]]
Debug: Attaching org.tensorflow.internal.c_api.TF_Status[address=0x7eeab49d7740,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab49d7740,position=0,limit=0,capacity=0,deallocator=null],count=0]] to org.bytedeco.javacpp.PointerScope@6c3ec32b
Debug: Closing org.bytedeco.javacpp.PointerScope@6c3ec32b
Debug: Releasing org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab49d7740,position=0,limit=0,capacity=0,deallocator=null],count=0]
Debug: Opening org.bytedeco.javacpp.PointerScope@4942fee
Debug: Registering org.bytedeco.javacpp.IntPointer[address=0x7eeab49d4990,position=0,limit=1,capacity=1,deallocator=org.bytedeco.javacpp.Pointer$NativeDeallocator[ownerAddress=0x7eeab49d4990,deallocatorAddress=0x7eebafed5880]]
Debug: Attaching org.bytedeco.javacpp.IntPointer[address=0x7eeab49d4990,position=0,limit=1,capacity=1,deallocator=org.bytedeco.javacpp.Pointer$NativeDeallocator[ownerAddress=0x7eeab49d4990,deallocatorAddress=0x7eebafed5880]] to org.bytedeco.javacpp.PointerScope@4942fee
Debug: Registering org.bytedeco.javacpp.PointerPointer[address=0x7eeab5d114c0,position=0,limit=1000,capacity=1000,deallocator=org.bytedeco.javacpp.Pointer$NativeDeallocator[ownerAddress=0x7eeab5d114c0,deallocatorAddress=0x7eebafed5940]]
Debug: Attaching org.bytedeco.javacpp.PointerPointer[address=0x7eeab5d114c0,position=0,limit=1000,capacity=1000,deallocator=org.bytedeco.javacpp.Pointer$NativeDeallocator[ownerAddress=0x7eeab5d114c0,deallocatorAddress=0x7eebafed5940]] to org.bytedeco.javacpp.PointerScope@4942fee
Debug: Registering org.tensorflow.internal.c_api.TF_Status[address=0x7eeab49d5ec0,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab49d5ec0,position=0,limit=0,capacity=0,deallocator=null],count=0]]
Debug: Attaching org.tensorflow.internal.c_api.TF_Status[address=0x7eeab49d5ec0,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab49d5ec0,position=0,limit=0,capacity=0,deallocator=null],count=0]] to org.bytedeco.javacpp.PointerScope@4942fee
Debug: Registering org.tensorflow.internal.c_api.TFE_TensorHandle[address=0x7eeab6f653e0,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTFE_TensorHandle$DeleteDeallocator[address=0x7eeab6f653e0,position=0,limit=0,capacity=0,deallocator=null],count=0]]
Debug: Attaching org.tensorflow.internal.c_api.TFE_TensorHandle[address=0x7eeab6f653e0,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTFE_TensorHandle$DeleteDeallocator[address=0x7eeab6f653e0,position=0,limit=0,capacity=0,deallocator=null],count=0]] to org.bytedeco.javacpp.PointerScope@4942fee
Debug: Closing org.bytedeco.javacpp.PointerScope@4942fee
Debug: Releasing org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab49d5ec0,position=0,limit=0,capacity=0,deallocator=null],count=0]
Debug: Releasing org.bytedeco.javacpp.Pointer$NativeDeallocator[ownerAddress=0x7eeab5d114c0,deallocatorAddress=0x7eebafed5940]
Debug: Collecting org.bytedeco.javacpp.Pointer$NativeDeallocator[ownerAddress=0x0,deallocatorAddress=0x0]
Debug: Releasing org.bytedeco.javacpp.Pointer$NativeDeallocator[ownerAddress=0x7eeab49d4990,deallocatorAddress=0x7eebafed5880]
Debug: Collecting org.bytedeco.javacpp.Pointer$NativeDeallocator[ownerAddress=0x0,deallocatorAddress=0x0]
Debug: Opening org.bytedeco.javacpp.PointerScope@127f804d
Debug: Registering org.tensorflow.internal.c_api.TF_Status[address=0x7eeab5a0b9c0,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab5a0b9c0,position=0,limit=0,capacity=0,deallocator=null],count=0]]
Debug: Attaching org.tensorflow.internal.c_api.TF_Status[address=0x7eeab5a0b9c0,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab5a0b9c0,position=0,limit=0,capacity=0,deallocator=null],count=0]] to org.bytedeco.javacpp.PointerScope@127f804d
Debug: Registering org.tensorflow.internal.c_api.TF_Tensor[address=0x7eeab5522650,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Tensor$DeleteDeallocator[address=0x7eeab5522650,position=0,limit=0,capacity=0,deallocator=null],count=0]]
Debug: Attaching org.tensorflow.internal.c_api.TF_Tensor[address=0x7eeab5522650,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Tensor$DeleteDeallocator[address=0x7eeab5522650,position=0,limit=0,capacity=0,deallocator=null],count=0]] to org.bytedeco.javacpp.PointerScope@127f804d
Debug: Opening org.bytedeco.javacpp.PointerScope@448df2cc
Debug: Attaching org.tensorflow.internal.c_api.TF_Tensor[address=0x7eeab5522650,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Tensor$DeleteDeallocator[address=0x7eeab5522650,position=0,limit=0,capacity=0,deallocator=null],count=1]] to org.bytedeco.javacpp.PointerScope@448df2cc
Debug: Extending org.bytedeco.javacpp.PointerScope@448df2cc
Debug: Closing org.bytedeco.javacpp.PointerScope@448df2cc
Debug: Detaching org.tensorflow.internal.c_api.TF_Tensor[address=0x7eeab5522650,position=0,limit=0,capacity=0,deallocator=org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Tensor$DeleteDeallocator[address=0x7eeab5522650,position=0,limit=0,capacity=0,deallocator=null],count=3]] from org.bytedeco.javacpp.PointerScope@448df2cc
Debug: Closing org.bytedeco.javacpp.PointerScope@127f804d
Debug: Releasing org.bytedeco.javacpp.Pointer$DeallocatorReference[deallocator=org.tensorflow.internal.c_api.AbstractTF_Status$DeleteDeallocator[address=0x7eeab5a0b9c0,position=0,limit=0,capacity=0,deallocator=null],count=0]
[3.0, 6.0, 10.0]
Debug: Closing org.bytedeco.javacpp.PointerScope@448df2cc
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.678 s
[INFO] Finished at: 2025-02-09T22:28:43+09:00
[INFO] ------------------------------------------------------------------------
```
