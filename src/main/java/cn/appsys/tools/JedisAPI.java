package cn.appsys.tools;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class JedisAPI {

//    //到时候applicationContext-mybatis.xml中使用Spring进行依赖注入
//    private JedisPool jedisPool; //已经有一个连接池
//    //alt + insert
//
//    //1、向JeidsPool连接池中拿出一个连接对象
//    public Jedis getJedis() {
//        return jedisPool.getResource();
//    }
//
//    //赋值
//    public String set(String key,String value) {
//        Jedis jedis = getJedis();
//        String result = jedis.set(key,value);
//        jedisPool.returnResource(jedis); //释放jedis所占用的资源。
//        return result;
//    }
//
//    //赋值并设置有效期
//    public String set(String key,int seconds, String value) {
//        Jedis jedis = getJedis();
//        //将key-value保存到redis数据库中，并设置key的有效期为seconds秒。
//        String result = jedis.setex(key, seconds, value);
//        jedisPool.returnResource(jedis); //释放jedis所占用的资源。
//        return result;
//    }
//
//    //取值
//    public String get(String key) {
//        Jedis jedis = getJedis();
//        String value = jedis.get(key);
//        jedisPool.returnResource(jedis); //释放jedis所占用的资源。
//        return value;
//    }
//    //删除
//    public long del(String key) {
//        Jedis jedis = getJedis();
//        long result = jedis.del(key);
//        jedisPool.returnResource(jedis); //释放jedis所占用的资源。
//        return result;
//    }
//
//    //判断指定的key在redis数据库是否存在
//    public boolean exists(String key) {
//        Jedis jedis = getJedis();
//        boolean isExists = jedis.exists(key);
//        jedisPool.returnResource(jedis); //释放jedis所占用的资源。
//        return isExists;
//    }
//
//    //查询指定key在redis数据库中的有效时间
//    public long ttl(String key) {
//        Jedis jedis = getJedis();
//        long seconds = jedis.ttl(key);
//        jedisPool.returnResource(jedis); //释放jedis所占用的资源。
//        return seconds;
//    }
//
//    public JedisPool getJedisPool() {
//        return jedisPool;
//    }
//
//    public void setJedisPool(JedisPool jedisPool) {
//        this.jedisPool = jedisPool;
//    }

}
