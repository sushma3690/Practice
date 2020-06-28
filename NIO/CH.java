package NIO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;


//async handling in java for file read
public class CH {



	public static final int BUFF_SIZE=1024;
	public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {

		System.out.println(" enetered");
		String inFile="C:\\Users\\karsushm\\Desktop\\Rampup\\dummy.txt";
		ByteBuffer dst = ByteBuffer.allocate(BUFF_SIZE);
		ByteBuffer attch = ByteBuffer.allocate(BUFF_SIZE);
		long position=0;

		AsynchronousFileChannel inChannel = AsynchronousFileChannel.open(Paths.get(inFile), StandardOpenOption.READ);
		inChannel.read(dst, position, attch, new CompletionHandler<Integer, ByteBuffer>() {


			@Override
			public void completed(Integer result, ByteBuffer attachment) {
				// TODO Auto-generated method stub
				System.out.println(" completed ");
				System.out.println(result);
				System.out.println(" Done Reading"+result);
				System.out.println(" attachment "+attachment);


				
			}

			@Override
			public void failed(Throwable exc, ByteBuffer attachment) {
				// TODO Auto-generated method stub
				// TODO Auto-generated method stub
				System.out.println(" failed ");
				System.out.println(" attachment "+attachment);

				
			}

		});







	}



}
