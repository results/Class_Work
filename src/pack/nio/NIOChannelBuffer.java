package pack.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOChannelBuffer {

	public static void main(String[] args) throws IOException {
		channelIO();
	}
	
	
	public static void channelIO() throws IOException {
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		FileChannel channel = null;
		FileChannel channelOut = null;
		ByteBuffer buffer = null;
		try {
			fileInputStream = new FileInputStream(".\\test.txt");
			fileOutputStream = new FileOutputStream(".\\transfer.txt");
			channel = fileInputStream.getChannel();
			channelOut = fileOutputStream.getChannel();
			buffer = ByteBuffer.allocate((int)(channel.size()));
			channel.read(buffer);
			buffer.flip();
			while(buffer.hasRemaining()) {
				channelOut.write(buffer, buffer.position());
			}
	        buffer.clear();
		} finally {
			fileInputStream.close();
			channel.close();
			fileOutputStream.close();
			channelOut.close();
		}
	}

}
