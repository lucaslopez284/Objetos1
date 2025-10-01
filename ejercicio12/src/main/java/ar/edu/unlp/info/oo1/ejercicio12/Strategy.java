package ar.edu.unlp.info.oo1.ejercicio12;

import java.util.*;

public interface Strategy {
  public JobDescription next(List<JobDescription> jobs);
}
