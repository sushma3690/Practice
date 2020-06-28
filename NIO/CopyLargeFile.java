package NIO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CopyLargeFile {

	public static final int BUFF_SIZE=1024;
	public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {

		String inFile="C:\\Users\\karsushm\\Desktop\\Rampup\\dummy.txt";
		String outFile="C:\\Users\\karsushm\\Desktop\\Rampup\\dummy1.txt";
		 
		AsynchronousFileChannel inChannel = AsynchronousFileChannel.open(Paths.get(inFile));

		AsynchronousFileChannel outChannel = AsynchronousFileChannel.open(Paths.get(outFile),StandardOpenOption.CREATE,
				StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);

		ByteBuffer dst = ByteBuffer.allocate(BUFF_SIZE);
		long position=0;
		do {

			//read from sourve file to buffer starting at pos 0
			Future<Integer> futureReadResult = inChannel.read(dst, position);

			//if read returned nothing
			if(futureReadResult == null) {
				break;
			}


			int blocksRead = 0;

			blocksRead = futureReadResult.get();
			// needed to keep track of from which pos we need to read from
			//file everytime
			if(blocksRead <0 ) {
				//// no data is present or left to read from file
				break;
			}

			//whateevr is read from file to buffer, write it to a file
			//before writing set buffer postition to 0, because write now its at the end, we want 
			//all data to be written from beginning of the buffer
			//sets limit as position -> where data is ending, and position as 0
			dst.flip();
			Future<Integer> writeRes = outChannel.write(dst, position);
			//wait for write from buffer to file to complete, else ull end up updating positiob below
			//while file is still written and u will get invalid position update for buffer
			// at some point
			if(writeRes != null) {
				writeRes.get();
			}

			//and clear the buffer after wrtiting to file, to write new data to it by read channel.
			// Also increase the position to blocks read so that read happens from that place in file instead of 0 every time

			dst.clear();
			position = position+blocksRead;



		}while(true);
		inChannel.close();
		outChannel.close();



	}

}
