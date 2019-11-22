package sh.mq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class Send {

	private final static String QUEUE_NAME = "hello3 ";

	public static void main(String[] argv) throws Exception {

		ConnectionFactory factory = new ConnectionFactory();

		factory.setHost("116.62.28.180");
		factory.setPort(5672);
		factory.setUsername("anyi");
		factory.setPassword("QmA17YugOQq");

//  "url": "amqp://anyi:QmA17YugOQq@116.62.28.180:5672"

		try (Connection connection = factory.newConnection(); Channel channel = connection.createChannel()) {
			channel.queueDeclare(QUEUE_NAME, false, false, false, null);
			String message = "Hello World!  2";
			channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
			System.out.println(" [x] Sent '" + message + "'");
		}

	}

}
