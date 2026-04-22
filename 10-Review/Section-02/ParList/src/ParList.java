import java.util.ArrayList;
import java.util.List;

public class ParList<T> {
    ArrayList<T> list = new ArrayList<>();

    public ParList(List<T> list){
        this.list = new ArrayList<>(list);
    }

    public ArrayList<T> toList(){
        return this.list;
    }

    public ParList<T> applyFunc(Func<T> f){

        for(int i = 0; i < this.list.size(); i++){
            this.list.set(i, f.apply(this.list.get(i)));
        }
        return this;
    }

    public ParList<T> applyFuncPar(Func<T> f){
        int numThreads = Runtime.getRuntime().availableProcessors();
        System.out.println("Optimal Thread amount: " + numThreads);

        ArrayList<Thread> threads = new ArrayList<>();

        for(int threadIndex = 0; threadIndex < numThreads; threadIndex++){

            final int threadIndexCopy = threadIndex;
            Thread cur = new Thread(() -> {


                int jobsPerThread = this.list.size() / numThreads;
                int start = threadIndexCopy * jobsPerThread;
                int end = start + jobsPerThread;
                if(threadIndexCopy == numThreads - 1){
                    end = this.list.size();
                }

                for(int i = start; i < end; i ++){
                    T transformed = f.apply(list.get(i));
                    list.set(i, transformed);
                }
            });

            threads.add(cur);
            cur.start();
        }

        // for(int i = 0; i < threads.size(); i ++){
        //     try {
        //         threads.get(i).join();
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }
        // }

        threads.stream().forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });


        return this;
    }
}
