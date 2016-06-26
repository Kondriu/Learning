package dima.homework9.dataConnverter;

import org.bouncycastle.util.encoders.Hex;

/**
 * Created by dmitriy on 05.06.16.
 * binary <-> hex,
 * binary <-> decimal,
 * hex <-> decimal.
 */

public class ClassDataConverter {

    public static int lHex, lBinary, lDecimal;
    public static String sHex, sBinary, sDecimal;

    public static String BinaryToHex (String sBinary){
        try {
            //StringBuilder hex = new StringBuilder();
            int hex = (Integer.parseInt(sBinary, 2));
            sHex = Integer.toString(hex);
        } catch (NumberFormatException e) {
            System.out.println("число не бинарное");
        }
        return sHex;
    }


    public static String HexToDecimal (String sHex){
        try {
            int dec = (Integer.parseInt(sHex, 16));
            sDecimal = Integer.toString(dec);
        } catch (NumberFormatException e){
            System.out.println("не верный формат");
        }
        return sDecimal;
    }
}
