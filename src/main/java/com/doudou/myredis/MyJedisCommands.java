package com.doudou.myredis;

/**
 * @author 豆豆
 * @date 2019/8/28 21:28
 * @flag 以万物智能，化百千万亿身
 */
public interface MyJedisCommands {
    String SPLIT_CAHR = ":";

    /**
     * get byte array data by byte array key
     * @param key
     * @return
     */
    byte[] get(byte[] key);


}
