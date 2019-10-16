package com.doudou.myredis;

/**
 * @author 豆豆
 * @date 2019/8/28 21:28
 * @flag 以万物智能，化百千万亿身
 */
public interface MyJedisCommands {
    String SPLIT_CAHR = ":";

    /**
     * Time complexity: O(1)。
     * <p>If key already exists and is a string,
     * this command appends the value at the end
     * of the string. If key does not exist it
     * is created and set as an empty string,
     * so APPEND will be similar to SET in
     * this special case.</p>
     * @param key
     * @param value
     * @return
     */
    boolean append(String key, String value);

    /**
     *
     * @param password
     * @return
     */
    String auth(String password);

    /**
     * <p>
     * 时间复杂度：O(N) 将要被删除的key的数量，当删除的key是字符串以外的复杂数据类型时比如List,Set,Hash删除这个key的时间复杂度是O(1)。
     *
     * 删除指定的一批keys，如果删除中的某些key不存在，则直接忽略。
     * </p>
     * @param keys
     * @return
     */
    Integer delete(String... keys);

    /**
     * get byte array data by byte array key
     * @param key
     * @return
     */
    byte[] get(byte[] key);


}
