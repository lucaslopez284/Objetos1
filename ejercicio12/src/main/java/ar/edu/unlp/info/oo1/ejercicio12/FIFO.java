package ar.edu.unlp.info.oo1.ejercicio12;

import java.util.List;

public class FIFO implements Strategy {

	@Override
	public JobDescription next(List<JobDescription> jobs) {
		JobDescription nextJob = null;
        if (!jobs.isEmpty() && jobs != null) {
           nextJob = jobs.get(0);
        }
            
        return nextJob;
	}

}
