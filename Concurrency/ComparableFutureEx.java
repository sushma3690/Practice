package Concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ComparableFutureEx {

	static int getNum(int num) {
		return num*num;
	}
	//supplyAsync - returns CompletableFuture, completes job async, uses forkjoin.commonpool by default, but you can
	//mention your own exec
	//thenApply -> after prev jpb is done, complete stage
	//thenApplySync -> can provide custom pool
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		try {
		List<Integer> al = Arrays.asList(5,9,14); ///-> cf//  
		al.stream().map(num -> CompletableFuture.supplyAsync(() -> getNum(num))).map(CompletableFuture ->
		CompletableFuture.thenApply(n->n*n)).map(t->t.join()).forEach(s->System.out.println(s));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		CompletableFuture.supplyAsync(() ->  { return "blah";}).thenAccept(s -> System.out.println(s));
		CompletableFuture f = CompletableFuture.supplyAsync(() ->  { return "blah";}).thenApply(s -> {return s.charAt(0);})
				.thenRun(()->{System.out.println(" no relation with prev");});
		//System.out.println(f.get()); //b

		
		
	}
}
