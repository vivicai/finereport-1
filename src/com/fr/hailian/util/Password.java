package com.fr.hailian.util;

import java.security.MessageDigest;

/** */
/**
 * 对密码进行加密和验证的程序
 * 
 * @author joe
 *
 */

public class Password {

    // 十六进制下数字到字符的映射数组
    private final static String[] hexDigits = { "0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };

    /** */
    /** 把inputString加密 */
    public static String createPassword(String inputString) {
        return encodeByMD5(inputString);
    }

    /** */
    /**
     * 验证输入的密码是否正确
     * 
     * @param password
     *            真正的密码（加密后的真密码）
     * @param inputString
     *            输入的字符串
     * @return 验证结果，boolean类型
     */
    public static boolean authenticatePassword(String password,
            String inputString) {
        if (password.equals(encodeByMD5(inputString))) {
            return true;
        } else {
            return false;
        }
    }

    /** */
    /** 对字符串进行MD5加密 */
    private static String encodeByMD5(String originString) {
        if (originString != null) {
            try {
                // 创建具有指定算法名称的信息摘要
                MessageDigest md = MessageDigest.getInstance("MD5");
                // 使用指定的字节数组对摘要进行最后更新，然后完成摘要计算
                byte[] results = md.digest(originString.getBytes());
                // 将得到的字节数组变成字符串返回
                String resultString = byteArrayToHexString(results);
                return resultString.toUpperCase();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }

    /** */
    /**
     * 转换字节数组为十六进制字符串
     * 
     * @param b
     *            字节数组
     * @return 十六进制字符串
     */
    private static String byteArrayToHexString(byte[] b) {
        StringBuffer resultSb = new StringBuffer();
        for (int i = 0; i < b.length; i++) {
            resultSb.append(byteToHexString(b[i]));
        }
        return resultSb.toString();
    }

    /** */
    /** 将一个字节转化成十六进制形式的字符串 */
    private static String byteToHexString(byte b) {
        int n = b;
        if (n < 0)
            n = 256 + n;
        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigits[d1] + hexDigits[d2];
    }

    public static void main(String[] args) {
        String password = Password.createPassword("547734");
        String password1 = Password
                .createPassword("现在项目中，有很多基于安全的考虑，所以学习关于加密的知识已显得很重要啦，先上传一小例子，希望对大家有");
        System.out.println(password);
        System.out.println(password1);
        // System.out.println("8888与密码匹配？" +
        // Password.authenticatePassword(password, inputString));
    }

}