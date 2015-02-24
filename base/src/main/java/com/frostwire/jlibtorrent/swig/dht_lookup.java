/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class dht_lookup {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected dht_lookup(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(dht_lookup obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_dht_lookup(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setType(String value) {
    libtorrent_jni.dht_lookup_type_set(swigCPtr, this, value);
  }

  public String getType() {
    return libtorrent_jni.dht_lookup_type_get(swigCPtr, this);
  }

  public void setOutstanding_requests(int value) {
    libtorrent_jni.dht_lookup_outstanding_requests_set(swigCPtr, this, value);
  }

  public int getOutstanding_requests() {
    return libtorrent_jni.dht_lookup_outstanding_requests_get(swigCPtr, this);
  }

  public void setTimeouts(int value) {
    libtorrent_jni.dht_lookup_timeouts_set(swigCPtr, this, value);
  }

  public int getTimeouts() {
    return libtorrent_jni.dht_lookup_timeouts_get(swigCPtr, this);
  }

  public void setResponses(int value) {
    libtorrent_jni.dht_lookup_responses_set(swigCPtr, this, value);
  }

  public int getResponses() {
    return libtorrent_jni.dht_lookup_responses_get(swigCPtr, this);
  }

  public void setBranch_factor(int value) {
    libtorrent_jni.dht_lookup_branch_factor_set(swigCPtr, this, value);
  }

  public int getBranch_factor() {
    return libtorrent_jni.dht_lookup_branch_factor_get(swigCPtr, this);
  }

  public void setNodes_left(int value) {
    libtorrent_jni.dht_lookup_nodes_left_set(swigCPtr, this, value);
  }

  public int getNodes_left() {
    return libtorrent_jni.dht_lookup_nodes_left_get(swigCPtr, this);
  }

  public void setLast_sent(int value) {
    libtorrent_jni.dht_lookup_last_sent_set(swigCPtr, this, value);
  }

  public int getLast_sent() {
    return libtorrent_jni.dht_lookup_last_sent_get(swigCPtr, this);
  }

  public void setFirst_timeout(int value) {
    libtorrent_jni.dht_lookup_first_timeout_set(swigCPtr, this, value);
  }

  public int getFirst_timeout() {
    return libtorrent_jni.dht_lookup_first_timeout_get(swigCPtr, this);
  }

  public dht_lookup() {
    this(libtorrent_jni.new_dht_lookup(), true);
  }

}
