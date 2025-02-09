import org.tensorflow.DeviceSpec;
import org.tensorflow.DeviceSpec.DeviceType;
import org.tensorflow.ndarray.StdArrays;
import org.tensorflow.op.Ops;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Ops tf = Ops.create().withDevice(
                //DeviceSpec.newBuilder().deviceType(DeviceType.CPU).build()
                DeviceSpec.newBuilder().deviceType(DeviceType.GPU).deviceIndex(0).build()
        );

        var x = tf.array(1f, 2f, 4f);
        var y = tf.array(2f, 4f, 6f);
        var z = tf.math.add(x, y);
        try (var zTensor = z.asTensor()) {
            System.out.println(Arrays.toString(StdArrays.array1dCopyOf(zTensor)));
        }
    }
}
