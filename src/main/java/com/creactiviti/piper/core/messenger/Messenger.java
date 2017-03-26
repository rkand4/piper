package com.creactiviti.piper.core.messenger;


/**
 * <p>Abstraction for sending messages between the various componentes of the application. 
 * Implementations are responsible for the guranteed delivery of the message.</p>
 * 
 * @author Arik Cohen
 * @since Jun 18, 2016
 */
public interface Messenger {

  void send (String aRoutingKey, Object aMessage);
  
}
