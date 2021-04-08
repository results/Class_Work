package pack.nio;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOChannelBuffer {

	public static void main(String[] args) throws IOException {
		//String path = Paths.get(".\\nio.txt").;
		FileInputStream fileInputStream = null;
		FileChannel channel = null;
		ByteBuffer buffer = null;
		try {
			fileInputStream = new FileInputStream(".\\test.txt");
			channel = fileInputStream.getChannel();
			buffer = ByteBuffer.allocate((int)channel.size());
			channel.read(buffer);
			buffer.flip();
			while(buffer.hasRemaining()) {
					System.out.print((char)buffer.get());				
			}
		} finally {
			fileInputStream.close();
			channel.close();
			buffer.clear();
		}
	}

}
