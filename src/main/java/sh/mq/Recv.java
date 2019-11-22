package sh.mq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

public class Recv {

	private final static String[] QUEUE_NAME = { "hello1", "hello2" };

	// verify:2019001 verify:2019002

	public static void main(String[] argv) throws Exception {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("116.62.28.180");
		factory.setPort(5672);
		factory.setUsername("anyi");
		factory.setPassword("QmA17YugOQq");

		Connection connection = factory.newConnection();
		Channel channel = connection.createChannel();

		for (int i = 0; i < QUEUE_NAME.length; i++) {

			channel.queueDeclare(QUEUE_NAME[i], false, false, false, null);

			System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

			DeliverCallback deliverCallback = (consumerTag, delivery) -> {
				String message = new String(delivery.getBody(), "UTF-8");
				System.out.println(" [x] Received '" + message + "'");
			};
			channel.basicConsume(QUEUE_NAME[i], true, deliverCallback, consumerTag -> {
			});

		}

	}

}
