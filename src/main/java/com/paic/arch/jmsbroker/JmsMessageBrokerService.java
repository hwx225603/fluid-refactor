package com.paic.arch.jmsbroker;
/**
 * 定义服务类接口
* @create by wei.hu on 2018年2月24日 下午7:34:55
 */
public interface JmsMessageBrokerService {
	
	//绑定broker
	public void bindToBrokerAtUrl(String aBrokerUrl);
	//获取url
	public String getBrokerUrl();
	//消息发送
	public void sendMessage(String aDestinationName,String aMessage);
	//获取消息
	public String getMessage(String aDestinationName,long aTime);
	//获取消息条数
	public long getMessageCount(String aDestinationName);
	//判断队列是否为空
	public boolean isEmptyQueueAt(String aDestinationName);
	//启动broker
	public void startBroker();
	//停止broker
	public void stopBroker();
		
}
