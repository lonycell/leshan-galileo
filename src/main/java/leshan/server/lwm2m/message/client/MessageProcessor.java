package leshan.server.lwm2m.message.client;

import leshan.server.lwm2m.message.LwM2mMessage;

/**
 * A visitor to process the incoming LW-M2M messages
 */
public interface MessageProcessor {

    LwM2mMessage process(RegisterMessage message);

}