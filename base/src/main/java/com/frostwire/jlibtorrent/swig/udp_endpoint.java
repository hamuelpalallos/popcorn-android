/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class udp_endpoint {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected udp_endpoint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(udp_endpoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_udp_endpoint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int port() {
    return libtorrent_jni.udp_endpoint_port(swigCPtr, this);
  }

  public String address() {
    return libtorrent_jni.udp_endpoint_address(swigCPtr, this);
  }

  public udp_endpoint() {
    this(libtorrent_jni.new_udp_endpoint(), true);
  }

}
