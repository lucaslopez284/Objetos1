package ar.edu.unlp.info.oo1.ejercicio12;

import java.util.List;

public class LIFO implements Strategy{

	@Override
	public JobDescription next(List<JobDescription> jobs) {
		JobDescription nextJob = null;
        if (!jobs.isEmpty() && jobs != null) {
           nextJob = jobs.get(jobs.size() - 1);
        }
        return nextJob;
	}

}
