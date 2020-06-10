package com.vsam_api.openlegacy.util;

import com.google.common.primitives.Bytes;
import net.sf.JRecord.Common.Conversion;
import org.apache.commons.lang3.StringUtils;
import org.openlegacy.utils.ByteUtils;
import org.openlegacy.utils.CastUtil;

import java.math.BigDecimal;
import java.math.BigInteger;

public class VsamConvertUtil {

    private final static String MF_FONT = "CP037";

    public static String convertNumZeroPaddedPositive(Integer value, Integer length) {
        if(value == null)
            value = 0;
        BigDecimal decimalValue = CastUtil.cast(value, BigDecimal.class);
        byte[] fieldData = new byte[length];
        String codePage = "cp037";
        copyRightJust(fieldData, decimalValue.toString(), length, "0", codePage);
        return ByteUtils.bytesToHex(fieldData);
    }

    public static String convertNumZeroPaddedPositive(BigInteger value, Integer length) {
        if(value == null)
            value = new BigInteger("0");
        BigDecimal decimalValue = CastUtil.cast(value, BigDecimal.class);
        byte[] fieldData = new byte[length];
        String codePage = "cp037";
        copyRightJust(fieldData, decimalValue.toString(), length, "0", codePage);
        return ByteUtils.bytesToHex(fieldData);
    }

    public static String convertPackedDecimal(Integer value, Integer length, Integer decimalPlace) {
        if(value == null)
            value = 0;
        BigDecimal decimalValue = CastUtil.cast(value, BigDecimal.class);
        byte[] fieldData = new byte[length];
        String val = toDigits(decimalPlace, decimalValue);
        val = val.startsWith("-") ? val.substring(1) + "D" : val + "C";
        Conversion.setBigInt(fieldData, 0, length, new BigInteger(val, 16), true);
        return ByteUtils.bytesToHex(fieldData);
    }

    private static String toDigits(Integer decimalPlace, BigDecimal value) {
        value = value.scaleByPowerOfTen(decimalPlace);
        return value.toPlainString();
    }

    public static String convertChar(String value, Integer length) {
        if(value == null)
            value = "";
        String newValue = value + StringUtils.repeat(' ', length - value.length());
        return ByteUtils.bytesToHex(Conversion.getBytes(newValue, MF_FONT));
    }

    public static String convertByteArray(byte[] value, Integer length) {
        if(value == null)
            value = Conversion.getBytes("", MF_FONT);
        if(value.length < length)
            value = Bytes.concat(value, Conversion.getBytes(StringUtils.repeat(' ', length - value.length), MF_FONT));
        return ByteUtils.bytesToHex(value);
    }

    private static void copyRightJust(byte[] record, String val, Integer len, String pad, String font) {
        Integer l = val.length();
        if (l == len) {
            System.arraycopy(Conversion.getBytes(val, font), 0, record, 0, len);
        } else {
            padWith(record, len - val.length(), pad, font);
            System.arraycopy(Conversion.getBytes(val, font), 0, record, len - val.length(), val.length());
        }
    }

    private static void padWith(byte[] record, Integer len, String padCh, String font) {
        byte padByte = Conversion.getBytes(padCh, font)[0];
        int i = 0;
        while (i < len) {
            record[i] = padByte;
            i++;
        }
    }
}
