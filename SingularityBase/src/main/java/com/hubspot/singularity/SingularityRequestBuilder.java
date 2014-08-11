package com.hubspot.singularity;

import java.util.List;

import com.google.common.base.Optional;

public class SingularityRequestBuilder {

  private final String id;

  private Optional<List<String>> owners;
  private Optional<Integer> numRetriesOnFailure;

  private Optional<String> schedule;
  private Optional<Boolean> daemon;

  private Optional<Integer> instances;
  private Optional<Boolean> rackSensitive;

  private Optional<Boolean> loadBalanced;

  private Optional<Long> killOldNonLongRunningTasksAfterMillis;

  public SingularityRequestBuilder(String id) {
    this.id = id;
    this.owners = Optional.absent();
    this.numRetriesOnFailure = Optional.absent();
    this.schedule = Optional.absent();
    this.killOldNonLongRunningTasksAfterMillis = Optional.absent();
    this.daemon = Optional.absent();
    this.instances = Optional.absent();
    this.rackSensitive = Optional.absent();
    this.loadBalanced = Optional.absent();
  }

  public SingularityRequest build() {
    return new SingularityRequest(id, owners, numRetriesOnFailure, schedule, daemon, instances, rackSensitive, loadBalanced, killOldNonLongRunningTasksAfterMillis);
  }

  public Optional<Boolean> getLoadBalanced() {
    return loadBalanced;
  }

  public SingularityRequestBuilder setLoadBalanced(Optional<Boolean> loadBalanced) {
    this.loadBalanced = loadBalanced;
    return this;
  }

  public String getId() {
    return id;
  }

  public Optional<List<String>> getOwners() {
    return owners;
  }

  public SingularityRequestBuilder setOwners(Optional<List<String>> owners) {
    this.owners = owners;
    return this;
  }

  public Optional<Integer> getNumRetriesOnFailure() {
    return numRetriesOnFailure;
  }

  public SingularityRequestBuilder setNumRetriesOnFailure(Optional<Integer> numRetriesOnFailure) {
    this.numRetriesOnFailure = numRetriesOnFailure;
    return this;
  }

  public Optional<String> getSchedule() {
    return schedule;
  }

  public SingularityRequestBuilder setSchedule(Optional<String> schedule) {
    this.schedule = schedule;
    return this;
  }

  public Optional<Boolean> getDaemon() {
    return daemon;
  }

  public SingularityRequestBuilder setDaemon(Optional<Boolean> daemon) {
    this.daemon = daemon;
    return this;
  }

  public Optional<Integer> getInstances() {
    return instances;
  }

  public SingularityRequestBuilder setInstances(Optional<Integer> instances) {
    this.instances = instances;
    return this;
  }

  public Optional<Boolean> getRackSensitive() {
    return rackSensitive;
  }

  public SingularityRequestBuilder setRackSensitive(Optional<Boolean> rackSensitive) {
    this.rackSensitive = rackSensitive;
    return this;
  }

  public Optional<Long> getKillOldNonLongRunningTasksAfterMillis() {
    return killOldNonLongRunningTasksAfterMillis;
  }

  public SingularityRequestBuilder setKillOldNonLongRunningTasksAfterMillis(Optional<Long> killOldNonLongRunningTasksAfterMillis) {
    this.killOldNonLongRunningTasksAfterMillis = killOldNonLongRunningTasksAfterMillis;
    return this;
  }

  @Override
  public String toString() {
    return "SingularityRequestBuilder [id=" + id + ", owners=" + owners + ", numRetriesOnFailure=" + numRetriesOnFailure + ", schedule=" + schedule + ", daemon=" + daemon + ", instances=" + instances + ", rackSensitive=" + rackSensitive
        + ", loadBalanced=" + loadBalanced + ", killOldNonLongRunningTasksAfterMillis=" + killOldNonLongRunningTasksAfterMillis + "]";
  }

}
