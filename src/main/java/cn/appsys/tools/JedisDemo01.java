package cn.appsys.tools;

import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisDemo01 {
//    @Test
//    public void testJedis() {
//        Jedis jedis = new Jedis("192.168.235.128", 6379);
//        //jedis.auth("123456");  //密码
//        jedis.set("uname", "xiaohua");  //将kye为uname值为xiaohua存入redis数据库中。
//        String value = jedis.get("uname");  //取出key为uname的值
//        System.out.println("uanme的值为："+ value);
//        jedis.del("uname");
//        jedis.expire("uname", 6);
//        long seconds = jedis.ttl("uname");
//        boolean isfalg = jedis.exists("uname");
//    }
//
//    @Test
//    public void testJedisPool () {
//        //1、初始化JedisPoolConfig对象
//        JedisPoolConfig config = new JedisPoolConfig();
//        //设置连接池最大的连接数量
//        config.setMaxTotal(100);
//        //设置连接池处于空闲状态时的最大连接数量
//        config.setMaxIdle(10);
//        //2、创建Jedis连接池对象    alt + 回车  导包
//        JedisPool jedisPool = new JedisPool(config, "192.168.235.128", 6379);
//        //3、从连接池中取一个Jedis对象出来
//        Jedis jedis = jedisPool.getResource();
//        jedis.set("pwd", "123456");
//        System.out.println("pwd的值为：" + jedis.get("pwd"));
//    }


}
