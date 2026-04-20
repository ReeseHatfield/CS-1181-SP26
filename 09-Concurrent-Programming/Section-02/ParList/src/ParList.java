import java.util.*;

public class ParList<T> {
    private ArrayList<T> list;

    public ParList(List<T> list){
        this.list = new ArrayList<T>(list);
    }


    public ParList<T> applyFunc(Func<T> f){

        for(int i = 0; i < this.list.size(); i++){
            this.list.set(i, f.apply(this.list.get(i)));
        }

        return this;
    }

    public ParList<T> applyFuncPar(Func<T> f)  {
        int numThreads = Runtime.getRuntime().availableProcessors();

        ArrayList<Thread> threads = new ArrayList<>(numThreads);

        for(int threadIndex = 0; threadIndex < numThreads; threadIndex ++){

            final int threadIndexCopy = threadIndex; 
            Thread cur = new Thread(() ->{

                int jobsPerThread = this.list.size() / numThreads;
                int start = jobsPerThread * threadIndexCopy;
                int end = (threadIndexCopy == numThreads - 1) ? list.size() : start + jobsPerThread; 
                for(int i = start; i < end; i++){
                    T transformed = f.apply(list.get(i));
                    list.set(i, transformed);
                }

            });

            threads.add(cur);
            cur.start();
        }
        
        // for(int i = 0; i < threads.size(); i++){
        //     threads.get(i).join();
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



    public List<T> toList(){
        return this.list;
    }
}
