
package com.creactiviti.piper.core.metrics;

import java.util.Collection;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.PublicMetrics;
import org.springframework.boot.actuate.metrics.Metric;
import org.springframework.stereotype.Component;

import com.creactiviti.piper.core.annotations.ConditionalOnCoordinator;
import com.creactiviti.piper.core.job.JobRepository;


/**
 * a {@link PublicMetrics} implementaion which calculates 
 * the number of jobs currently running.
 * 
 * @author Arik Cohen
 * @since Apr 8, 2017
 */
@Component
@ConditionalOnCoordinator
public class RunningJobsMetrics implements PublicMetrics {

  @Autowired
  private JobRepository jobRepository;
  
  @Override
  public Collection<Metric<?>> metrics() {
    return Collections.singletonList(new Metric("jobs.running", jobRepository.countRunningJobs()));
  }

}
