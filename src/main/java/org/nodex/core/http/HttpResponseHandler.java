package org.nodex.core.http;

/**
 * User: timfox
 * Date: 22/07/2011
 * Time: 12:19
 */
public abstract class HttpResponseHandler {
  public abstract void onResponse(HttpClientResponse response);
}
