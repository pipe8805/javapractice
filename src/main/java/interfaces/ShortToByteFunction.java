package interfaces;

import java.util.stream.Stream;

@FunctionalInterface
public interface ShortToByteFunction {

    byte applyAsByte(short s);

}

class InvokeInterface{
    public byte[] transformArray(short[] array, ShortToByteFunction function) {
        byte[] transformedArray = new byte[array.length];
        for (int i = 0; i < array.length; i++) {
            transformedArray[i] = function.applyAsByte(array[i]);
        }
        return transformedArray;
    }

    public static  void main(String args[]){
        InvokeInterface invokeInterface=new InvokeInterface();
        short[] array = {(short) 1, (short) 2, (short) 3};
        byte[] transformedArray = invokeInterface.transformArray(array, s -> (byte) (s * 2));

        byte[] expectedArray = {(byte) 2, (byte) 4, (byte) 6};
        for(int i=0;i<transformedArray.length;i++){
            System.out.println(transformedArray[i]);

        }
    }
}